package application;

import java.util.Scanner;

import entities.ProductRegistration;
import entities.Products;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ProductRegistration registration = new ProductRegistration();
		
		int option = 0;
		
		while (option != 4) {
			System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. List Product");
            System.out.println("4. Exit");
            System.out.print("\nChoose an option: ");
            option = sc.nextInt();
            sc.nextLine();  
            
            switch (option) {
            case 1:
            	registration.listProducts();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Description: ");
                String description = sc.nextLine();
                System.out.print("Value: ");
                double value = sc.nextDouble();
                System.out.print("Avaliable for sale (true/false): ");
                boolean forSale = sc.nextBoolean();
                sc.nextLine();  

                Products products = new Products(name, description, value, forSale);
                registration.addProduct(products);
                break;
                
            case 2:
                System.out.print("Product name to remove: ");
                String nameRemove = sc.nextLine();
                boolean removed = registration.removeProduct(nameRemove);
                if (removed) {
                    System.out.println("Product removed successfully.");
                } else {
                    System.out.println("Product not found.");
                }

                break;
            
            case 3:
            	registration.listProducts();
                break;
                
            case 4:
                System.out.println("Leaving the program...");
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
	}
		sc.close();
	}
	
}
    
