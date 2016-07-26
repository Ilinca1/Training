package factory;

/**
 * Created by ivamesu on 7/22/2016.
 */
public class TestFactory {

    public static void main(String[] args) {
        Pizza deluxe = PizzaFactory.getPizza(PizzaTypes.DELUXE);
        System.out.println("Pizza Deluxe: " + deluxe);

        Pizza ham = PizzaFactory.getPizza(PizzaTypes.HAM_AND_MUSHROOMS);
        System.out.println("Pizza Ham and Mushrooms: " + ham);

        Pizza prosciuto = PizzaFactory.getPizza(PizzaTypes.PROSCIUTO);
        System.out.println("Pizza Prosciuto: " + prosciuto);
    }
}
