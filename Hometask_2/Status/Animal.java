package Hometask_2.Status;

public abstract class Animal extends Runner {
    protected String sportsmanType = "Animal";

    public Animal(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
        sportsmanType = "Animal";
    }

    public abstract void run(double distance);

    public abstract void jump(double height);

    public abstract String getStatus();

}