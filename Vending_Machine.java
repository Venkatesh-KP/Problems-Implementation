import java.util.Scanner;

public class Vending_Machine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Coffee");
        System.out.println("Tea");
        System.out.println("Beverages");
        System.out.println("Soups");
        String ch=input.next();
        switch (ch){
            case "c":
                System.out.println("1. Espresso Coffee\n" +
                        "2. Cappuccino Coffee\n" +
                        "3. Latte Coffee");
                int num=input.nextInt();
                switch (num){
                    case 1:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Cappuccino Coffee");
                        break;

                    case 2:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Espresso Coffee");
                        break;

                    case 3:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Latte Coffee");
                        break;

                    default:
                        System.out.println("INVALID OUTPUT!");
                }
                break;

            case "t":
                System.out.println("1.Plain Tea\n" +
                        "2. Assam Tea\n" +
                        "3. Ginger Tea\n" +
                        "4. Cardamom Tea\n" +
                        "5. Masala Tea\n" +
                        "6. Lemon Tea\n" +
                        "7. Green Tea\n" +
                        "8. Organic Darjeeling Tea\n");
                int num1=input.nextInt();
                switch (num1){
                    case 1:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Plain Tea");
                        break;

                    case 2:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Assam Tea");
                        break;

                    case 3:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Ginger Tea");
                        break;

                    case 4:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Cardamon Tea");
                        break;
                    case 5:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Masala Tea");
                        break;
                    case 6:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Lemon Tea");
                        break;
                    case 7:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Green Tea");
                        break;
                    case 8:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Organic Darjeeling Tea");
                        break;
                    default:
                        System.out.println("INVALID OUTPUT!");
                }
                break;

            case "s":
                System.out.println("1. Hot and Sour Soup\n" +
                        "2. Veg Corn Soup\n" +
                        "3. Tomato Soup\n" +
                        "4. Spicy Tomato Soup\n");
                int num2=input.nextInt();
                switch (num2){
                    case 1:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Hot and Sour Soup");
                        break;

                    case 2:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Veg Corn Soup");
                        break;

                    case 3:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Tomato Soup");
                        break;

                    case 4:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Spicy Tomato Soup");
                        break;

                    default:
                        System.out.println("INVALID OUTPUT!");
                }
                break;
            case "b":
                System.out.println("1. Hot Chocolate Drink\n" +
                        "2. Badam Drink\n" +
                        "3. Badam-Pista Drink\n");
                int num3=input.nextInt();
                switch (num3){
                    case 1:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Hot Chocolate Drink");
                        break;

                    case 2:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Badam Drink");
                        break;

                    case 3:
                        System.out.println("Welcome to CCD\n"+
                                "Enjoy your Badam-Pista Drink");
                        break;

                    default:
                        System.out.println("INVALID OUTPUT!");
                }
                break;
        }
    }
}
