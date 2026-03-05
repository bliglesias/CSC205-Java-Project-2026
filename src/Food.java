public class Food extends Item{
    private String temperature;

    public Food(String name, double price, boolean glutenFree, String temperature){
        super(name, price, glutenFree);
        this.temperature = temperature;
    }
    
    @Override
    public String toString(){
        return super.toString() + " [" + temperature +"]";
    }
}
