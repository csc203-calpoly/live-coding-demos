class Kaiju {
	
	private Point position;
	private int size;
	private String name;
	private double life;
	//example of a static field - every Kaiju has the same minimum size
	private static int minSize = 100;

	//example of a static constant
	public static final double PI=3.1416; 

	//constructor	
	public Kaiju(Point start, int size, String name, double life) {
		this.position = start;
		this.size = Math.max(minSize, size);
		this.name = name;
		this.life = life;
	}

	public Point getLocation() {  return position; }
	public String getName() { return name; }
	public int getSize() { return size; }
	public double getLife() { return life; }

	//example of using a setter to control mutation of size
	public void setSize(int inSize) {
		if (inSize < minSize) {
			size = minSize;
		} else {
			size = inSize;
		}
	}

	//example of an instance method that compares two Kaiju sizes
	public Kaiju whichStronger(Kaiju compareTo) {
		if (this.size > compareTo.size) {
			return this;
		} 
		return compareTo;
	}

}
