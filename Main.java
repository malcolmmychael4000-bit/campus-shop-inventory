package campusshop;

//3a: Separate class used to run the application
public class Main {

	public static void main(String[] args) {
		
//		3b: Create five different Product objects
//		3c: Each object is given different details
		Product exerciseBook = new Product("P001", "Exercise Book (96 pages)", "Stationery", 2500, 120);
		Product ballpointPen = new Product("P002", "Ballpoint Pen (blue)","Stationery", 500, 300);
		Product printingPaper = new Product("P003", "Printing Paper (A4 Ream)", "Printing Supplies", 18000, 40);
		Product flashDisk = new Product("P004", "Flash Disk 32GB", "Electronics", 35000, 25);
		Product calculator = new Product("P005", "Scientific Calculator", "Electronics", 45000, 15);
		
//		4a: Display all five products using the getters
		System.out.println("=== ORIGINAL PRODUCT LIST ===");
		System.out.println("ID | Name | Category | Unit Price | Stock");
		displayProduct(exerciseBook);
		displayProduct(ballpointPen);
		displayProduct(printingPaper);
		displayProduct(flashDisk);
		displayProduct(calculator);
		
		System.out.println();
		System.out.println("=== UPDATING PRODUCT INFORMATION ===");
		
//		4b: update a price using its setter
		ballpointPen.setUnitPrice(600);
		System.out.println("Ballpoint Pen new price : UGX " + ballpointPen.getUnitPrice());
		
//		4c: update a stock quantity using its setter
		exerciseBook.setQuantityInStock(95);
		System.out.println("Exercise Book new stock: " +exerciseBook.getQuantityInStock());
		
//		4d: display the updated product list
		System.out.println();
		System.out.println("=== UPDATED PRODUCT LIST ===");
		System.out.println("ID | Name | Category | Unit Price | Stock");
		displayProduct(exerciseBook);
		displayProduct(ballpointPen);
		displayProduct(printingPaper);
		displayProduct(flashDisk);
		displayProduct(calculator);
		
		System.out.println();
		System.out.println("=== INVALID VALUE ===");
		
//		4e: try to set a negative price
		System.out.println("Setting the calculator price -1500...");
		calculator.setUnitPrice(-1500);
		System.out.println("Calculator price is still: UGX " + calculator.getUnitPrice());
		
//		3d: Show that each object keeps its own information
		System.out.println();
		System.out.println("=== EACH OBJECT HAS ITS OWN INFORMATION ===");
		System.out.println(exerciseBook.getProductName() + " stock: " + exerciseBook.getQuantityInStock());
		System.out.println(printingPaper.getProductName() + " stock: " + printingPaper.getQuantityInStock());
		System.out.println("Changing the exercise book did not change the printing paper.");
		
	}
	
//		5a: Helper method so the display code is written once and reused
//	 	Prints one product's details using the getters
	public static void displayProduct(Product product) {
		System.out.println(product.getProductId() + " | " + product.getProductName() + " | " + product.getProductCategory() + " | UGX " + product.getUnitPrice() + " | " + product.getQuantityInStock());
	}

}
