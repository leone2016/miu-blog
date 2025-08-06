package shoppingcart;

import products.Product;

public class CartLine {
	private int quantity;
	private Product product;

	public CartLine(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void incrementQuantity() {
		quantity++;
	}

	public void decrementQuantity() {
		quantity--;
	}

	public double getSubtotal() {
		return product.getPrice() * quantity;
	}

	public boolean isSameProduct(Product other) {
		return product.getProductNumber().equals(other.getProductNumber());
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
