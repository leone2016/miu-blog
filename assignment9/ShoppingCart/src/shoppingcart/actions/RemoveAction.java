package shoppingcart.actions;

import products.Product;
import shoppingcart.ShoppingCart;

public class RemoveAction implements CartAction {
    @Override
    public void execute(ShoppingCart cart, Product product) {
        cart.removeProduct(product);
    }
}
