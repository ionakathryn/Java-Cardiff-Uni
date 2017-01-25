public class Box extends Rectangle
{

	public Box (double lengthValue, double widthValue, double heightValue)
	{
		super(lengthValue, widthValue);
		height = heightValue;
		width = widthValue;
		length = lengthValue;
	}
	
	public double volume()
	{
		double volumeVal = length * width * height;
		System.out.println("Volume: " + volumeVal);
		return volumeVal;
	}
	

	public double surfaceArea()
	{
		double surface = 2 * area() + perimeter() * height;
		System.out.println("Surface: " + surface);
		return surface;
	}

	public double bodyDiagonalLength()
	{
		double bodyDiagonalLengthVal = Math.sqrt(Math.pow(height, 2) + Math.pow(length, 2));
		System.out.println("Body diagonal Length: " + bodyDiagonalLengthVal);
		return bodyDiagonalLengthVal;
	}
	

	public double height, length, width;
}