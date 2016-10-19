public class Sector {

	public static final double PI = 3.14159265359;
	
	// constructor
	public Sector (double radiusValue, double angleValue){
		radius = radiusValue;
		angle = angleValue;
	}

	// method for area 
	public double areaOfSector(){
		double area = PI * Math.pow( radius, 2) * angle / 360;
		return area;
	}

	// method for lengthofarc
	public double lengthOfArc(){
		return 2 * PI * radius * angle / 360;
	}

	// method for perimeter
	public double perimeterOfSector(){
		return lengthOfArc() + 2 * radius;

	}
	
	public double radius;
	public double angle;

}
