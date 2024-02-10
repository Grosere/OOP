package Hometask_2.Subj;

import Hometask_2.Status.Runner;

public class Wall extends Subj {
    private final double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public void overcoming(Runner runner) {
        runner.jump(height);
    }
}
