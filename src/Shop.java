import java.util.ArrayList;

/**
 * Created by Martha on 06.03.15.
 */
public class Shop {

    // region Instance Fields
    private ArrayList <Seller> sellers;
    private ArrayList <Product> products;
    private double profitPercent;
    // endregion

    // region Constructors
    public Shop() {
        sellers = new ArrayList<Seller>();
        products = new ArrayList<Product>();
    }
    // endregion

    // region Member Methods
    public void printSellerInfo (){
        for (int i = 0; i < sellers.size(); i++){
            System.out.print(i + 1 + ". ");
            sellers.get(i).printInfo();
            System.out.println();
        }
    }

    public void printProductInfo (){
        for (int i = 0; i < products.size(); i++){
            System.out.print(i + 1 + ". ");
            products.get(i).printInfo();
            System.out.println();
        }
    }

    public boolean addSeller (Seller seller){
        if (seller != null){
            sellers.add(seller);
            return true;
        }
        return false;
    }

    public boolean removeSeller (Seller seller){
        if (seller != null){
            if (sellers.remove(seller)){
                return true;
            }
        }
        return false;
    }

    public boolean addProduct (Product product){
        if (product != null){
            products.add(product);
            return true;
        }
        return false;
    }

    public boolean removeProduct (Product product){
        if (product != null){
            if(products.remove(product)){
                return true;
            }
        }
        return false;
    }

    public double incomeCalculator(){
        if (products == null){
            return 0;
        }
        double incomeSum = 0;
        for (int i = 0; i < products.size(); i++ ){
            incomeSum += products.get(i).getQuantity() * products.get(i).getPrice();
        }
        return incomeSum;
    }

    public double profitCalculator (){
        if (products == null) {
            return 0;
        }
        double profitSum = 0;
        for (int i = 0; i < products.size(); i++) {
            profitSum += products.get(i).getQuantity() * (products.get(i).getPrice() * profitPercent);
        }
        return profitSum;
    }

    // endregion

    // region Setters and Getters


    public ArrayList<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(ArrayList<Seller> sellers) {
        this.sellers = sellers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getProfitPercent() {
        return profitPercent;
    }

    public void setProfitPercent(double profitPercent) {
        this.profitPercent = profitPercent;
    }
    // endregion
}
