package factory;

/**
 * Created by ivamesu on 7/22/2016.
 */
public class ProsciutoPizza extends Pizza {
    @Override
    public void generatePizza() {
        type = PizzaTypes.PROSCIUTO;
        price = 35.5;
        diameter = 25;
    }
}
