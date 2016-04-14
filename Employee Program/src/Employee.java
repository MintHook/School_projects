public class Employee {

	private final int EMPLOYEE_ID;
	public static final double STARTING_PAY_RATE = 7.75;
	public static int next_ID = 999;
	public double payrate;
	public String name;
	
	public Employee(String name){
		this.name = name;
		this.payrate = STARTING_PAY_RATE;
		EMPLOYEE_ID = getNextId();
	}
	
	public Employee(String name, double newRate){
		this.name = name;
		this.payrate = newRate;
		EMPLOYEE_ID = getNextId();
	}
	
	public String getName(){
		return name;
	}
	
	public int getEmployeeID(){
		return EMPLOYEE_ID;
	}
	
	public double getPayRate(){
		return payrate;
	}
	
	public void changeName(String newName){
		this.name = newName;
	}
	
	public void changePayRate(double newRate){
		this.payrate = newRate;
	}
	
	private int getNextId(){
		next_ID++;
		return next_ID;
	}
}
