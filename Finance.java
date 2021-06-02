package Assignment1;
import java.text.DecimalFormat;
import java.util.*;
public class Finance { //1.3 User Define Class
	
	//1.2 Pre-Define Class
	double income, salary, totalPriceInventoryPurchase, incidentalCharges, totalProfit;		
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	Scanner input = new Scanner(System.in);
	public Finance() {	//1.4 Constructor with no argument
		System.out.print("Enter Income Grocery\t\t: ");												
		this.income = input.nextDouble();		
				
		System.out.print("Enter Total Salary\t\t: ");												
		this.salary = input.nextDouble();
		
		System.out.print("Enter Total Price (Inventory)\t: ");								
		this.totalPriceInventoryPurchase = input.nextDouble();		
				
		System.out.print("Enter Incidental Charges\t: ");											
		this.incidentalCharges = input.nextDouble();

		FinanceReport();
		}
	
	public Finance(double income) {	//1.4 Constructor with one argument		
		System.out.print("Enter Total Salary: ");												
		this.salary = input.nextDouble();
		
		System.out.print("Enter Total Price Purchase Inventory: ");								
		this.totalPriceInventoryPurchase = input.nextDouble();		
				
		System.out.print("Enter Incidental Charges: ");											
		this.incidentalCharges = input.nextDouble();

		FinanceReport();
		}
	
	public Finance(double income, double salary) { //1.4 Constructor with two argument		
		
		System.out.print("Enter Total Price Purchase Inventory: ");								
		this.totalPriceInventoryPurchase = input.nextDouble();		
				
		System.out.print("Enter Incidental Charges: ");											
		this.incidentalCharges = input.nextDouble();

		FinanceReport();
		}
	
	public Finance(double income,double salary,double inventoryTotalPricePurchase,double incidentalCharges) {//1.4 Constructor with argument
		this.income = income;
		this.salary = salary;
		this.totalPriceInventoryPurchase = inventoryTotalPricePurchase;
		this.incidentalCharges = incidentalCharges;
		FinanceReport();
	}

	public double getTotalIncome() { //Method to get total income grocerystore
		return this.income;
	}
	
	public double getTotalSalary() { //Method to get the total employee salary
		return this.salary;
	}
	
	public double getTotalPriceInventoryPurchase() { //Method to get the total price of all inventory stock
		return this.totalPriceInventoryPurchase;
	}
	
	public double getIncidentalCharges() { //Method to get the incidental charges
		return this.incidentalCharges;
	}
	
	public double getTotalProfit() { //Method to get the total profit
		return totalProfit;
	}
	
	public void FinanceReport() {
		totalProfit = (this.income - (this.salary + this.totalPriceInventoryPurchase + this.incidentalCharges));
		System.out.println();
		System.out.println("\n********************************************************************"
				+ "\n\t\t\tFinance Report"
				+ "\n********************************************************************"
				+ "\nTotal Income\t\t\t\t\t\tRM "+ df.format(income)
				+ "\nTotal Salary Employee\t\t\t\t\tRM "+df.format(salary)
				+ "\nTotal Price Purchase Inventory\t\t\t\tRM " + df.format(totalPriceInventoryPurchase)
				+ "\nIncidental Charges\t\t\t\t\tRM "+ df.format(incidentalCharges)
				+"\n____________________________________________________________________"
				+"\nTotal Profit\t\t\t\t\t        RM " + getTotalProfit() 
				+ "\n********************************************************************");
	    System.out.println();
	}

}
