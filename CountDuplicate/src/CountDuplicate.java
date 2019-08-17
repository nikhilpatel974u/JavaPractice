import java.util.Scanner;

public class CountDuplicate {
	
	public void countFrequency(int[] arr,int size)
	{	
		for(int i=0;i<size;i++)
		{
			int count = 0 ;
			for(int j=0;j<size;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			System.out.println(arr[i] + " occurred " + count + " times");
		}
	}

	public static void main(String[] args) {
		
		int i;
		int[] arr = new int[50];
	//	char[] ch = new char[50];
		
		System.out.println("Enter total element : ");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		for(i=0;i<size;i++)
		{
			System.out.println("enter Value : " + i);
			arr[i] = sc.nextInt();
		}
		
		CountDuplicate c = new CountDuplicate();
		c.countFrequency(arr,size);

	}

}
