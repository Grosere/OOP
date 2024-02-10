package Hometask_2.Subj;

import Hometask_2.Status.Runner;

public class Track extends Subj {
    private final double distance;

    public Track(double distance) {
        this.distance = distance;
    }

    @Override
    public void overcoming(Runner runner) {
        runner.run(distance);
    }
}
