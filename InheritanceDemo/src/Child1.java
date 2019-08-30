
public class Child1 extends Parent {

	int b;
	Child1(int a, int b) {
		super(a);
		this.b = b;
	}
	
	public void childMethod()
	{
		System.out.println("from child class values are: " +a + " " +b);
	}
	
	public void childMethod2()
	{
		System.out.println("second method");
	}
	
	
	

}
