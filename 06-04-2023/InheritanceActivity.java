package scenario;

class Employee
{
	long employeeId, employeePhone;
	String employeeName, employeeAddress;
	double basicSalary, specialAllowance=250.80, Hra=1000.50;
	
	Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}
	
	public void calculateSalary()
	{
		double salary = basicSalary + (basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		System.out.println("Salary : "+salary);
	}
	public void calculateTransportAllowance()
	{
		double transportAllowance = 0.10 * basicSalary;
		System.out.println("Transport Allowance: "+transportAllowance);
	}
}

class Manager extends Employee
{
	Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary){
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary = basicSalary;
	}
	@Override
	public void calculateTransportAllowance()
	{
		double transportAllowance = 0.15 * basicSalary;
		System.out.println("Transport Allowance: "+transportAllowance);
	}
}

class Trainee extends Employee 
{
    Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) 
    {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        this.basicSalary = basicSalary;
    }
}
public class InheritanceActivity {

	public static void main(String[] args) {
		
		Manager m = new Manager(126534l, "Peter", "Chennai India", 237844l, 65000);
		m.calculateSalary();
		m.calculateTransportAllowance();
		
		Trainee t = new Trainee(29846l, "Jack", "Mumbai India", 442085l, 45000);
		t.calculateSalary();
		t.calculateTransportAllowance();
		
	}

}
