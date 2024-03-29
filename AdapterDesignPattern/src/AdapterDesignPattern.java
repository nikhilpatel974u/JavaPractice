//This is Adapter Design Pattern Program in Java Design Pattern.

interface WebDriver
{
	public void getElement();
	public void selectElement();
}

class ChromeDriver implements WebDriver
{
	public void getElement()
	{
		System.out.println("Get element from ChromeDriver");
	}
	public void selectElement()
	{
		System.out.println("Select element from ChromeDriver");
	}
}

class IEDriver
{
	public void findElement()
	{
		System.out.println("Find element from IEDriver");
	}
	public void clickElement()
	{
		System.out.println("Click element from IEDriver");
	}
}

class WebDriverAdapter implements WebDriver
{
	IEDriver ieDriver;
	
	public WebDriverAdapter(IEDriver ieDriver)
	{
		this.ieDriver = ieDriver;
	}
	
	public void getElement()
	{
		ieDriver.findElement();
	}
	
	public void selectElement()
	{
		ieDriver.clickElement();
	}
}

public class AdapterDesignPattern {
	
	public static void main(String[] args) {
		
		ChromeDriver a = new ChromeDriver();
		a.getElement();
		a.selectElement();
		
		IEDriver e = new IEDriver();
		e.findElement();
		e.clickElement();
		
		WebDriver w = new WebDriverAdapter(e);
		w.getElement();
		w.selectElement();
		
	}
	
}



