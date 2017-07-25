import javax.sound.midi.Soundbank;

/**
 * Created by ac003588 on 7/21/2017.
 */
public class Main {
    public static void main(String[] args) {
        // I should create an Order class, each instantiated object will be an order
        // An order has burgers
        // A burger HAS A(n) Item
        // A healthy burger IS A hamburger
        // A Deluxe Burter IS A burger
        // Encapsulate the items with setters, a count of items cannot be exceeded (item count/item max?)
//        Burger burger1 = new Burger("white", "Beef");
//        burger1.addTopping("lettuce");
//        System.out.println(burger1.getToppingsList());
//        burger1.addTopping("Tomato");
//        burger1.addTopping("Onion");
//        burger1.addTopping("ketchup");
//        burger1.addTopping("mustard");
//        System.out.println(burger1.getToppingsList());

//        Burger burger1 = new Burger("White", "Beef");
//        burger1.addExtras("lettuce");
//        burger1.addExtras("tomato");
//        burger1.addExtras("onion");
//        burger1.addExtras("mushroom");
//        burger1.addExtras("cheese");
//        System.out.println(burger1.getAl());
//        System.out.println("Burger: " + "$" + burger1.getBasePrice());
//        System.out.println("Extras: " + burger1.getAl() + "$" + burger1.getExtrasTotal())
//        System.out.println("Total: " + "$" + burger1.getTotal());
//        burger1.removeExtras("mushroom");
//        System.out.println(burger1.getAl());
//
//        Burger burger2 = new Healthy("beef");
//        burger2.getBun();
//        burger2.addExtras("tomato");
//        System.out.println(burger2.getAl());
//        System.out.println(burger2.getExtrasTotal());
//        System.out.println(burger2.getTotal());

//        Burger burger3 = new Deluxe("white", "Angus");
//        burger3.addExtras("Tomato");
//        burger3.addExtras("onion");
//        burger3.addExtras("lettuce");
//        burger3.addExtras("mushroom");
//        System.out.println(burger3.getAl());
//        burger3.addExtras("cheese");

        Burger burger1 = new Burger();
        Order order1 = new Order();
        order1.addItem(burger1);
        burger1.addExtras("lettuce");
        // order1.calculateTotal();
        burger1.getAl();
        Burger burger2 = new Healthy("Beef");
        order1.addItem(burger2);
        order1.calculateTotal();
    }
}
