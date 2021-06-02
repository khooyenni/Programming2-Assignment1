package Assignment1;
import java.util.*;
public class PersonalCareShop { //1.3 User Define Class
	
	//1.2 Pre-Define Class
	private String storeName, phoneNumber;  
	private int yearEstablished;
	
	Scanner input = new Scanner(System.in);
	public PersonalCareShop() {//1.4 Constructor with no arguments
		
		System.out.print("Enter Name of Grocery Store\t:");
		this.storeName = input.nextLine();		
		
		System.out.print("Enter Year Established\t\t:");
		this.yearEstablished = input.nextInt();
		
		System.out.print("Enter Contact Number\t\t:");
		input.nextLine();
		this.phoneNumber = input.nextLine();
		
		PersonalCareShopInfo(storeName, yearEstablished, phoneNumber);
	
	}
	public PersonalCareShop(String storeName) { //1.4 Constructor with one arguments	
		System.out.print("Enter Year Established\t\t:");
		this.yearEstablished = input.nextInt();
		
		System.out.print("Enter Contact Number\t\t:");
		input.nextLine();
		this.phoneNumber = input.nextLine();
		
		PersonalCareShopInfo(storeName, yearEstablished, phoneNumber);
	}
	
	public PersonalCareShop(String storeName, int yearEstablished) { //1.4 Constructor with two arguments
		System.out.print("Enter Contact Number\t\t:");
		this.phoneNumber = input.nextLine();
		
		System.out.println("\nName of Grocery Store\t\t:" + storeName + 
				"\nYear Established\t\t:" + yearEstablished +
				"\nContact number\t\t\t:" + phoneNumber);
	}
	
	public PersonalCareShop(String storeName, int yearEstablished, String phoneNumber) {//1.4 Constructor with three arguments
		this.storeName = storeName;
		this.yearEstablished = yearEstablished;
		this.phoneNumber = phoneNumber;
		
		PersonalCareShopInfo(storeName, yearEstablished, phoneNumber);
	}	
	
	public void PersonalCareShopInfo(String storeName, int yearEstablished, String phoneNumber) {
		
		System.out.println("\nName of Grocery Store\t\t:" + storeName + 
				"\nYear Established\t\t:" + yearEstablished +
				"\nContact number\t\t\t:" + phoneNumber);
	
		
	}

}
