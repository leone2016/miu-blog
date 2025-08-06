package shoppingcart.actions;

import products.Product;
import shoppingcart.ShoppingCart;

public class PrintAction implements CartAction {
    @Override
    public void execute(ShoppingCart cart, Product product) {
        cart.printCart();
    }
}
