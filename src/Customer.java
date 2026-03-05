import java.util.ArrayList;

public class Customer {
    // my box
    private ArrayList<Item> customerList = new ArrayList<>();
    private double tip;


    //methods
    // some are built-in (add) for example

    public void setTip(double tip){ this.tip = tip; }
    public double getTip(){ return tip; }

    //Create
    public void addItem(Menu menu, int choice){ customerList.add(menu.getMenu().get(choice - 1)); }

    //Read
    public void show(){
        for (Item item : customerList) {
            System.out.println(item);
        }
     }
    // Read: check for gluten
    public void allergenCheck(){
        for(Item item: customerList){
            if(!item.isGlutenFree()){
                System.out.println(item.getName() + " contains gluten!");
            }
        }
    }
    // Update/Delete
    public void updateAllergens(){
        ArrayList<Item> glutenFreeList = new ArrayList<>();
        for(Item item: customerList){
            if(item.isGlutenFree()){
                glutenFreeList.add(item);
            }
        }
        customerList = glutenFreeList;
    }
    // auxillary method for show receipt
    public double checkout(){
        double total = 0;
        for (Item item : customerList) {
            total += item.getPrice();
        }
        total += tip;
        return total;
    }
   
    //Finish-Line
    public void showReceipt(){
        for (Item item : customerList) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
        System.out.println("Tip: $" + getTip());
        System.out.println("Total: $" + checkout());
    }
}
