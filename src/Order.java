import java.util.ArrayList;

public class Order {
    //Create
    private ArrayList<Item> itemList = new ArrayList<>();
    private double tip;

    public double getTip() { return tip; }
    public void setTip(double tip) { this.tip = tip; }

   // Display
   public void show(){
        for (Item item : itemList) {
            System.out.println(item.getName());
        }
    }
    public void showGluten(){
        for (Item item : itemList) {
            if(!item.glutenFree){
                System.out.println(item.getName());
            }
        }
    }
    //Customer needs this to add to the list
    public void addItem(Item item){
        itemList.add(item);
    }

   //checking for gluten
   // 1: Display the list with gluten items
   // 2: Update to remove those items
    public void removeGluten(String input){
        if(input.equalsIgnoreCase("yes")){

            ArrayList<Item> cleanList = new ArrayList<>();
            for (Item item : itemList) {
                if(item.isGlutenFree()){
                    cleanList.add(item);
                }
            }
            itemList = cleanList;
            System.out.println("Cart updated.");

        }
    }
    // Auxillary method for receipt
    public double checkout(){
        double total = 0;

        for (Item item : itemList) {
            total += item.getPrice();
        }
        return total + getTip();
    }
    // Finish line
    public void printReceipt(String user){
        System.out.printf("Receipt for %s \n", user);

        for (Item item : itemList) {
        System.out.printf("%-20s $%.2f\n", item.getName(), item.getPrice());
        }
        if(getTip() > 0){
            System.out.printf("%-20s $%.2f\n", "Tip:", getTip());
        }
        System.out.printf("%-20s $%.2f\n", "Total:", checkout());
    }

    


    
}
