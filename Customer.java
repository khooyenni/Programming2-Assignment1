package Assignment1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Customer { //1.3 User Define Class
	
	//1.2 Pre-define class
	private String customerName, address, phoneNumber;
	private int quantityItem, orderItem;
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	Scanner input = new Scanner(System.in);
	public Customer() { //1.4 Constructor with no argument
		
		System.out.print("\nDo you want to order online? (Y/N):");
		char online = input.next().charAt(0); 
		input.nextLine();
		
		if (online == 'Y'){
			System.out.print("Enter Your Name\t\t: ");
			this.customerName = input.nextLine();	
				
			System.out.print("Enter Your Phone Number : ");
			this.phoneNumber = input.nextLine();
				
			System.out.print("Enter Your Address\t: ");
			this.address = input.nextLine();
			
			CustomerInfo(customerName, phoneNumber, address);
			OrderItem();
		}
		else {
			OrderItem();
		}
	}
		
	public Customer(String customerName) {//1.4 Constructor with one argument	
		System.out.print("Do you want to order online? (Y/N):");
		char online = input.next().charAt(0); 
		if (online == 'Y'){
			
			System.out.print("Enter Your Phone Number : ");
			this.phoneNumber = input.nextLine(); 
				
			System.out.print("Enter Your Address\t: ");
			this.address = input.nextLine();
			
			CustomerInfo(customerName, phoneNumber, address);
			OrderItem(); 
		}
		else {
			OrderItem();
		}		
		
	}
		
	public Customer(String customerName, String phoneNumber) {//1.4 Constructor with two arguments		
		System.out.print("Do you want to order online? (Y/N):");
		char online = input.next().charAt(0); 
		if (online == 'Y'){
	
			System.out.print("Enter Your Address\t: ");
			this.address = input.nextLine();
			
			CustomerInfo(customerName,phoneNumber,address);
			OrderItem();
		}
		else {
			OrderItem();
		}
	}
		
	public Customer(String customerName,String phoneNumber,String address) {//1.4 Constructor with arguments
			
		System.out.print("Do you want to order online? (Y/N):");
		char online = input.next().charAt(0); 
		if (online == 'Y'){
	
			CustomerInfo(customerName,phoneNumber,address);
			OrderItem();
		}
		else {
			OrderItem();
		}
	}
	
	public void CustomerInfo(String customerName,String phoneNumber,String address) {//Method to print Customer Info
		System.out.println("\n*********************************************************************************"
				+ "\n\t\t\t\tCustomer Information"
				+ "\n*********************************************************************************"
				+ "\nCustomer Name \t:" + customerName
				+ "\nPhone Number \t:" + phoneNumber
				+ "\nAddress \t:" + address);
		System.out.println();
	}
		
	public void OrderItem() {//Method to print OrderItem
		System.out.println("Please enter the item you want to purchase:");
		System.out.println("**************************************************************" +
				"\n1. PC-230  Kate Eyebrow Colour 3D                     RM34.40" +
				"\n2. PC-350  3CE Eyebrow Mascara                        RM41.00" +
				"\n3. PC-400  Holika Holika Tail Lasting Brush Liner     RM49.90" +
				"\n4. PS-110  Rejoice Frizz Repair Shampoo 3D            RM12.50" +
				"\n5. PS-115  Sunsilk Super Collagen Shampoo Power Shine RM26.90" +
				"\n6. PS-118  Pantene Pro-V Anti Dandruff Shampoo        RM15.90" +
				"\n7. End" +
				"\n**************************************************************");		
		System.out.println();
    
		System.out.print("Enter Item Number You want to Purchase  : ");
		orderItem = input.nextInt();
		
		switch (orderItem) {
		
		case 1:
			System.out.print("Enter the Quantity You want to Purchase : ");
	    	this.quantityItem= input.nextInt();
	    	double totalPrice1 = quantityItem * 34.40;
			System.out.println("\nThe Item You Want to Purchase    : Kate Eyebrow Colour 3D");
			System.out.println("The Quantity You Want to Purchase: " + quantityItem );
	    	System.out.println("The Total Price\t\t\t : RM" + totalPrice1);
	    	System.out.println();
	    	break;
	    	
		case 2:
			System.out.print("Enter Quantity:");
	    	this.quantityItem= input.nextInt();
	    	double totalPrice2 = quantityItem * 41.00;
			System.out.println("The Item You Want to Purchase    : 3CE Eyebrow Mascara ");
			System.out.println("The Quantity You Want to Purchase: " + quantityItem );
	    	System.out.println("The Total Price\t\t\t : RM" + totalPrice2);
	    	System.out.println();
			break;
			
		case 3:
			System.out.print("Enter Quantity:");
	    	this.quantityItem= input.nextInt();
	    	double totalPrice3 = quantityItem * 49.90;
			System.out.println("The Item You Want to Purchase    : Holika Holika Tail Lasting Brush Liner ");
			System.out.println("The Quantity You Want to Purchase: " + quantityItem );
	    	System.out.println("The Total Price\t\t\t : RM" + totalPrice3);
	    	System.out.println();
			break;
			
		case 4:
			System.out.print("Enter Quantity:");
	    	this.quantityItem= input.nextInt();
	    	double totalPrice4 = quantityItem * 12.50;
			System.out.println("The Item You Want to Purchase    : Rejoice Frizz Repair Shampoo 3D ");
			System.out.println("The Quantity You Want to Purchase: " + quantityItem );
	    	System.out.println("The Total Price\t\t\t : RM" + totalPrice4);
	    	System.out.println();
			break;
			
		case 5:
			System.out.print("Enter Quantity:");
	    	this.quantityItem= input.nextInt();
	    	double totalPrice5 = quantityItem * 26.90;
			System.out.println("The Item You Want to Purchase    : Sunsilk Super Collagen Shampoo Power Shine ");
			System.out.println("The Quantity You Want to Purchase: " + quantityItem );
	    	System.out.println("The Total Price\t\t\t : RM" + totalPrice5);
	    	System.out.println();
			break;
			
		case 6:
			System.out.print("Enter Quantity:");
	    	this.quantityItem= input.nextInt();
	    	double totalPrice6 = quantityItem * 15.90;
			System.out.println("The Item You Want to Purchase    : Pantene Pro-V Anti Dandruff Shampoo");
			System.out.println("The Quantity You Want to Purchase: " + quantityItem );
	    	System.out.println("The Total Price\t\t\t : RM" + totalPrice6);
	    	System.out.println();
			break;
			
		case 7:
			System.out.println("Thank you for shopping at KYN Grocery Store");
		
	}
		
		
		
	}
	

}
