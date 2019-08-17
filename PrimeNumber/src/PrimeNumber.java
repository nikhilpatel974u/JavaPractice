import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean isPrime = true;
		System.out.println("Enter Number : ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 2 ; i < num/2 ; i++)
		{
			if(num%i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println(num + " is a Prime Number");
		}
		else
		{
			System.out.println(num + " is not a Prime Number");
		}
		
	}

}
