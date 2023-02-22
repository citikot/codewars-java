package hillel.decorator;

public class CoffeeWithLemon implements Coffee{

    Coffee coffee;
    public CoffeeWithLemon(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public void makeCoffee(){
        coffee.makeCoffee();
        System.out.println("With lemon");
    }

    @Override
    public int cost(){
        return 1 + coffee.cost();
    }
}
