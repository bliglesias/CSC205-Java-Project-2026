import java.util.ArrayList;

public class Menu {
    private ArrayList<Item> menu = new ArrayList<>();

    public Menu(){
        menu.add(new Food("Pizza", 9.99, false,"HOT"));
        menu.add(new Food("Hotdog", 1.69, false,"HOT"));
        menu.add(new Food("French Fries", 1.25, false, "HOT"));
        menu.add(new Food("Bean Burger", 12.99, true,"COLD"));

        menu.add(new Drink("Beer - Domestic", 5.99, false, "Pint"));
        menu.add(new Drink("Beer - Import", 4.99, false, "Pint"));
        menu.add(new Drink("Matcha", 8.99, true, "Medium"));
        menu.add(new Drink("Water", 0.00, true, "Small"));
    }
    
    public void show(){
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ") " + menu.get(i));
        }
    }
    
    // expose the list
    public ArrayList<Item> getMenu(){ return menu; }

    
    

    
    
}
