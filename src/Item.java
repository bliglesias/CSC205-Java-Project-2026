public abstract class Item {
    protected String name;
    protected double price;
    protected boolean glutenFree;

    // public Item(){
    //     this.name = "";
    //     this.price = 0.0;
    //     this.glutenFree = false;
    // }

    public Item(String name, double price, boolean glutenFree) {
        this.name = name;
        this.price = price;
        this.glutenFree = glutenFree;
    }

    // Standard getters
    public String getName(){ return name; }
    public double getPrice(){ return price; }
    public boolean isGlutenFree(){return glutenFree; }

    @Override
    public String toString(){
        return String.format("%-20s - %.2f%-20s", name, price, (glutenFree ? " [GF]": ""));
    }

}
