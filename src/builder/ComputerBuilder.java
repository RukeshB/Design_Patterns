package builder;

public class ComputerBuilder {
	private int ram;
	private String processor;
	private int graphics;
	private int rom;
	private int storage;
	
	public ComputerBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public ComputerBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public ComputerBuilder setGraphics(int graphics) {
		this.graphics = graphics;
		return this;
	}
	public ComputerBuilder setRom(int rom) {
		this.rom = rom;
		return this;
	}
	public ComputerBuilder setStorage(int storage) {
		this.storage = storage;
		return this;
	}
	
	public Computer getComputer()
	{
		return new Computer(processor, ram, graphics, rom, storage);
	}
	
	
}
