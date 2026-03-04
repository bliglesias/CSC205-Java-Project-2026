public class Food extends menuItems{
    @Override
    public boolean isGlutenFree(){ return glutenFree; }

    public Food(String name, double price, boolean glutenFree){
        super(name, price, glutenFree);
    }
    @Override
    public String toString(){
        return name + " " + price;
    }
    
}
