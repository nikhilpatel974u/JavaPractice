//java.vm.version=12.0.1+12
abstract class TV
{
	Remote remote;
	
	TV(Remote r)
	{
		this.remote = r ;
	}
	
	abstract void on();
	abstract void off();
	
}

class Sony extends TV
{
	Remote remoteType;
	Sony(Remote r)
	{
		super(r);
		this.remoteType = r ;
	}
	
	public void on()
	{
		System.out.println("Sony TV on");
		remoteType.on();
	}
	
	public void off()
	{
		System.out.println("Sony TV off");
		remoteType.off();
	}
}

class Philips extends TV
{
	Remote remoteType;
	
	public Philips(Remote r)
	{
		super(r);
		this.remoteType = r;
	}
	
	public void on()
	{
		System.out.println("Philips TV on");
		remoteType.on();
	}
	
	public void off()
	{
		System.out.println("Philips TV off");
		remoteType.off();
	}
}

interface Remote
{
	public void on();
	public void off();
}

class OldRemote implements Remote
{
	public void on()
	{
		System.out.println("ON with Old Remote");
	}
	
	public void off()
	{
		System.out.println("OFF with Old Remote");
	}
}

class NewRemote implements Remote
{
	public void on()
	{
		System.out.println("ON with New Remote");
	}
	
	public void off()
	{
		System.out.println("OFF with New Remote");
	}
}

public class BridgeDesignPattern {
	
	public static void main(String[] args) {
		TV sonyOldRemote = new Sony(new OldRemote());
		sonyOldRemote.on();
		sonyOldRemote.off();
		
		System.out.println();
		
		TV sonyNewRemote = new Sony(new NewRemote());
		sonyNewRemote.on();
		sonyNewRemote.off();
		
		System.out.println();
		
		TV philipsOldRemote = new Philips(new OldRemote());
		philipsOldRemote.on();
		philipsOldRemote.off();
		
		System.out.println();
		
		TV philipsNewRemote = new Philips(new NewRemote());
		philipsNewRemote.on();
		philipsNewRemote.off();
			
	}
}
