package Hometask_3;

import Hometask_3.Game.AbstractGame;
import Hometask_3.Game.GameStatus;
import Hometask_3.Game.GameType.CyrillicCharGame;
import Hometask_3.Game.GameType.GameType;
import Hometask_3.Game.GameType.LatinCharGame;
import Hometask_3.Game.GameType.NumberCharGame;
import Hometask_3.Service.Answer;
import Hometask_3.Service.Initialization;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Initialization init = new Initialization();

        AbstractGame ag = switch (init.getGameType()) {
            case GameType.CYRILLIC -> new CyrillicCharGame();
            case GameType.LATIN -> new LatinCharGame();
            default -> new NumberCharGame();
        };
        ag.start(init.getWorldSize(),
                init.getTryCount(),
                init.getGameType());

        Scanner sc = new Scanner(System.in);
        while (!ag.getGameStatus().equals(GameStatus.EXIT)) {
            System.out.println("Введите новое значение, либо " +
                    "'s' для просмотра статистики, " +
                    "'r' - для рестарта игры, " +
                    "'e' - для выхода");
            String inputtedValue = sc.nextLine();
            if (inputtedValue.equals("s")) {
                ag.getLoggerHistory();
                continue;
            }
            if (inputtedValue.equals("r")) {
                ag.restart();
                continue;
            }
            if (inputtedValue.equals("e")) {
                ag.exit();
                continue;
            }

            Answer answer = ag.inputValue(inputtedValue);
            System.out.println(answer);

            if (ag.getGameStatus().equals(GameStatus.WIN) ||
                    ag.getGameStatus().equals(GameStatus.LOSE)) {
                ag.restart();
            }
        }

        sc.close();
    }
}