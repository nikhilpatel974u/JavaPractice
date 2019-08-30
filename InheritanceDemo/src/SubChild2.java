
public class SubChild2 extends Child1 {
	
	int d;
	SubChild2(int a, int b,int d) {
		super(a, b);
		this.d = d;
	}
	
	public void subChil2dMethod()
	{
		System.out.println("SubChild2 class values are : "+a+ " "+b+ " "+d);
	}
	
	public void subChild2Method2()
	{
		System.out.println("second method");
	}
	
	public String toString()
	{
		return "complete";
	}
	public static void main(String[] args) {
		SubChild2 s = new SubChild2(1, 2, 3);
		s.subChil2dMethod();
		s.subChild2Method2();
		s.childMethod();
		s.childMethod2();
		s.parentMethod();
		s.parentMethod2();
		s.toString();
		
	}
	

}
