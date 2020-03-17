package builder;

public class Computer {
	private int ram;
	private String processor;
	private int graphics;
	private int rom;
	private int storage;
	
	public Computer(String processor, int ram, int graphics, int rom, int storage)
	{
		this.ram= ram;
		this.graphics = graphics;
		this.rom = rom;
		this.processor = processor;
		this.storage = storage;
	}
	
	public String tostring() {
		return "Ram= "+ ram + " Rom= "+rom+" Processor= "+processor+" graphics= "+graphics+" Storage= "+storage;
	}
}
