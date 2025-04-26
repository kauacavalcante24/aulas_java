public class Main {
    public static void main(String[] args) {

        Item item1 = new Item(1, "Cola-Cola", 5.50);
        Item item2 = new Item(2, "Hamburguer", 4.50);

        ShoppingCart carrinho = new ShoppingCart();

        carrinho.addItem(item1);
        carrinho.remove(1);
        carrinho.addItem(item2);
        carrinho.priceCalculate();

    }
}