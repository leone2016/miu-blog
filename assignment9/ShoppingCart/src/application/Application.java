package application;

import shoppingcart.*;

import products.Product;
import shoppingcart.actions.AddAction;
import shoppingcart.actions.CartAction;
import shoppingcart.actions.PrintAction;
import shoppingcart.actions.RemoveAction;

public class Application {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Product tv = new Product("A123", 100.0, "TV");
		Product mp3 = new Product("A665", 75.0, "MP3 Player");

		CartAction add = new AddAction();
		CartAction remove = new RemoveAction();
		CartAction print = new PrintAction();

		add.execute(cart, tv);
		add.execute(cart, mp3);
		add.execute(cart, mp3);
		print.execute(cart, null);

		remove.execute(cart, mp3);
		remove.execute(cart, mp3);
		print.execute(cart, null);
	}
}
