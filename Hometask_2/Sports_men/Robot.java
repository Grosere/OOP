package Hometask_2.Sports_men;

import Hometask_2.Status.Meh;

public class Robot extends Meh {

    public Robot(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run(double distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Робот '" + name + "' пробежал дистанцию в " +
                    distance + " м.");
        } else {
            System.out.println("Робот '" + name + "' не пробежал дистанцию в " +
                    distance + " м.");
            this.status = "Not ok";
        }
    }

    @Override
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println("Робот '" + name + "' перепрыгнул стену в " +
                    height + " м.");
        } else {
            System.out.println("Робот '" + name + "' не перепрыгнул стену в " +
                    height + " м.");
            this.status = "Not ok";
        }
    }

    @Override
    public String getStatus() {
        return this.status;
    };

}