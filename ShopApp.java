import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) throws Exception {
        String[] productsSold = { "TV", "Sofa", "Iphone", "Sneakers", "Ball" };
        Product prod1 = new Product(productsSold[0], 50, 499.99);
        Product prod2 = new Product(productsSold[1], 30, 299.99);
        Product prod3 = new Product(productsSold[2], 100, 399.99);
        Product prod4 = new Product(productsSold[3], 800, 500.99);
        Product prod5 = new Product(productsSold[4], 20, 100.99);
        int ch, ch1;
        double ch2;
        Scanner sc = new Scanner(System.in);
        System.out.println("***Welcome to U2110159's Shopping Application***");
        System.out.println("Please Make a choice to proceed: ");
        System.out.println("1. display all products");
        System.out.println("2. buy stock");
        System.out.println("3. sell stock");
        System.out.println("4. re-price an item of stock");
        System.out.println("5. display the total value of all stock in the shop");
        System.out.println("6. exit application");
        lp: while (true) {
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Option Chosen: display all products");
                    for (int i = 0; i <= productsSold.length; i++) {
                        System.out.println(productsSold[i]);
                    }
                    break;
                case 2:
                    System.out.println("Option Chosen: buy stock");
                    System.out.println("Which product would you like to buy? \n");
                    ch1 = sc.nextInt();
                    if (ch1 == 1) {
                        System.out.println("You chose to buy " + productsSold[0] + " Remaining Stock : "
                                + prod1.buyStock(prod1.getStocklevel()));
                    } else if (ch1 == 2) {
                        System.out.println("You chose to buy " + productsSold[1] + " Remaining Stock : "
                                + prod2.buyStock(prod2.getStocklevel()));
                    } else if (ch1 == 3) {
                        System.out.println("You chose to buy " + productsSold[2] + " Remaining Stock : "
                                + prod3.buyStock(prod3.getStocklevel()));
                    } else if (ch1 == 4) {
                        System.out.println("You chose to buy " + productsSold[3] + " Remaining Stock : "
                                + prod4.buyStock(prod4.getStocklevel()));
                    } else if (ch1 == 5) {
                        System.out.println("You chose to buy " + productsSold[4] + " Remaining Stock : "
                                + prod5.buyStock(prod5.getStocklevel()));
                    }
                    break;
                case 3:
                    System.out.println("Option Chosen: sell stock");
                    System.out.println("Which product would you like to sell? \n");
                    ch1 = sc.nextInt();
                    if (ch1 == 1) {
                        System.out.println("You chose to sell " + productsSold[0] + " Remaining Stock : "
                                + prod1.sell(prod1.getStocklevel()));
                    } else if (ch1 == 2) {
                        System.out.println("You chose to sell " + productsSold[1] + " Remaining Stock : "
                                + prod2.sell(prod2.getStocklevel()));
                    } else if (ch1 == 3) {
                        System.out.println("You chose to sell " + productsSold[2] + " Remaining Stock : "
                                + prod3.sell(prod3.getStocklevel()));
                    } else if (ch1 == 4) {
                        System.out.println("You chose to sell " + productsSold[3] + " Remaining Stock : "
                                + prod4.sell(prod4.getStocklevel()));
                    } else if (ch1 == 5) {
                        System.out.println("You chose to sell " + productsSold[4] + " Remaining Stock : "
                                + prod5.sell(prod5.getStocklevel()));
                    }
                    break;
                case 4:
                    System.out.println("Option Chosen: re-price an item of stock");
                    System.out.println("Which product would you like to re-price? \n");
                    ch1 = sc.nextInt();
                    if (ch1 == 1) {
                        System.out.println("You chose to re-price " + productsSold[0] + ". Previous price: "
                                + prod1.getPrice() + ". New price: ");
                        ch2 = sc.nextDouble();
                        prod1.setPrice(ch2);
                        System.out.println("The product has been re-priced! New price: " + prod1.getPrice());
                    } else if (ch1 == 2) {

                    } else if (ch1 == 3) {

                    } else if (ch1 == 4) {

                    } else if (ch1 == 5) {

                    }
                    break;
                case 5:
                    System.out.println("Option Chosen: display the total value of all stock in the shop");
                    System.out.println("Total products value: " + (prod1.getPrice() + prod2.getPrice()
                            + prod3.getPrice() + prod4.getPrice() + prod5.getPrice()) + "£");
                    break;
                case 6:
                    System.out.println("Goodbye");
                    break lp;
                default:
                    System.out.println("Wrong Choice, please try again! \n\n");
            }
        }
    }
}
