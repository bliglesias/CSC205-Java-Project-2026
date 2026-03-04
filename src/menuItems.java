public abstract class menuItems {
    protected String name;
    protected double price;
    protected boolean glutenFree;

    public menuItems(){
        this.name = "";
        this.price = 0.0;
    }

    public menuItems(String name, double price, boolean glutenFree) {
        this.name = name;
        this.price = price;
        this.glutenFree = glutenFree;
    }
    
    public abstract boolean isGlutenFree();

    // Standard get/set
    public String getName(){ return name; }
    public double getPrice(){ return price; }

    @Override
    public abstract String toString();

    
    

}
