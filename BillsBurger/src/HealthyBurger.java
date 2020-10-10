public class HealthyBurger extends BaseBurger {

    private int eggsQuantity;
    private double eggsPrice=1.2;
    private int picklesQuantity;
    private double picklesPrice=0.9;

    public HealthyBurger(String meatType, double basePrice){

        super("black",meatType,basePrice);
        eggsQuantity=0;
        picklesQuantity=0;
    }

    @Override
    public void printBurgerStats(){

        System.out.println("Burger stats:\n------------------------ \nYour burger is made of " + this.getBreadType()+" bread with " +
                this.getMeatType() + " meat at the price of " +String.format("%.2f",this.getBasePrice()+this.getBreadPrice() + this.getMeatPrice()) + " BGN\n\n");
        System.out.println("Additives:\n------------------------ \nExtra lettuce: "+this.getLettuceQuantity()+"\nExtra tomatoes: "+this.getTomatoQuantity() +
                        "\nExtra carrots: "+this.getCarrotQuantity()+"\nExtra sauce: "+this.getExtraSauceQuantity()+"\nExtra eggs:"+ eggsQuantity+
                "\nExtra pickles: "+picklesQuantity+"\n\n");
        this.setBurgerPrice(this.getBasePrice()+this.getBreadPrice() + this.getMeatPrice());
        this.setBurgerPrice(this.getBurgerPrice()+this.getLettuceQuantity()*this.getLettucePrice()+
                this.getTomatoPrice()*this.getTomatoQuantity()+
                this.getCarrotPrice()*this.getCarrotQuantity()+
                this.getSaucePrice()*this.getExtraSauceQuantity()+
                eggsQuantity*eggsPrice+picklesQuantity*picklesPrice);
        System.out.println("Final price: "+String.format("%.2f",this.getBurgerPrice()));

    }

    public void addEggsQuantity() {
        this.eggsQuantity++;
    }

    public void addPicklesQuantity() {
        this.picklesQuantity++;
    }

    public int getEggsQuantity() {
        return eggsQuantity;
    }

    public double getEggsPrice() {
        return eggsPrice;
    }

    public int getPicklesQuantity() {
        return picklesQuantity;
    }

    public double getPicklesPrice() {
        return picklesPrice;
    }
}