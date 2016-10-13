public class Sector {
	public static final double PI = 3.14159265359;
	public double radiusValue; 
	public double angleValue;
	
	// constructor
	public Sector (radiusValue, angleValue){

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
