package factory;

/**
 * Created by ivamesu on 7/22/2016.
 */
public abstract class Pizza {

    protected PizzaTypes type;
    protected int diameter;
    protected double price;

    @Override
    public String toString() {
        return "Pizza{" +
                "type=" + type +
                ", diameter=" + diameter +
                ", price=" + price +
                '}';
    }

    public int getDiameter() {
        return diameter;
    }

    public PizzaTypes getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Pizza(){
        this.generatePizza();
    }

    public abstract void generatePizza();
}
