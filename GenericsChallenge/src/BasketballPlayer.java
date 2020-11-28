public class BasketballPlayer extends Player{

    private String preferredHand;
    public static final int LEFT_HAND = 1, RIGHT_HAND = 2;

    public BasketballPlayer(String name, int height, int role, int preferredHand) {
        super(name, height, role);

        switch (preferredHand) {
            case LEFT_HAND:
                this.preferredHand = "left";
                break;
            case RIGHT_HAND:
                this.preferredHand = "right";
                break;
            default:
                System.out.println("Invalid choice. Preferred hand set to right.");
                this.preferredHand = "right";
                break;
        }
    }

    public String getPreferredHand() {

        return preferredHand;
    }

    @Override
    public String toString() {

        return super.toString() + " / Preferred hand: " + preferredHand;
    }
}
