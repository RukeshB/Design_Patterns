package singleton;

public class ComputerSingleton {
	private static ComputerSingleton singletonobj = new ComputerSingleton();
	
	private ComputerSingleton() {}
	
	public static ComputerSingleton getSingleton()
	{
		return singletonobj;
	}
	
	public String tostring(String processor, int ram, int graphics, int storage) {
		return "Ram= "+ ram + " Processor= "+processor+" graphics= "+graphics+" Storage= "+storage;
	}
}
