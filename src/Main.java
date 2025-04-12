import Pizza.PizzaType.BasePizza;
import Pizza.PizzaType.Margherita;
import Pizza.Topping.ExtraCheese;

public class Main {

    public static void main(String[] args){

        BasePizza pizza = new Margherita();
        System.out.println("Margherita cost: " + pizza.cost());

        pizza = new ExtraCheese(pizza);
        System.out.println("Margherita with Extra cheese: " + pizza.cost());

    }
}
