import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter String : ");
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		String reverse="";
		
		for(int i = str1.length()-1 ; i >= 0 ; i--)
		{
			reverse = reverse + str1.charAt(i);
		}
		
		if(str1.equals(reverse))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		
		
	}

}
