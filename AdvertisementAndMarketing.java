package Assignment1;

public class AdvertisementAndMarketing {//1.3 User Define Class
	
	//1.2 Pre-define class
	String promotion;
	String sales;
	
	public AdvertisementAndMarketing() { //1.4 Constructor with no argument
		System.out.println("\n****************************************************************"
				+ "\n\t\tAdvertisement And Marketing"
				+ "\n****************************************************************");
	}
	
	public AdvertisementAndMarketing(String promo) { //1.4 Constructor with one argument
		this.promotion = promo;
		
		System.out.println("\n****************************************************************"
				+ "\n\t\tAdvertisement And Marketing"
				+ "\n****************************************************************");
		promotionList();
	}
	
	public AdvertisementAndMarketing(String promo, String sales) { //1.4 Constructor with two argument
		this.promotion = promo;
		this.sales = sales;
		
		System.out.println("\n****************************************************************"
				+ "\n\t\tAdvertisement And Marketing"
				+ "\n****************************************************************");
		promotionList();
		juneSales();
		socialMedia();
	}
	
	public void promotionList() {
		System.out.println("\nPromotion is coming!!!"
				+ "\nFree shipping for order RM120 and above."
				+ "\nFree return when receive the wrong items"
				+ "\nGet a 5% discount for order RM200 and above");
	}
	
	public void juneSales() {
		System.out.println("\n6.6 Sales is coming!!!"
				+ "\nEnjoy free shipping for order RM66 and above. "
				+ "\nGet 66% discount on selected items only.");
	}
	
	public void socialMedia() {
		System.out.println("\nFollow us for more promotion!!!"
						 + "\nFacebook  : KYN Grocery Store" 
						 + "\nInstagram : @KYNGroceryStore"  
						 + "\nWebsite   : http://www.KYNGroceryStore.com.my");
	}

}
