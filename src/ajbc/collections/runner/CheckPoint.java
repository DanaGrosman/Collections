package ajbc.collections.runner;

public class CheckPoint {
	protected String name;
	protected String address;
	protected int position;
	
	public CheckPoint(String name, String address, int position) {
		super();
		this.name = name;
		this.address = address;
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "CheckPoint [name=" + name + ", address=" + address + ", position=" + position + "]";
	}	
}
