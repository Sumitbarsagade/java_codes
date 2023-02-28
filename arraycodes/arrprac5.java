package abc;
//Create a java program to add two matrices of size 2x3

public class arrprac5 {
	public static void main(String arg[]) {
		
		int [][] matrix1= {{1,2,3},
		  				   {4,5,6}};
		
		int [][] matrix2= {{1,8,3},
				          {4,9,6}};
		
		int [][] matrix3= {{0,0,0},
				          {0,0,0}};
		
		for(int i=0; i< matrix1.length; i++)
		{
			for(int j=0; j< matrix1[i].length; j++)
			{
				matrix3 [i][j]=matrix1[i][j] +matrix2[i][j];
			}
		}
		
		for(int i=0; i<matrix1.length; i++)
		{
			for(int j=0; j< matrix1[i].length; j++) {
				
				System.out.print(matrix3[i][j]);
				
				
			}
			System.out.println(" ");
		}
		  				  
		  				  
	}
	 

}
