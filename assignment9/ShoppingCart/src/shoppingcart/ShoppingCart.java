package shoppingcart;

import products.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
	private final List<CartLine> items = new ArrayList<>();

	public void addProduct(Product product) {
		for (CartLine line : items) {
			if (line.getProduct().getProductNumber().equals(product.getProductNumber())) {
				line.setQuantity(line.getQuantity() + 1);
				return;
			}
		}
		items.add(new CartLine(product, 1));
	}

	public void removeProduct(Product product) {
		Iterator<CartLine> iterator = items.iterator();
		while (iterator.hasNext()) {
			CartLine line = iterator.next();
			if (line.getProduct().getProductNumber().equals(product.getProductNumber())) {
				if (line.getQuantity() > 1) {
					line.setQuantity(line.getQuantity() - 1);
				} else {
					iterator.remove();
				}
				return;
			}
		}
	}

	public void printCart() {
		System.out.println("Content of the shopping cart:");
		for (CartLine line : items) {
			Product p = line.getProduct();
			System.out.printf("%d %s %s %.2f%n",
					line.getQuantity(),
					p.getProductNumber(),
					p.getDescription(),
					p.getPrice());
		}
		System.out.printf("Total price = %.2f%n", getTotal());
	}

	public double getTotal() {
		double total = 0.0;
		for (CartLine line : items) {
			total += line.getProduct().getPrice() * line.getQuantity();
		}
		return total;
	}
}
