import java.util.Scanner;

class Javabasics {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
				System.out.println("Enter your First Name: ");
		String firstname=scanner.next();
		System.out.println("Enter your Last Name: ");
		String lastname=scanner.next();
		System.out.println("Enter your Age: ");
		int number=scanner.nextInt();
		System.out.println("Enter your Salary: ");
		double salary=scanner.nextDouble();
		
		System.out.println("\nYour First Name is "+firstname);
		System.out.println("\nYour Last Name is "+lastname);
		System.out.println("\nYour Age is "+number);
		System.out.println("\nYour Salary is "+salary);
		
		
				
	}

}
