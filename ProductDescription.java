package Assignment1;
import java.util.*;
public class ProductDescription { //1.3 User Define Class
	
	//1.2 Pre-define class
	private String itemCode, itemCategory;
	
	Scanner input = new Scanner(System.in);
	
	public ProductDescription() { //1.4 constructor with no argument
		System.out.println("\n*******************************************" +
				"\n\tProduct Categories" +
				"\n*******************************************" +
				"\nPlease Enter The Category of Product You want to Purchase:" +
				"\n1. Cosmetic "+
				"\n2. Shampoo");
		this.itemCategory = input.nextLine();
		System.out.println("Your selection is "+itemCategory);
			
	}
	
	public ProductDescription(String c) { //1.4 constructor with one argument
		this.itemCategory = c;
		                                  
		System.out.println("\n\t\t\t\t\t\t*******************************************" +
				"\n\t\t\t\t\t\t\t\tProduct Categories" +
				"\n\t\t\t\t\t\t*******************************************"+
				"\n\t\t\t\t\t\t\tYou Have Choose "+ this.itemCategory + " Products.");
		
		if(itemCategory=="Cosmetic") {
			cosmeticInfo();
		} else if(itemCategory=="Shampoo") {
			shampooInfo();
		} 
	}
		
	public ProductDescription(String c,String itemCode) { //1.4 Constructor with two argument
		this.itemCategory = c;
		this.itemCode = itemCode;
		System.out.println("\n\t\t\t\t\t\t*******************************************" +
				"\n\t\t\t\t\t\t\t\tProduct Categories" +
				"\n\t\t\t\t\t\t*******************************************"+
				"\n\t\t\t\t\t\t\tYou Have Choose "+ this.itemCategory + " Products." +
				"\\n\\t\\t\\t\\t\\t\\t\\tYou have choose "+ this.itemCode );
				
	if (itemCategory == "Cosmetic" && itemCode == "PC-230") {
		System.out.println("********************Details of Product********************");
		System.out.println("ItemNumber\t: PC-230");               
		System.out.println("ItemName\t: Kate Eyebrow Colour 3D");
		System.out.println("ItemBrand\t: Kate Kyoto");
		System.out.println("ItemColour\t:Natural Brown");
		System.out.println("ItemPrice\t: RM34.40");
		System.out.println("ItemNetWeight\t: 6.3gram");
		System.out.println(" **********************************************************");
		System.out.println();	
	}
	else if (itemCategory == "Cosmetic" && itemCode == "PC-350"){
		System.out.println("********************Details of Product********************");
		System.out.println("ItemNumber\t: PC-350");
		System.out.println("ItemName\t: 3CE Eyebrow Mascara");
		System.out.println("ItemBrand\t: 3CE");
		System.out.println("ItemColour\t: Gold Brown");
		System.out.println("ItemPrice\t: RM41.00");
		System.out.println("ItemNetWeight\t: 5.5gram");
		System.out.println(" **********************************************************");
		System.out.println();
	}
	else if(itemCategory == "Cosmetic" && itemCode == "PC-400") {
		System.out.println("********************Details of Product********************");
		System.out.println("ItemNumber\t: PC-400");
		System.out.println("ItemName\t: Tail Lasting Brush Liner");
		System.out.println("ItemBrand\t: Holika Holika");
		System.out.println("ItemFlavour\t: Real Black");
		System.out.println("ItemPrice\t: RM49.90");
		System.out.println("ItemNetWeight\t: 0.5gram");
		System.out.println(" **********************************************************");
		System.out.println();
	}
	else if(itemCategory == "Shampoo" && itemCode == "PS-110") {
		System.out.println("********************Details of Product********************");
		System.out.println("TypeItemNumber\t: PS-110");
		System.out.println("ItemName\t: Rejoice Frizz Repair Shampoo");
		System.out.println("ItemBrand\t: Rejoice");
		System.out.println("ItemPrice\t: RM12.50");
		System.out.println("ItemNetWeight\t: 340ml");
		System.out.println(" **********************************************************");
		System.out.println();
	}		
	else if(itemCategory == "Shampoo" && itemCode == "PS-115") {
		System.out.println("********************Details of Product********************");
		System.out.println("TypeItemNumber\t: PS-115");
		System.out.println("ItemName\t: Sunsilk Super Collagen Shampoo Power Shine");
		System.out.println("ItemBrand\t: Sunsilk");
		System.out.println("ItemPrice\t: RM26.90");
		System.out.println("ItemNetWeight\t: 380ml");
		System.out.println(" **********************************************************");
		System.out.println();
	}
	else if(itemCategory == "Shampoo" && itemCode == "PS-118") {
		System.out.println("********************Details of Product********************");
		System.out.println("TypeItemNumber\t: PS-118");
		System.out.println("ItemName\t: Pantene Pro-V Anti Dandruff Shampoo");
		System.out.println("ItemBrand\t: Pantene");
		System.out.println("ItemPrice\t: RM15.90");
		System.out.println("ItemNetWeight\t: 340ml");
		System.out.println(" **********************************************************");
		System.out.println();
	}
	}
	
	public String getItemCode(){  // Method to get the item code
		return this.itemCode;
	}					
	
	public String getItemCategory(){  // Method to get the item category
		return this.itemCategory;
	}
	
	public void cosmeticInfo() {
		System.out.println("********************************************************************************************************************************" +
				"\n \t\t\t\t\t\t\t\tList of Cosmetic" +
				"\n********************************************************************************************************************************" +
				"\nItem Code\t| \t\t Item Name \t\t\t|\tItem Price \t| \t\tItem Weight \t\t|"+
				"\nPC-230\t\t|" + "\t  Kate Eyebrow Colour 3D\t\t|" + "\t RM34.40\t|" + "\t\t  6.3 gram\t\t|" +
				"\nPC-350\t\t|" + "\t   3CE Eyebrow Mascara\t\t\t|" + "\t RM41.00 \t|" + "\t\t  5.5 gram\t\t|" +
				"\nPC-400\t\t|" + "\tHolika Holika Tail Lasting Brush Liner\t|" + "\t RM49.90 \t|" + "\t\t  0.5 gram\t\t|" +
				"\n*********************************************************************************************************************************");		
		System.out.println();
		
	}
	
	void shampooInfo(){
		System.out.println("*************************************************************************************************************************" +
				"\n \t\t\t\t\t\t\t\tList of Shampoo" +
				"\n*************************************************************************************************************************" +
				"\nItem Code\t| \t\t    Item Name \t\t\t|\tItem Price \t| \t\tItem Weight \t|"+
				"\nPS-110\t\t|" + "\t  Rejoice Frizz Repair Shampoo 3D\t|" + "\t RM12.50\t|" + "\t\t  340ml\t\t|" +
				"\nPS-115\t\t|" + "   Sunsilk Super Collagen Shampoo Power Shine\t|" + "\t RM26.90 \t|" + "\t\t  380ml\t\t|" +
				"\nPS-118\t\t|" + "\tPantene Pro-V Anti Dandruff Shampoo\t|" + "\t RM15.90 \t|" + "\t\t  340ml\t\t|" +
				"\n*************************************************************************************************************************");		
		System.out.println();
		
	}


}
