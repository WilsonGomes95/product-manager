package Entities;

public class Product{
    
    private String name;
    private Double price;
    
    
    public Product(){
        
    }
    
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    

    
    public double getPrice(){
          return this.price;
    }
    
    public String priceTag() {
		return name 
				+ " $ " 
				+ String.format("%.2f", price);
	}
    
    
}
