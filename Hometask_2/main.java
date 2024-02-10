package Hometask_2;

import Hometask_2.Subj.Subj;
import Hometask_2.Subj.Track;
import Hometask_2.Subj.Wall;
import Hometask_2.Sports_men.Cat;
import Hometask_2.Sports_men.Human;
import Hometask_2.Sports_men.Robot;
import Hometask_2.Status.Runner;

public class main {
    public static void main(String[] args) {
        Runner[] runner = {
                new Human("Mr.Bolt", 1000, 2),
                new Cat("Мышевский", 100, 1.5),
                new Robot("Элеонора", 150, 4),
        };

        Subj[] Subjs = {
                new Wall(1),
                new Track(92.5),
                new Wall(1.5),
                new Track(140.5),
                new Wall(2),
                new Track(167.5)
        };

        for (var Runner : runner) {
            for (var Subj : Subjs) {
                if (!Runner.getStatus().equals("Ok"))
                    break;
                if (Subj instanceof Track) {
                    Subj.overcoming(Runner);
                } else if (Subj instanceof Wall) {
                    Subj.overcoming(Runner);
                }
            }

            System.out.print("Испытуемый '" + Runner.getName());
            if (Runner.getStatus().equals("Ok")) {
                System.out.println("' испытание прошёл.\n");
            } else {
                System.out.println("' испытание бесславно провалил.\n");
            }
        }
    }
}
