package factory;

/**
 * Created by ivamesu on 7/22/2016.
 */
public class DeluxePizza extends Pizza {
    @Override
    public void generatePizza() {
        type = PizzaTypes.DELUXE;
        price = 25.0;
        diameter = 20;
    }
}
