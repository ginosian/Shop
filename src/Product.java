/**
 * Created by Martha on 06.03.15.
 */
public class Product {

    // region Instance fields
    private String name;
    private double price;
    private int quantity;
    // endregion

    // region Constructors
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // endregion

    // region Member Methods
    public void printInfo (){
        System.out.println(name + "\t" + "quantity" + "\t" + quantity + "\t" + "price" + "\t" + price);
    }
    // endregion

    // region Setters and Getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // endregion
}
