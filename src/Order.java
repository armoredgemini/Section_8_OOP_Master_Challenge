import java.util.ArrayList;
import java.util.List;

/**
 * Created by ac003588 on 7/25/2017.
 */
public class Order {
    // An order has items
    // An order calculates total of all burgers

    private Burger theBurger;
    List<Burger> totalItems = new ArrayList<Burger>();

//    public Order () {
//        this.theBurger = theBurger;
//    }

    private Burger getTheBurger() {
        return theBurger;
    }

    public void addItem(Burger theBurger)  {
       totalItems.add(theBurger);
    }

    public Double calculateTotal() {
        Double total = 0.00;
        for ( Burger b: totalItems  ) {
            System.out.println("Total for " + b + ": " + b.getTotal());
            total = (total + b.getTotal());
        }
        System.out.println("Total for all items: " + total);
        return total;

    }
}
