public class Polygon extends Isosceles
{
	Polygon(double lengthValue, double sidesValue)
	{
		super(lengthValue);
		sides = sidesValue;
	}

	public double polygonArea()
	{
		double polygonarea = area(360/sides) * sides;
		System.out.println(polygonarea);
		return polygonarea;
	}

	/*public polygonPerimeter()
	{

	}
	*/

	private double sides;
}
