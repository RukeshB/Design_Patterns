package Factory;

public class Main {
	public static void main(String[] args)
	{
		ShapeFactory sf = new ShapeFactory();
		
		Shape s1 = sf.getShape("rectangle");
		s1.draw();
		
		Shape s2 = sf.getShape("triangle");
		s2.draw();
	}
}
