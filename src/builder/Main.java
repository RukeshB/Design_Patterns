package builder;

public class Main {
	public static void main(String[] args)
	{
		Computer c = new ComputerBuilder().setGraphics(2).setProcessor("i5").setRam(8).getComputer();
		System.out.println(c);
	}
}
