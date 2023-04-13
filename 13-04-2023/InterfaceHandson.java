package scenario;

interface LibraryUser
{
	void registerAccount();
	void requestBook();
	
}

class KidUser implements LibraryUser
{
	private int age;
	private String bookType;
	
	KidUser(int age, String bookType)
	{
		this.age = age;
		this.bookType = bookType;
	}
	@Override
	public void registerAccount() 
	{
		if (age <= 12) 
		{
            System.out.println("You have successfully registered under a Kids Account");
        }
		else
		{
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
	}
	
	@Override
	public void requestBook() 
	{
		if (bookType == "Kids")
		{
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
		else
		{
            System.out.println("Oops, you are allowed to take only kids books");
        }
	}

	
}

class AdultUser implements LibraryUser
{
	private int age;
	private String bookType;
	
	AdultUser(int age, String bookType)
	{
		this.age = age;
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount() 
	{
		if (age > 12)
		{
            System.out.println("You have successfully registered under an Adult Account");
        }
		else
		{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
	}
	
	@Override
	public void requestBook() 
	{
		if (bookType=="Fiction")
		{
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
		else
		{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
	}

	
}

public class InterfaceHandson {

	public static void main(String[] args) {
		KidUser k1 = new KidUser(12, "Kids");
		k1.registerAccount();
		k1.requestBook();
		System.out.println();
		
		KidUser k2 = new KidUser(15, "Fiction");
		k2.registerAccount();
		k2.requestBook();
		System.out.println();
		
		AdultUser a1 = new AdultUser(12, "Fiction");
		a1.registerAccount();
		a1.requestBook();
		System.out.println();
		
		AdultUser a2 = new AdultUser(5, "Kids");
		a2.registerAccount();
		a2.requestBook();
		System.out.println();
		
	}

}
