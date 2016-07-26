package factory;

/**
 * Created by ivamesu on 7/22/2016.
 */
public class PizzaFactory {
    public static Pizza getPizza(PizzaTypes pizzaType){
        switch (pizzaType){
            case DELUXE:
                return new DeluxePizza();
            case HAM_AND_MUSHROOMS:
                return new HamAndMushroomsPizza();
            case PROSCIUTO:
                return new ProsciutoPizza();
            default:
                return null;
        }
    }
}
