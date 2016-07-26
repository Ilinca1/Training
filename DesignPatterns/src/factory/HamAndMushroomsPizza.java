package factory;

/**
 * Created by ivamesu on 7/22/2016.
 */
public class HamAndMushroomsPizza extends Pizza {
    @Override
    public void generatePizza() {
        type = PizzaTypes.HAM_AND_MUSHROOMS;
        price = 30.5;
        diameter = 20;
    }
}
