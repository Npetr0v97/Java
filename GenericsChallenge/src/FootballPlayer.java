public class FootballPlayer extends Player {

    public static final int LEFT_FOOT = 1, RIGHT_FOOT = 2;
    private String preferredFoot;

    public FootballPlayer(String name, int height, int role, int preferredFoot) {


        super(name, height, role);

        switch (preferredFoot) {

            case LEFT_FOOT:
                this.preferredFoot = "left";
                break;
            case RIGHT_FOOT:
                this.preferredFoot = "right";
                break;
            default:
                System.out.println("Invalid choice. Preferred foot set to right.");
                this.preferredFoot = "right";
                break;
        }
    }

    private String getPreferredFoot() {

        return preferredFoot;
    }

    @Override
    public String toString() {

        return super.toString() + " / Preferred foot: " + preferredFoot;
    }
}
