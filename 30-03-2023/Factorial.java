package basic;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++) {
			int temp=i;
			int fact=1;
			while(temp>0) {
				fact=fact*temp;
				temp--;	
			}
			System.out.println(fact);
		}

	}

}
