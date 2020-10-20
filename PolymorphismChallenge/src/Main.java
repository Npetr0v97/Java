class Car {

    private String engine;
    private int numberOfCylinders;
    private int numberOfWheels;

    public Car(String engine, int numberOfCylinders) {

        this.engine = engine;

        if (numberOfCylinders < 1 || numberOfCylinders > 8) {

            this.numberOfCylinders = 1;
        } else {

            this.numberOfCylinders = numberOfCylinders;
        }
        this.numberOfWheels = 4;
    }

    public String getEngine() {

        return engine;
    }

    public int getNumberOfCylinders() {

        return numberOfCylinders;
    }

    public int getNumberOfWheels() {

        return numberOfWheels;
    }

    public void startEngine() {

        System.out.println("The Car's engine was started");
    }
    public void accelerate() {

        System.out.println("The car is accelerating");
    }
    public void brake() {

        System.out.println("The car is braking");
    }
}

class Skoda extends Car {

    public Skoda(String engine, int numberOfCylinders) {

        super(engine, numberOfCylinders);
    }

    public void startEngine() {

        System.out.println("The Skoda's engine was started");
    }
    public void accelerate() {

        System.out.println("The Skoda is accelerating");
    }
    public void brake() {

        System.out.println("The Skoda is braking");
    }
}

class Audi extends Car {

    public Audi(String engine, int numberOfCylinders) {

        super(engine, numberOfCylinders);
    }

    public void startEngine() {

        System.out.println("The Audi's engine was started");
    }
    public void accelerate() {

        System.out.println("The Audi is accelerating");
    }
    public void brake() {

        System.out.println("The Audi is braking");
    }
}

class UnknownModel extends Car {

    public UnknownModel() {

        super("unknown", 2);
    }

}


public class Main {

    public static void main(String[] args) {

        for (int i=1; i<10 ; i++) {

            Car currentCar = randomCar();
            currentCar.startEngine();
            currentCar.accelerate();
            currentCar.brake();
            System.out.println("-------------------------");
        }
    }

    public static Car randomCar() {



            int randomNumber = (int) (Math.random() * 3 + 1);
        System.out.println("Car: "+randomNumber);
            switch (randomNumber) {

                case 1:
                    return new Skoda("2.0 TDI", 4);

                case 3:
                    return new UnknownModel();

                case 2:
                    return new Audi("4.0 TDI", 8);
            }

            return null;

    }
}
