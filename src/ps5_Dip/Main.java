package ps5_Dip;


interface CoffeeMachine {
    void brewCoffee();
}

class BasicCoffeeMachine implements CoffeeMachine {
    public void brewCoffee() {
        System.out.println("Brewing basic coffee");
    }
}

class PremiumCoffeeMachine implements CoffeeMachine {
    public void brewCoffee() {
        System.out.println("Brewing premium coffee");
    }
}

class CoffeeMaker {
    private CoffeeMachine coffeeMachine;

    public CoffeeMaker(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void makeCoffee() {
        coffeeMachine.brewCoffee();
    }
}

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(new BasicCoffeeMachine());
        coffeeMaker.makeCoffee();

        coffeeMaker = new CoffeeMaker(new PremiumCoffeeMachine());
        coffeeMaker.makeCoffee();
    }
}