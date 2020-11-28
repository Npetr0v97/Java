public class Player {

    private String name;
    private int height;
    public static final int ATTACKER = 1, MIDFIELDER = 2, DEFENDER = 3;
    private String role;

    public Player(String name, int height, int role) {

        this.name = name;
        if (height < 90 || height > 280) {

            System.out.println("The chosen height is to big. Height set to 180.");
            this.height = 180;
        } else {

            this.height = height;
        }

        switch (role) {

            case 1:
                this.role = "Attacker";
                break;
            case 2:
                this.role = "Midfielder";
                break;
            case 3:
                this.role = "Defender";
                break;
            default:
                System.out.println("Invalid role chosen. Set to Midfielder by default.");
                this.role = "Midfielder";
                break;
        }
    }

    public String getName() {

        return name;
    }

    public String getRole() {

        return role;
    }

    public int getHeight() {

        return height;
    }

    @Override
    public String toString() {

        return "Name: " + name + " - " + role + "/ Height: " + height;
    }
}
