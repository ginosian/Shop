/**
 * Created by Martha on 06.03.15.
 */
public class Product {

    // region Instance fields

    private String name;
    private double price;
    private int qunatity;

    // endregion

    // region Constructors

    public Product(String name, double price, int qunatity) {
        this.name = name;
        this.price = price;
        this.qunatity = qunatity;
    }

    // endregion

    // region Member Methods

    public void printInfo (){
        System.out.println(name + "\t" + "quantity" + "\t" + qunatity + "\t" + "price" + "\t" + price);
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

    public int getQunatity() {
        return qunatity;
    }

    public void setQunatity(int qunatity) {
        this.qunatity = qunatity;
    }

    // endregion
}
