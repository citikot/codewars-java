package hillel.decorator;

public class Runner {
    public static void main(String[] args) {
        Coffee coffee = new Americano();
        coffee = new CoffeeWithSugar(coffee);
        coffee = new CoffeeWithLemon(coffee);
        coffee = new CoffeeWithSugar(coffee);
        coffee.makeCoffee();
        System.out.println(coffee.cost());
    }
}
