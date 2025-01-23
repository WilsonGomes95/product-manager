package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UsedProduct extends Product{
    private LocalDate manufactureDate;
    
    
    public UsedProduct(){
        super();
    }
    
    public UsedProduct(String name, double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    
    public LocalDate getmanufactureDate(){
        return this.manufactureDate;
    }
    
    public void setmanufactureDate(LocalDate data){
    	this.manufactureDate = data;
    }
    
    @Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
    
    
    
}
