package AulasUdemyJava.aplication;

import java.util.Locale;
import java.util.Scanner;

import AulasUdemyJava.entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = entrada.nextLine();
		
		System.out.print("Price: ");
		product.price = entrada.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = entrada.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		/*entrada em estoque*/
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = entrada.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		/*saída de estoque*/
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock");
		quantity = entrada.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		entrada.close();
	}
}
