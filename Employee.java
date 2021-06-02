package Assignment1;
import java.util.*;
import java.text.DecimalFormat;
public class Employee { //1.3 User Define Class
	
	//1.2 Pre-Define Class
	private String employeeName, position;	
	private int employeeID;					
	private double salary;		
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	Scanner input = new Scanner(System.in);
	public Employee() {	//1.4 Constructor with non-argument
		System.out.print("Enter Your Name\t\t: ");
		this.employeeName = input.nextLine();		
		
		System.out.print("Enter Your EmployeeID   : ");
		this.employeeID = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter Your Position\t: ");
		this.position  = input.nextLine();
		
		System.out.print("Enter Your Salary\t: ");
		this.salary  = input.nextDouble();

		System.out.println("\n*******************************************" +
				"\n\tEmployee Information" +
				"\n*******************************************"+
				"\nName\t\t\t: " + this.employeeName +
				"\nPosition\t\t: " + this.position +
				"\nEmployee ID\t\t: " + this.employeeID +
				"\nSalary(per month)\t: " + df.format(this.salary) +	
				"\n*******************************************");
	  }
	
	public Employee(String employeeName) { //1.4 Constructor with one argument		
		System.out.print("Enter Your EmployeeID   : ");
		this.employeeID = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter Your Position\t: ");
		this.position  = input.nextLine();
		
		System.out.print("Enter Your Salary\t: ");
		this.salary  = input.nextDouble();
		
		EmployeeInfo (employeeName, employeeID, position, salary);
    }
	
	public Employee(String employeeName, int employeeID) { //1.4 Constructor with two argument
		System.out.print("Enter Your Position\t: ");
		this.position  = input.nextLine();
		
		System.out.print("Enter Your Salary\t: ");
		this.salary  = input.nextDouble();
		
		EmployeeInfo (employeeName,employeeID,position,salary);
    }
	
	public Employee(String employeeName, int employeeID, String position) { //1.4 Constructor with three argument
		System.out.print("Enter Your Salary: ");
		this.salary  = input.nextDouble();
		EmployeeInfo (employeeName,employeeID,position,salary);
    }
	
	public Employee(String employeeName, int employeeID,String position, double salary) { //1.4 Constructor with argument
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.position = position;
		this.salary = salary;
		
		EmployeeInfo (employeeName, employeeID, position, salary);
    }
	
	public String getEmployeeName(){  // Method to get EmployeeName
		return this.employeeName;
	}	
	
	public int getEmployeeID() { // Method to get EmployeeID
		return this.employeeID;
	}					
	
	public String getPosition(){  // Method to get Position
		return this.position;
	}
	
	public double getSalary(){  // Method to get Salary
		return this.salary;
	}
	
	public void EmployeeInfo (String employeeName, int employeeID,String position, double salary) {//Method print Employee Information
		System.out.println("\n*******************************************" +
				"\n\tEmployee Information" +
				"\n*******************************************"+
				"\nName\t\t\t: " + employeeName +
				"\nPosition\t\t: " + position +
				"\nEmployee ID\t\t: " + employeeID +
				"\nSalary(per month)\t: " + df.format(salary) +	
				"\n*******************************************");
	}


}
