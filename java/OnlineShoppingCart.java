import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

abstract class CartItem {
    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percentage);
}

class Cart extends CartItem implements Discountable {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void applyDiscount(double percentage) {
        Product p = products.get(0);
        p.setPrice(p.getPrice() - (p.getPrice() * percentage / 100));
        System.out.println("Applying " + percentage + "% discount to " + p.getName());
    }
}

class OnlineShoppingCart{
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1200);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.applyDiscount(10);
        System.out.println("Total Cart Price = " + cart.calculateTotalPrice());
    }
}
