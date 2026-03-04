import java.util.ArrayList;

public class Order {
    private ArrayList<menuItems> customerOrder = new ArrayList<>();

    public Order(){
        customerOrder.add(new Food("Pizza", 9.99, false));
        customerOrder.add(new Food("Hotdog", 9.99, false));
        customerOrder.add(new Food("French Fries", 9.99, false));
        customerOrder.add(new Food("Bean Burger", 9.99, true));

        customerOrder.add(new Drink("Tea", 9.99, true));
        customerOrder.add(new Drink("Coffee", 9.99, true));
        customerOrder.add(new Drink("Matcha", 9.99, true));
        customerOrder.add(new Drink("Water", 0.00, true));
    }

    public void addItem(menuItems item){
        customerOrder.add(item);
    }
    public double calculateTotal(){
        double total = 0;
        for (menuItems item : customerOrder) {
            total += item.getPrice();
        }
        return total;
    }
    public void printReceipt(){
        System.out.println("===== Your receipt ======");
        for (menuItems items : customerOrder) {
            System.out.println(items.getName() + " " + items.getPrice());
        }
        System.out.printf("%.2f", calculateTotal());
    }
}
