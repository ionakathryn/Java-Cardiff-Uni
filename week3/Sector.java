public class Sector {
	public static final int PI = 3.14159265359;

	// constructor
	public Sector (double radiusValue, double angleValue){

	}

	// method for area 
	public double areaOfSector(){
		return angleValue / 360 * PI * radiusValue.pow(2);
	}

	// method for lengthofarc
	public double lengthOfArc(){

		double lengthOfArc = angleValue / 360 * PI * radiusValue;
		return lengthOfArc;
	}

	// method for perimeter
	public double perimeterOfSector(){
	}

}
