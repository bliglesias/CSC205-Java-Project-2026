public class Drink extends Item{
    private String size;

    public Drink(String name, double price, boolean glutenFree, String size){
        super(name, price, glutenFree);
        this.size = size;
    }

    @Override
    public String toString(){
        return super.toString() + " [" + size +"]";
    }
}