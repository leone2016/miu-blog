package shoppingcart.actions;


import products.Product;
import shoppingcart.ShoppingCart;

public interface CartAction {
    void execute(ShoppingCart cart, Product product);
}
