package factory;

public class Korean_PizzaStrore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType){
            case HAI_SAN -> {
                return new Korean_HaisanPizza();
            }
        }
        return null;
    }
}
