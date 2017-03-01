public class Polygon extends Isoceles
{
	Polygon(double lengthValue, double sidesValue)
	{
		super(lengthValue);
		sides = sidesValue;
	}
	public double polygonArea()
	{
		double polygonarea = area(360/sides) * sides;
		return polygonarea;
	}
	public double polygonPerimeter()
	{
		double perimeter = baseLength(360/sides) * sides;
		return perimeter;
	}
	private double sides;
}
