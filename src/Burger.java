import java.util.ArrayList;

/**
 * Created by ac003588 on 7/24/2017.
 */
public class Burger {
    protected Double basePrice = 3.00;
    public String bun;
    public String meat;
    protected Integer maxExtras;
    protected Integer totalExtras;
    protected ArrayList al = new ArrayList();


    public Burger(String bun, String meat) {
        this.bun = bun;
        this.meat = meat;
        this.maxExtras = 4;
        this.totalExtras = 0;
    }

    public Burger() {
        this.bun = "white";
        this.meat = "beef";
        this.maxExtras = 4;
        this.totalExtras = 0;
    }

    public void addExtras(String extra) {
        if(totalExtras != maxExtras ) {
            al.add(extra);
            totalExtras += 1;
        } else System.out.println("Max items added");

    }
    public void removeExtras(String extra) {
        al.remove(extra);
        totalExtras -= 1;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public ArrayList getAl() {
        return al;
    }

    public Double getExtrasTotal() {
        Double totalExtras = (al.size() * .50);
        return totalExtras;
    }

    public Double getTotal() {
        Double total = (getExtrasTotal() + basePrice);
        return total;
    }

    public String getBun() {
        return bun;
    }

    public String getMeat() {
        return meat;
    }
}
