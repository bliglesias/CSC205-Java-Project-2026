import java.util.InputMismatchException;
import java.util.Scanner;

public class AppDemo {
    public static void main(String[] args) throws Exception {
        //Objects
        Menu menu = new Menu();
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        String userName;
        String choice;
        String[] csvString;
       
        //Intro
        System.out.println("======= Welcome to Java Bites =======");

        // Username
        System.out.print("\nEnter your name: ");
        userName = scanner.nextLine();
        
        menu.show();

        // APPEND THE LIST
        System.out.print("Select item numbers to add to cart (comma-separated) ");
        // try here
        boolean checkFlag = false;
        while(!checkFlag){
            try {
                choice = scanner.nextLine();
                csvString = choice.split(",");

                for (String filter : csvString) {
                customer.append(menu, Integer.parseInt(filter.trim()));
                }
                //break out of the loop
                checkFlag = true;
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("You may have misplaced that comma. Try Again");
                System.out.print("Select item numbers to add to cart (comma-separated) ");
            }
            catch (Exception e) {
                System.out.println("New error: " + e.getMessage());
                break;
            }
        }
        
        //Gluten check
        customer.showGlutenOrder();
        System.out.print("\nThese items have gluten! Remove items containing gluten? ");
        choice = scanner.nextLine();
        customer.delete(choice);
        
        // prompt for tip
        System.out.print("Would you like to leave a tip?: ");
        choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("yes")){
            System.out.print("Enter tip amount: ");
            double tip = scanner.nextDouble();
            scanner.nextLine();
            customer.addTip(tip);
        }
        scanner.close();

        //Receipt
        customer.checkout(userName);
        System.out.println("Thanks for shopping with us!");
        
    }
}
