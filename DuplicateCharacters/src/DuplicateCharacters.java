import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter a String : ");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int j=0,count = 0 ;
		
		char[] ch = str.toCharArray();
		
		System.out.println("Duplicate characters are:");
		
        for (int i=0; i<str.length()-1;i++)
        {count=0;
        	for(j=1; j<str.length();j++)
        	{
        		if (ch[i] == ch[j]) 
        		{
        			++count;
        			//System.out.println(ch[j] + " occurred " + count + " times");     
        			//break;
        		}
        	}
        	System.out.println(ch[j] + " occurred " + count + " times");
         }
        //System.out.println(ch[j] + " occurred " + count + " times");
	}
}
