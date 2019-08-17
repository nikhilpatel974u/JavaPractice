import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		int num, a = 0 , b = 0 , c = 1 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to generate fibonacci : ");
		
		num = sc.nextInt();
		
		System.out.println("Fibonacci series is : ");
		
		for(int i = 0 ; i <= num ; i++)
		{
			a = b ;
			b = c ;
			c = a+b;
			System.out.print(a + " ");
		}
		
	}

}
