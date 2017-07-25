import java.util.ArrayList;

/**
 * Created by ac003588 on 7/25/2017.
 */
public class Deluxe extends Burger {

    ArrayList al2 = new ArrayList();

    public Deluxe(String bun, String meat) {
        super();
        al2.add("drink");
        al2.add("chips");
        this.bun = bun;
        this.meat = meat;

    }
//    public void addExtras(String extra) {
//        if(totalExtras < 4) {
//            al.add(extra);
//            totalExtras += 1;
//        }
//    }

    public ArrayList getAl() {
        ArrayList al3 = new ArrayList();
        al3.addAll(al);
        al3.addAll(al2);
        return al3;
    }

    public Double getExtrasTotal() {
        Double totalExtras = (al.size() * .50);
        totalExtras = totalExtras + (al2.size() * 1.00);
        return totalExtras;
    }
}
