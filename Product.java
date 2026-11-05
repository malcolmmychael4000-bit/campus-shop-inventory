package campusshop;

//	1a: Product class representing items sold in the campus shop

public class Product {
	
//	 1a: Attributes of a product
//	 1b: All attributes are private (encapsulation)
//	 1c: Meaningful names and appropriate data types
	private String productId;
	private String productName;
	private String productCategory;
	private double unitPrice;
	private int quantityInStock;
	
	
//	Constructor: runs when a new Product is created and sets all five values
	public Product(String productId, String productName, String productCategory, 
			double unitPrice, int quantityInStock) {
		setProductId(productId);
		setProductName(productName);
		setProductCategory(productCategory);
		setUnitPrice(unitPrice);
		setQuantityInStock(quantityInStock);
	}
	
	
//	2a: Getters - return the value of each private attribute
	public String getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getProductCategory() {
		return productCategory;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public int getQuantityInStock() {
		return quantityInStock;
	}
	
//	2b: Setters update the value of each private attribute
//  "this.productId" is the attribute, "productId" is the new value passed in
	public void setProductId(String productId) {
		this.productId = productId;
		}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
//	2b & 2c: Setter with validation - price must be greater than zero
	public void setUnitPrice(double unitPrice) {
		if(unitPrice > 0) {
			this.unitPrice = unitPrice;
		}else {
			System.out.println("Invalid unit price (" + unitPrice + "): price must be greater than zero. Price not changed.");
		}
	}
	
//	2b & 2c: Setter with validation - stock cannot be negative
	public void setQuantityInStock(int quantityInStock) {
		if (quantityInStock >= 0) {
			this.quantityInStock = quantityInStock; 
		}else {
			System.out.println("Invalid stock quantity (" +quantityInStock + "): stock cannot be negative. Quantity not changed.");
		}
	}
	
}
