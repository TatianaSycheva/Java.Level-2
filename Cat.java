public class Cat implements Player, Let {

    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }

    @Override
    public void runTreadmill() {
        System.out.println("Кот справился с заданием Беговая дорожка");
    }

    @Override
    public void jumpWall() {
        System.out.println("Кот перепрыгнул через стену");
    }


}
