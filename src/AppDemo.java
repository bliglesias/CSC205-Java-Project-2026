import java.util.Scanner;

public class AppDemo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        String userName;
        String choice;
        String[] choices;
        String prompt;
        double tip;
       

        //Objects
        Menu menu = new Menu();
        Customer customer = new Customer();


        //Intro
        System.out.println("======= Welcome to Java Bites =======");
        System.out.print("Enter your name:  ");
        userName = scanner.nextLine();

        System.out.println("Menu");
        menu.show();

        //Append to the list
        System.out.print("Select item numbers to add to cart (comma-separated): ");
        choice = scanner.nextLine();
        choices = choice.split(",");
        for (String x : choices) {
            customer.addItem(menu, Integer.parseInt(x.trim()));
        }
        
        // check bool: gluten
        customer.allergenCheck();
        System.out.print("Remove items that have gluten? ");
        prompt = scanner.nextLine();

        System.out.println("Updated cart: ");
        if(prompt.equalsIgnoreCase("yes")){
            customer.updateAllergens();
        }
        customer.show();

        System.out.println("Would you like to leave a tip?");
        prompt = scanner.nextLine();
        if(prompt.equalsIgnoreCase("yes")){
            System.out.println("Enter tip amount: ");
            tip = scanner.nextDouble();
            scanner.nextLine();
            customer.setTip(tip);
        }
        System.out.printf("\nReceipt for %s", userName);

        customer.showReceipt();
        System.out.println("Thanks for shopping with us!");
        
    }
}
