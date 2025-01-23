package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int Quantity = scan.nextInt();
		scan.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		ArrayList<Product> produtos = new ArrayList<>();
		for(int i = 0; i < Quantity; i++){
		    System.out.println("Product #" + (i +1));
		    System.out.print("Common, used or imported (c/u/i)? ");
		    String product = scan.nextLine().trim().toLowerCase();
		    
		    
		    
		    
		    switch(product.charAt(0)){
		        
		        case 'c':
		            System.out.print("Name: ");
		            String name = scan.nextLine();
		            System.out.print("Price: ");
		            double price = scan.nextDouble();
		            scan.nextLine();
		            produtos.add(new Product(name, price));
		            
		            break;
		            
		        case 'u':
		        	System.out.print("Name: ");
		            String name1 = scan.nextLine();
		            System.out.print("Price: ");
		            double price1 = scan.nextDouble();
		            scan.nextLine();
		            System.out.print("Manufacture date (DD/MM/YYYY): ");
		            String data = scan.nextLine();
		            LocalDate date = LocalDate.parse(data, formatter);
		            produtos.add(new UsedProduct(name1, price1, date));
		            
		            break;
		            
		            
		        case 'i':
		        	System.out.print("Name: ");
		            String name11 = scan.nextLine();
		            System.out.print("Price: ");
		            double price11 = scan.nextDouble();
		            scan.nextLine();
		            System.out.print("Customs fee: ");
		            double custo = scan.nextDouble();
		            scan.nextLine();
		            produtos.add(new ImportedProduct(name11, price11, custo));
		            
		            break;
		        
		        default:
		        	System.out.println("Opção invalida.");
		        	break;
		        
		    }
		}
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product prod : produtos) {
			System.out.println(prod.priceTag());
		}
		scan.close();
	}
}
