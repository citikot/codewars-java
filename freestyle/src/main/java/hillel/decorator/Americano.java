package hillel.decorator;

public class Americano implements Coffee {

    @Override
    public void makeCoffee(){
        System.out.println("Americano");
    }

    @Override
    public int cost(){
        return 5;
    }
}
