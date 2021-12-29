import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
	    Player[] players = {
	            new Human(),
	            new Robot(),
	            new Cat()
        };


        for (Player player : players) {
            player.run();
            player.jump();
            player.runTreadmill();
            player.jumpWall();

        }

        /** Let[] lets = {
                new Treadmill(),
                new Wall()
         };

         for (Let let : lets) {
            player.let();
         } */

        // до меня пока не доходит, как сделать так, чтобы можно
        // было создать массив препядствий
        // (для этого нужно, чтобы стена и беговая дорожка были классами),
        // оно очень близко, но я не понимаю ((

    }

}
