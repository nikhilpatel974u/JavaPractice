import java.util.Scanner;

public class ExceptionDemo2 {

	
	public static void main(String[] args) throws ArithmeticException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number one : ");
		
		int a = sc.nextInt();
		
		System.out.println("Enter number two : ");
		
		int b = sc.nextInt();
		
		int div = a/b;
		
		System.out.println("Answer is : " +div);

	}

}
