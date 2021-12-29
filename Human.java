import java.sql.SQLOutput;

public class Human implements Player, Let {

    @Override
    public void jump() {
        System.out.println("Человек бежит");
    }

    @Override
    public void run() {
        System.out.println("Человек прыгает");

    }


    @Override
    public void runTreadmill() {
        System.out.println("Человек справился с испытанием беговая дорожка");
    }

    @Override
    public void jumpWall() {
        System.out.println("Человек перепрыгнул через стену");
    }
}

