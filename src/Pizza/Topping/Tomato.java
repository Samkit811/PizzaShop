package Pizza.Topping;

import Pizza.PizzaType.BasePizza;

public class Tomato extends ToppingDecorator{
    BasePizza pizza;

    public Tomato(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
