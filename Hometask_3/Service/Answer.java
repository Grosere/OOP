package Hometask_3.Service;

import Hometask_3.Game.Game;
import Hometask_3.Game.GameStatus;

public class Answer {
    private final int cowCounter;
    private final int bullCounter;
    private final Integer tryCount;
    private final GameStatus gameStatus;
    private final String rightWord;

    public Answer(int cowCounter, int bullCounter, Integer tryCount, GameStatus gameStatus, String rightWord) {
        this.cowCounter = cowCounter;
        this.bullCounter = bullCounter;
        this.tryCount = tryCount;
        this.rightWord = rightWord;
        this.gameStatus = gameStatus;
    }

    @Override
    public String toString() {
        String message = "Коров: " + cowCounter + ", " +
                "быков: " + bullCounter + ", " +
                "осталось попыток: " + tryCount;
        if (gameStatus.equals(GameStatus.WIN)) {
            message += "\nИгрок выиграл. Правильным словом было: " + this.rightWord + "\n";
        }
        if (gameStatus.equals(GameStatus.LOSE)) {
            message += "\nИгрок проиграл. Правильным словом было: " + this.rightWord + "\n";
        }

        return message;
    }
}
