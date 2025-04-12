package Pizza.Topping;

import Pizza.PizzaType.BasePizza;

public class ExtraChess extends ToppingDecorator {

    BasePizza pizza;

    ExtraChess(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 30;
    }
}
