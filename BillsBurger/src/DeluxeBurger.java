public class DeluxeBurger extends BaseBurger {

    private double chipsPrice = 2.00;
    private double drinkPrice = 1.80;


    public DeluxeBurger(String breadType, String meatType, double basePrice) {
        super(breadType, meatType, basePrice);
    }

    @Override
    public void printBurgerStats() {

        System.out.println("Burger stats:\n------------------------ \nYour burger is made of " + this.getBreadType() + " bread with " +
                this.getMeatType() + " meat at the price of " +String.format("%.2f",this.getBasePrice()+this.getBreadPrice()+this.getMeatPrice()) + " BGN\n\n");
        System.out.println("The added drink and chips cost extra " + String.format("%.2f",chipsPrice+drinkPrice) + " BGN\n\n");

    }


}
