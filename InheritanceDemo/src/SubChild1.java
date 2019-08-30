
public class SubChild1 extends Child1 {
	
	int c;
	SubChild1(int a, int b,int c) {
		super(a, b);
		this.c = c;
	}
	
	public void subChildMethod()
	{
		System.out.println("values are : "+a+ " "+b+ " "+c);
	}
	
	public void subChildMethod2()
	{
		System.out.println("second method");
	}
	

}
