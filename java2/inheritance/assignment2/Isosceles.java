public class Isosceles
{
	private double length;
	public Isosceles(double lengthValue)
	{
	length = lengthValue;
	}

	public double area(double angle)
	{
		return 0.5 * length * length * Math.sin(angle * 3.14159 / 180);
	}

	public double baseLength(double angle)
	{
		return 2 * length * Math.sin((angle/2) * 3.14159 / 180);
	}
}
