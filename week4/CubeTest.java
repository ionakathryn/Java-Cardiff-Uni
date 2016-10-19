public class CubeTest{
	public static void main (String[] args){
		Cube cube1 = new Cube (10);

		System.out.println("Volume = " + cube1.volume());
		System.out.println("Base Area = " + cube1.baseArea());
		System.out.println("Surface Area = " + cube1.totalSurfaceArea());
		System.out.println("Length of Base Diagonal = " + cube1.lengthOfBaseDiagonal());
	}
}
