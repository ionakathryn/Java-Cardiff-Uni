public class Box extends Rectangle
{
	public Box (double lengthValue, double widthValue, double heightValue)
	{
	super(lengthValue, widthValue);
	height = heightValue;

	}
	public double volume()
	{
	double volumeVal = area() * height;
	return volumeVal;
	}
	public double surfaceArea()
	{
	double surface = 2 * area() + perimeter() * height;
	return surface;
	}
	public double bodyDiagonalLength()
	{
	double bodyDiagonalLengthVal = Math.sqrt(Math.pow(height, 2) + Math.pow(diagonalLength(),2));
	return bodyDiagonalLengthVal;
	}

	public double angle()
	{
	double angle = (Math.asin(height / bodyDiagonalLength()));
	System.out.println (Math.toDegrees(angle));

	}
	private double height;

}
