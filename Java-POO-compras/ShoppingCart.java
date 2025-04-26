import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> itens;

    public ShoppingCart() {
        itens = new ArrayList<>();
    }

    public void addItem(Item item) {
        itens.add(item);
    }

    public void remove(int id) {
        for(int i=0; i<itens.size(); i++) {
            if (itens.get(i).getId() == id) {
                String product = itens.get(i).getName();
                System.out.println("===========================");
                System.out.println("OBS: " + product + " foi removido!");
                System.out.println("===========================");
                itens.remove(i);
            }
        }
    }

    public void priceCalculate(){
        double total_price = 0;
        for(int i=0; i<itens.size(); i++) {
            total_price += itens.get(i).getPrice();
            itens.get(i).getItemInfo();
            System.out.println();
        }
        System.out.println("Total: R$" + total_price);
    }
}