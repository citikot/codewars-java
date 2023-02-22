package hillel.decorator;

public class Espresso implements Coffee {

    @Override
    public void makeCoffee(){
        System.out.println("Espresso");
    }

    @Override
    public int cost(){
        return 3;
    }
}
