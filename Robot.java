import java.security.PublicKey;

public class Robot implements Player, Let {


    @Override
    public void run() {
        System.out.println("Робот бежит");
    }
    @Override

    public void jump (){
        System.out.println("Робот прыгает");
    }

    @Override
    public void runTreadmill() {
        System.out.println("Robot справился с испытанием беговая дорожка");
    }

    @Override
    public void jumpWall() {
        System.out.println("Робот перепрыгнул через стену");
    }
}

