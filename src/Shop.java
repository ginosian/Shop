import java.util.ArrayList;

/**
 * Created by Martha on 06.03.15.
 */
public class Shop {

    // region Instance Fields

    private ArrayList <Seller> sellers;
    private ArrayList <Product> products;

    // endregion

    // region Constructors

    public Shop() {
       sellers = new ArrayList<Seller>();
        products = new ArrayList<Product>();
    }

    // endregion

    // region Member Methods

    public void printSellerInfo (){
        if (sellers.size() == 0){
            return;
        }

        for (int i = 0; i< sellers.size(); i++){
            System.out.print(i + 1 + ". ");
            sellers.get(i).printInfo();
            System.out.println();
        }
    }

    public void printProductInfo (){
        if(products.size() == 0){
            return;
        }

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

    public double incomeCalculator(ArrayList <Product> products){
        if (products != null){
            return 0;
        }

        int incomeSum = 0;
        for (int i = 0; i < products.size(); i++ ){
            incomeSum += products.get(i).getQunatity()*products.get(i).getPrice();
        }

        return incomeSum;
    }

    public double profitCalculator (ArrayList <Product> products){
        if (products != null){
            return 0;
        }
        int profitSum = 0;
        for (int i = 0; i < products.size(); i++){
            profitSum += products.get(i).getQunatity() * (products.get(i).getPrice()*0.2);
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

    // endregion
}
