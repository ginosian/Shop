import java.util.Scanner;

/**
 * Created by Martha on 05.03.15.
 */

/* Grel mi xanuti cragir vortex menu-um klinen hetevyal hramanner@`
        1. Avelacnel vajarox.
        2. Avelacnel apranq.
        3. Heracnel ashxatox.
        4. Heracnel apranq.
        5. Poxel ashxatoxi ashxatavardz@.
        6. Cucadrel ashxatoxneri informacianer@.
        7. Cucadrel apranaqneri informacianer@.
        8. Cucadrel amsakan maqur shrjanarutyun@ ev maqur shahuyt@, @ndunelov vor yuraqanchyur
        apranqic shahuyti tokos@ 20% e kazmum.
        9. Durs gal cragric.*/

public class Main {

     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

            Shop shop = null;
            Seller seller = null;
            Product product = null;

            menu(shop, seller, product);


    }

        public static void menu(Shop shop, Seller seller, Product product) {

                int userChoice = 0;

                do {
                        System.out.println("Choose the action");
                        System.out.println("1. Add seller");
                        System.out.println("2. Add product");
                        System.out.println("3. Remove seller");
                        System.out.println("4. Remove product");
                        System.out.println("5. Change salary");
                        System.out.println("6. Show sellers profiles");
                        System.out.println("7. Show products information");
                        System.out.println("8. Show income and profit");
                        System.out.println("9. Exit");
                        userChoice = scanner.nextInt();
                        if (userChoice == 9) {
                                return;
                        }
                        switch (userChoice) {
                                case 1:
                                        System.out.println("Enter the name, age and salary");
                                        if (shop == null) {
                                                seller = new Seller(scanner.next(), scanner.nextInt(), scanner.nextFloat());
                                                shop = new Shop();
                                                shop.addSeller(seller);
                                        } else {
                                                seller = new Seller(scanner.next(), scanner.nextInt(), scanner.nextFloat());
                                                shop.addSeller(seller);
                                        }
                                        break;

                                case 2:
                                        System.out.println("Enter the description, quantity and price");
                                        if (shop == null) {
                                                product = new Product(scanner.next(), scanner.nextDouble(), scanner.nextInt());
                                                shop = new Shop();
                                                shop.addProduct(product);
                                        } else  {
                                                product = new Product(scanner.next(), scanner.nextDouble(), scanner.nextInt());
                                                shop.addProduct(product);
                                        }
                                        break;
                                case 3:
                                        if (shop == null || shop.getSellers().size() == 0) {
                                                System.out.println("First add sellers and / or  products");
                                        }  else {
                                                shop.printSellerInfo();
                                                System.out.println("Choose which seller you want to remove");
                                                shop.removeSeller(shop.getSellers().get(scanner.nextInt() - 1));
                                        }
                                        break;
                                case 4:
                                        if (shop == null || shop.getProducts().size() == 0) {
                                                System.out.println("First add sellers and / or  products");
                                        }  else {
                                                shop.printProductInfo();
                                                System.out.println("Choose which product you want to remove");
                                                shop.removeProduct(shop.getProducts().get(scanner.nextInt() - 1));
                                        }
                                        break;
                                case 5:
                                        if (shop == null || shop.getSellers().size() == 0) {
                                                System.out.println("First add sellers and / or  products");
                                        }  else {
                                                shop.printSellerInfo();
                                                System.out.println("Choose seller to change the salary");
                                                System.out.println("Enter the sallary");
                                                shop.getSellers().get(scanner.nextInt() - 1).setSallary(scanner.nextFloat());
                                        }
                                        break;
                                case 6:
                                        if (shop == null || shop.getSellers().size() == 0) {
                                                System.out.println("First add sellers and / or  products");
                                        }  else {
                                                shop.printSellerInfo();
                                        }
                                        break;
                                case 7:
                                        if (shop == null || shop.getProducts().size() == 0) {
                                                System.out.println("First add sellers and / or  products");
                                        }  else {
                                                shop.printProductInfo();
                                        }
                                        break;
                                case 8:
                                        if (shop == null || shop.getProducts().size() == 0) {
                                                System.out.println("First add sellers and / or  products");
                                        }  else {
                                                double profitPercent = 0.2;
                                                shop.setProfitPercent(profitPercent);
                                                System.out.println("Income is " + shop.incomeCalculator() + " drams");
                                                System.out.println("Profit is " + shop.profitCalculator() + " drams");
                                        }
                                        break;

                        }

                }
                while (userChoice >= 1 && userChoice <=8);

        }



}
