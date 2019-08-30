import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int i = sc.nextInt();
		
		try 
		{
			int div = i/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception occured");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("always executed");
		}
	}
	
	
}
