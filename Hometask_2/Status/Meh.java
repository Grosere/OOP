package Hometask_2.Status;

public abstract class Meh extends Runner {
    protected String sportsmanType = "Meh";

    public Meh(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
        sportsmanType = "Meh";
    }

    public abstract void run(double distance);

    public abstract void jump(double height);

    public abstract String getStatus();

    {
    }
}
