package exception;

import java.util.Scanner;

class TaxCalculator
{
	static double calculateTax( boolean isIndian, String name, double salary)  throws CountryNotValidateException,EmployeeNameInvalidException,TaxNotEligibleException
	{
		double taxAmount;
		if(isIndian==false)
		{
			throw new CountryNotValidateException("The employee should be an Indian citizen for\r\n"
					+ "calculating tax.");
		}
		if(name==null || name.isEmpty())
		{
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		if(salary>100000 && isIndian)
		{
			taxAmount = salary*8/100;
		}
		else if(salary>50000 && isIndian)
		{
			taxAmount = salary*6/100;
		}
		else if(salary>30000 && isIndian)
		{
			taxAmount = salary*5/100;
		}
		else if(salary>10000 && isIndian)
		{
			taxAmount = salary*4/100;
		}
		else
		{
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}
		
		return taxAmount;
		
	}
	
}

public class CalculatorSimulator {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in))
		{
			boolean isIndian;
			TaxCalculator tax = new TaxCalculator();
			System.out.println("Enter true if you are indian else enter false: ");
			isIndian = sc.nextBoolean();
			sc.nextLine();
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			System.out.println("Enter yout salary: ");
			double salary = sc.nextDouble();
			double ans = tax.calculateTax(isIndian, name, salary);
			System.out.println("Tax amoun is "+ans);
			
		}
		catch(CountryNotValidateException e)
		{
			System.out.println(e.getMessage());
		}
		catch(EmployeeNameInvalidException e)
		{
			System.out.println(e.getMessage());
		}
		catch(TaxNotEligibleException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Thank you!!");
		}
		
	}

}
