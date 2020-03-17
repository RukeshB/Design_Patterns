package Factory;

public class ShapeFactory {
	public Shape getShape(String shapeType)
	{
		if(shapeType.equals("rectangle"))
		{
			return new Rec();
		}
		else if(shapeType.equals("circle"))
		{
			return new Circle();
		}
		else if(shapeType.equals("square"))
		{
			return new Square();		
		}
		else if (shapeType.equals("triangle")) {
			return new Triangle();
		}
		else {
			return null;
		}
		
	}
}
