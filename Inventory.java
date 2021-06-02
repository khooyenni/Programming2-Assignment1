package Assignment1;
import java.text.DecimalFormat;
import java.util.*;
public class Inventory { //1.3 User Define Class
	
	//1.2 Pre-Define Class
	String itemCode, itemName;
	int itemQuantity;	
	double itemPrice; //1.2 pre-define class
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	Scanner input = new Scanner(System.in);
	
	public Inventory() { //1.4 constructor with no argument
		itemRegistration();
	}
	
	public Inventory(int q) { //1.4 constructor with one argument
		this.itemQuantity = q;
		
		System.out.print("Enter Item Name Purchased\t: ");
		this.itemName = input.nextLine();
		System.out.print("Enter Item Code Purchased\t: ");
		this.itemCode = input.nextLine();
		System.out.print("Enter Item Price Purchased\t: ");
		this.itemPrice = input.nextDouble();
		
		System.out.println("\nNew item has been registered."
				+"\nItem name\t\t: " + this.itemName
				+"\nItem code\t\t: " + this.itemCode
				+"\nItem Price\t\t: RM " + df.format(this.itemPrice)
				+"\nQuantity\t\t: " + this.itemQuantity
				+"\nTotal Price Purchase\t: RM " + df.format(TotalPricePurchase()));
	}
	
	public Inventory(String itemCode, String itemName) { //1.4 constructor with two arguments
		this.itemCode = itemCode;
		this.itemName = itemName;
		
	
		System.out.print("Enter Item Price Purchased\t: ");
		this.itemPrice = input.nextDouble();
		System.out.print("Enter Quantity Purchased\t: ");
		this.itemQuantity = input.nextInt();
		
		System.out.println("\nNew item has been registered."
				+"\nItem name\t\t: " + this.itemName
				+"\nItem code\t\t: " + this.itemCode
				+"\nItem Price\t\t: RM " + df.format(this.itemPrice)
				+"\nQuantity\t\t: " + this.itemQuantity
				+"\nTotal Price Purchase\t: RM " + df.format(TotalPricePurchase()));
	}
	
	public void itemRegistration() {
		System.out.println("*********************************************************************************"
				+ "\n\t\t\t\tRegister New Item"
				+ "\n*********************************************************************************");
		System.out.print("Enter Item Name Purchased\t: ");
		this.itemName = input.nextLine();
		System.out.print("Enter Item Code Purchased\t: ");
		this.itemCode = input.nextLine();
		System.out.print("Enter Item Price Purchased\t: ");
		this.itemPrice = input.nextDouble();
		System.out.print("Enter Quantity Purchased\t: ");
		this.itemQuantity = input.nextInt();
		
		System.out.println("\nNew item has been registered."
				+"\nItem name\t\t: " + this.itemName
				+"\nItem code\t\t: " + this.itemCode
				+"\nItem Price\t\t: RM " + df.format(this.itemPrice)
				+"\nQuantity\t\t: " + this.itemQuantity
				+"\nTotal Price Purchase\t: RM " + df.format(TotalPricePurchase()));
	}
	
	public String getItemName() {//Method to get Price Item
		return this.itemName;
	}
	
	public String getItemCode() {//Method to get Quantity Item
		return this.itemCode;
	}
	
	public int getItemQuantity() {//Method to get Quantity Item
		return this.itemQuantity;
	}
	public double getItemPrice() {//Method to get Price Item
		return this.itemPrice;
	}
	
	public double TotalPricePurchase() {//Method to get the total price of all inventory stock
		return this.itemQuantity * this.itemPrice;
	}
	

}
