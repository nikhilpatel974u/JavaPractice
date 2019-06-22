package durgasoft.java;
import java.util.*;
public class StudentGradeSystem {
	
	public static void main(String[] args) throws Exception {
		
		int i,j;
		float avg,marks = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of student : ");
		int student = sc.nextInt();
		
		System.out.println("Enter total subjects : ");
		int subject = sc.nextInt();
		
		for(i=0; i<student; i++)
		{
			System.out.println("Enter Student " +i+" Record : ");
			marks =0;
			for(j=0; j<subject; j++)
			{
				System.out.println("Enter Subject " +j+ " marks : ");
				int[] a = new int[subject];
				a[j] = sc.nextInt();
				
				marks = marks + a[j];
			}
			
			System.out.println("Student " +i+ " Total Marks is : " +marks);
			
			avg = marks/subject;
			System.out.println("Student " +i+ " average is : " +avg);
		
				if(avg>=90 && avg<100)
				{
					System.out.println("Grade --> A");
				}
				else if (avg>=80 && avg<90)
				{
					System.out.println("Grade --> B");
				}	
				else if(avg>=70 && avg<80)
				{
					System.out.println("Grade --> C");
				}			
				else if(avg>=60 && avg<70)
				{
					System.out.println("Grade --> D");
				}
				else if(avg>=50 && avg<60)
				{
					System.out.println("Grade --> E");
				}
				else
				{
					System.out.println("Grade --> F");
				}			
		}
	}
}
