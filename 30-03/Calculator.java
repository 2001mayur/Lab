package basic;

import java.util.Scanner;

class Operator{
	
	public int addition(int a , int b){
		 return a+b;
	}
	public int subtraction(int a, int b){
        return a-b;
    }
    public int division(int a, int b){
        return a/b;
    }
    public int multiplication(int a , int b){
        return a*b;
    }
	
}
public class Calculator {

	public static void main(String[] args) {
		Operator op = new Operator();
		System.out.println("Welcome to Calculator");
		Scanner sc = new Scanner(System.in);
		
		int x , y;
		
		do {
			
		System.out.println(" 1 Addition\n 2 Subtraction\n 3 Multiplication\n "
				+ "4 Division\n 5 Exit");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Enter 1st digit");
			x = sc.nextInt();
			System.out.println("Enter 2nd digit");
			y = sc.nextInt();
			
			System.out.println("Sum : " + op.addition(x,y));
			break;
			
		case 2:
			System.out.println("Enter 1st digit");
		    x = sc.nextInt();
			System.out.println("Enter 2nd digit");
			y = sc.nextInt();
			
			System.out.println("Subtraction : " + op.subtraction(x,y));
			break;
		case 3: 
			System.out.println("Enter 1st digit");
			x = sc.nextInt();
			System.out.println("Enter 2nd digit");
			y = sc.nextInt();
			
			System.out.println("Multiplication : " + op.multiplication(x,y));
			break;
			
		case 4:
			System.out.println("Enter 1st digit");
			x = sc.nextInt();
			System.out.println("Enter 2nd digit");
			y = sc.nextInt();
			
			System.out.println("Division : " + op.division(x,y));
			break;
			
		case 5:
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid Output");
					
		
		}
				
	}
		while(true);
	}

}
