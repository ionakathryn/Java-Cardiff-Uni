import java.io.PrintStream;

public class FormatOutput

{
	public static void main (String [] args){
	PrintStream output = new PrintStream (System.out);
	String str = "Output";
	int inum = 27;
	double dnum = 13.75;

	output.format ("%7s%7d%7.2f\n", str,inum,dnum);
	}
}