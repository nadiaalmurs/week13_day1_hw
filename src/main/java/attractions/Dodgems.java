package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.5;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12){
            return this.defaultPrice()/2;
        }
        return this.defaultPrice();
    }
}
