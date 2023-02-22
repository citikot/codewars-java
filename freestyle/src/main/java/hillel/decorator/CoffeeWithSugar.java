package hillel.decorator;

public class CoffeeWithSugar implements Coffee{

    Coffee coffee;
    public CoffeeWithSugar (Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public void makeCoffee(){
        coffee.makeCoffee();
        System.out.println("With sugar");
    }

    @Override
    public int cost(){
        return 2 + coffee.cost();
    }
}
