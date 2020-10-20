public class EnhancedPlayer {

    private String name;
    private String weapon;
    private int hitpoints;

    public EnhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;

        if (health > 0) {
            this.hitpoints = health;
        } else {
            this.hitpoints = 1;
        }

    }

    public void loseHealth(int damage) {

        this.hitpoints = this.hitpoints - damage;

        if (this.hitpoints <= 0) {

            System.out.println("Player got knocked out");
            //reduce number of lives
        }
    }

    public int healthRemaining() {

        return hitpoints;
    }
}
