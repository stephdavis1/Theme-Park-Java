package attractions;

import behaviours.ITicketed;
import people.Visitor;


public class Dodgems extends Attraction implements ITicketed{

    private double price;

    public Dodgems(String name, int rating) {

        super(name, rating);
        this.price = 4.50;
    }

    @Override
    public double defaultPrice() {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor == null){
            return 0.00;
        }
        if(visitor.getAge() < 12){
            return (defaultPrice() / 2);
        }
        else{
            return defaultPrice();
        }
    }


}
