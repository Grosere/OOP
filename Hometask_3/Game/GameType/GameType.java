package Hometask_3.Game.GameType;

public enum GameType {
    NUMBERS {
        public String getType() {
            return "числа";
        }
    },
    CYRILLIC {
        public String getType() {
            return "кириллические буквы";
        }
    },
    LATIN {
        public String getType() {
            return "латинские буквы";
        }
    };

    public abstract String getType();
}
