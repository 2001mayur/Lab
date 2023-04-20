package scenario;

import java.util.Scanner;

abstract class Shape{
	abstract void calculateArea();
}

class Circle extends Shape
{
	private float r;
	Circle(float r)
	{
		this.r=r;
	}
	@Override
	void calculateArea() {
		System.out.println("Area of a circle is: "+(3.14*r*r));
	}
}

class Rectangle extends Shape
{
	private float l,b;
	public Rectangle(float l, float b) {
		this.l = l;
		this.b = b;
	}
	
	@Override
	void calculateArea() {
		System.out.println("Area of a rectangle is: "+((l*b)/2));
		
	}
}

public class ShapesArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("Press  1)Circle\n\t2)Rectangle\n\t3)Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the radius of a circle: ");
				float r = sc.nextFloat();
				Circle c = new Circle(r);
				c.calculateArea();
				break;
				
			case 2:
				System.out.println("Enter length: ");
				float l= sc.nextFloat();
				System.out.println("Enter breadth: ");
				float b = sc.nextFloat();
				Rectangle rect = new Rectangle(l,b);
				rect.calculateArea();
				break;
				
			case 3:
				System.out.println("Thank you!!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice!!");
				break;
			}
		}while(true);
		
	}

}
