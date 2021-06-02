package Assignment1;

public class Main {

	public static void main(String[] args) {
		
		PersonalCareShop g = new PersonalCareShop();
		
		System.out.println("\nProduct Description");
		ProductDescription p = new ProductDescription("Shampoo");
		
		System.out.println("\nAdvertisement And Marketing");
		AdvertisementAndMarketing a = new AdvertisementAndMarketing("Promotion","Sales");
		
		System.out.println("\nCustomer");
		Customer c = new Customer();
		
		System.out.println("\nEmployee");
		Employee e =new Employee();
		
		System.out.println("\nInventory");
		Inventory i = new Inventory();
		
		System.out.println("\nFinance");
		Finance f = new Finance();
	
	}

}