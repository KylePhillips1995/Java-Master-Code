package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        EnhancedPlayer player = new EnhancedPlayer("Kyle", 50, "Sword");
        System.out.println("Kyle's Health is: " + player.getHealth());
//        Player player = new Player();
//        player.fullName = "Kyle";
//        player.health = 100;
//        player.weapon = "Sword";
//
//        int damage = 25;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        damage = 75;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
    }

}
