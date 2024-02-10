package Hometask_2.Status;

public abstract class Runner {

    protected String name;
    protected String status = "Ok";
    protected double maxRunDistance;
    protected double maxJumpHeight;

    public String getName() {
        return name;
    }

    Runner(String name, double maxRunDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public abstract void run(double distance);

    public abstract void jump(double height);

    public abstract String getStatus();
}
