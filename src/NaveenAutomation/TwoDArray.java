package NaveenAutomation;

public class TwoDArray 
{

	public static void main(String[] args)
	{
		String x [][] = new String [3][5]; 
		
		System.out.println("Length of row: "+x.length );
		System.out.println("Length of column: "+x[0].length);
		
		x[0][0] = "S";  x[1][0] = "M";   x[2][0] = "S"; 
		x[0][1] = "U";  x[1][1] = "A";   x[2][1] = "A";
		x[0][2] = "N";  x[1][2] = "N";   x[2][2] = "M";
		x[0][3] = "I";  x[1][3] = "J";   x[2][3] = "R";
		x[0][4] = "L";  x[1][4] = "U";   x[2][4] = "T";
		
		
		
		
		for(int i = 0 ; i<x.length ; i++)
		{
			for(int j = 0 ; j< x[0].length ; j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}

}
