public class Cube{

	// constructor
	public Cube(double lengthValue){
	length = lengthValue;
	}

	public double baseArea(){
		return Math.pow(length, 2);
	}

	public double totalSurfaceArea(){
		return 6 * Math.pow (length, 2);
	}

	public double volume(){
		return Math.pow(length, 3);
	}

	public double lengthOfBaseDiagonal(){
		return Math.sqrt (2) * length;
	}

	public double lengthOfBodyDiagonal(){
		return Math.sqrt (3) * length;
	}

	private double length;
}
