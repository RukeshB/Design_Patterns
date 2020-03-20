package singleton;

public class Main {
	public static void main(String[] args)
	{
		ComputerSingleton computerSingleton = ComputerSingleton.getSingleton();	
		
		String pString= computerSingleton.tostring("i5",8,2,500);
		System.out.println(pString);
	}
}
