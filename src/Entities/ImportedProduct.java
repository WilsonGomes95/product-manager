package Entities;

public class ImportedProduct extends Product{
    
    private Double customsFee;
    
    
    public ImportedProduct(){
        super();
    }
    
    public ImportedProduct(String name, double price, double customsFee){
        super(name, price);
        this.customsFee = customsFee;
        
    }
    
    
    public double getcustomsFee(){
        return this.customsFee;
    }
    
    public void setcustomsFee(double customsFee){
        this.customsFee = customsFee;
    }
    
    @Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
    
    public double totalPrice(){
        return 2;
    }
    
    
    
    
    
    
    
}
