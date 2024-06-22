package entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class ProductRegistration {
	private List<Products> product = new ArrayList<>();
	
	
	public void addProduct(Products products) {
	      for (Products p : product) {
	            if (p.getName().equalsIgnoreCase(products.getName())) {
	                System.out.println("Product already exists");
	                return;
	            }
	        }
	        product.add(products);
	        System.out.println("Product added successfully.");
	    }
	
	
	public boolean removeProduct(String nameRemove) {
		boolean removed = product.removeIf(product -> product.getName().equalsIgnoreCase(nameRemove));
        return removed;
	}

	public List<Products> getProduct() {
		return product;
	}
	
	 public void listProducts() {
		 product.sort(Comparator.comparingDouble(Products::getValue));
		 System.out.println("\r\n"
		 		+ "Registered products:");
		 for (Products p : product) {
			 System.out.println("Name: " + p.getName() + ", Value: R$ " + String.format("%.2f", p.getValue()));
		 }
	 }
	        
	
	
}
