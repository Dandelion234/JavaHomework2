package hw;

public class Cookie {
    private double price;
    private double priceOfChocolate;
    private double priceOfTer;

    public Cookie(double priceOfChocolate, double priceOfTer) {

        this.priceOfChocolate = priceOfChocolate;
        this.priceOfTer = priceOfTer;
        price=priceOfChocolate+priceOfTer;
    }

    public double getPriceOfChocolate() {
        return priceOfChocolate;
    }

    public void setPriceOfChocolate(double priceOfChocolate) {
        this.priceOfChocolate = priceOfChocolate;
    }

    public double getPriceOfTer() {
        return priceOfTer;
    }

    public void setPriceOfTer(double priceOfTer) {
        this.priceOfTer = priceOfTer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void print(){
        price=priceOfChocolate+priceOfTer;
        System.out.println(price);
    }
}
