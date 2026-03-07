public class Customer {
    // my box
    private Order order = new Order();

    //Expose to port out
    public Order getOrder() {
        return order;
    }
    public void showOrder(){
        order.show();
    }
    public void showGlutenOrder(){
        order.showGluten();
    }
    public void delete(String input){
        order.removeGluten(input);
    }
    public void addTip(double tip){
        order.setTip(tip);
    }
    public void checkout(String user){
        order.printReceipt(user);
    }
  
    // Add item
    public void append(Menu menu, int index){
        Item item = menu.getMenu().get(index - 1);
        order.addItem(item);
    }
}
