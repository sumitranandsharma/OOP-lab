class Product {
private String name;
private double price; 
private int quantity;
public Product(String name, double price, int quantity) { 
this.name = name;
setPrice(price); 
setQuantity(quantity);
}
public String getName() { 
return name;
}
public double getPrice() { 
return price;
}
public void setPrice(double price) { 
if (price >= 0) {
this.price = price;
} else {
System.out.println("Price cannot be negative.");
}
}
public int getQuantity() { 
return quantity;
}
public void setQuantity(int quantity) { 
if (quantity >= 0) {
this.quantity = quantity;
} else {
System.out.println("Quantity cannot be negative.");
}
}
public void displayProductDetails() { 
System.out.println("Product Name: " + name);

System.out.println("Price: " + price); 
System.out.println("Quantity in Stock: " + quantity);
}
public static void main(String[] args) {
Product product = new Product("Laptop", 1200.0, 10); 
product.displayProductDetails(); 
product.setPrice(1000.0);
product.setQuantity(5); 
product.displayProductDetails();
}
}