public class Main {

    public static void main(String[] args) {

/*        Player player = new Player();

        player.health = 1000;
        player.name = "Nikolay";
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());

        player.loseHealth(1000);
        System.out.println("Remaining health: " + player.healthRemaining());*/

        EnhancedPlayer player = new EnhancedPlayer("Nikolay", "sword", 50);

        System.out.println("Initial health is " + player.healthRemaining());
    }
}
