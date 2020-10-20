public class BaseBurger {

    private String breadType;
    private double breadPrice;
    private String meatType;
    private double meatPrice;
    private int lettuceQuantity;
    private int tomatoQuantity;
    private int carrotQuantity;
    private int extraSauceQuantity;
    private double burgerPrice;
    private double basePrice;
    private double lettucePrice=0.50;
    private double tomatoPrice=0.70;
    private double carrotPrice=0.40;
    private double saucePrice=0.30;

    public BaseBurger(String breadType, String meatType,double basePrice) {
        this.breadType=breadType;
        this.meatType=meatType;
        if (breadType.equals("white")) {

            this.breadPrice=1.1;
        } else if (breadType.equals("black")) {

            this.breadPrice=1.4;
        } else if (breadType.equals("corn")) {

            this.breadPrice=1.5;
        } else {

            this.breadPrice=1.1;
        }

        switch (meatType) {

            case "beef":
                meatPrice=2.3;
                break;
            case "pork":
                meatPrice=2.0;
                break;
            default:
                meatPrice=1.8;
                break;
        }

        if (basePrice<=0) {

            this.basePrice=0.5;
        } else {

            this.basePrice=basePrice;
        }

        this.lettuceQuantity=0;
        this.carrotQuantity=0;
        this.tomatoQuantity=0;
        this.extraSauceQuantity=0;
        burgerPrice=basePrice+breadPrice+meatPrice;
    }

    public void printBurgerStats() {

        System.out.println("Burger stats:\n------------------------ \nYour burger is made of " + breadType + " bread with " +
        meatType + " meat at the price of " +String.format("%.2f",burgerPrice) + " BGN\n\n");
        System.out.println("Additives:\n------------------------ \nExtra lettuce: "+lettuceQuantity+"\nExtra tomatoes: "+tomatoQuantity +
                "\nExtra carrots: "+carrotQuantity+"\nExtra sauce: "+extraSauceQuantity+"\n\n");
        burgerPrice+=lettuceQuantity*lettucePrice + tomatoQuantity*tomatoPrice + carrotQuantity*carrotPrice + extraSauceQuantity*saucePrice;
        System.out.println("Final price: "+ String.format("%.2f",burgerPrice));
    }

    public void addLettuceQuantity() {
        this.lettuceQuantity++;
    }

    public void addTomatoQuantity() {
        this.tomatoQuantity++;
    }

    public void addCarrotQuantity() {
        this.carrotQuantity++;
    }

    public void addExtraSauceQuantity() {
        this.extraSauceQuantity++;
    }

    public String getBreadType() {
        return breadType;
    }

    public double getBreadPrice() {
        return breadPrice;
    }

    public String getMeatType() {
        return meatType;
    }

    public double getMeatPrice() {
        return meatPrice;
    }

    public int getLettuceQuantity() {
        return lettuceQuantity;
    }

    public int getTomatoQuantity() {
        return tomatoQuantity;
    }

    public int getCarrotQuantity() {
        return carrotQuantity;
    }

    public int getExtraSauceQuantity() {
        return extraSauceQuantity;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBurgerPrice(double burgerPrice) {
        this.burgerPrice = burgerPrice;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public double getSaucePrice() {
        return saucePrice;
    }
}
