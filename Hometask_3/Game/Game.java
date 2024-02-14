package Hometask_3.Game;

import Hometask_3.Game.GameType.GameType;
import Hometask_3.Service.Answer;

public interface Game {
    void start(Integer wordSize, Integer tryCount, GameType gameType);

    void restart();

    Answer inputValue(String value);

    GameStatus getGameStatus();
}
