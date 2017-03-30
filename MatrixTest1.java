package lab7;

import static org.junit.Assert.*;


import org.junit.Test;

public class MatrixTest1 {

	

	
	@Test
	public void testDeterminant() 
	{
		
		Matrix matrix = new Matrix(3);
		double[][] test = new double[3][3];

		test[0][0] = 5;
		test[0][1] = 4;
		test[0][2] = 3;
		test[1][0] = 6;
		test[1][1] = 9;
		test[1][2] = 1;
		test[2][0] = 2;
		test[2][1] = 5;
		test[2][2] = 3;
		
		matrix.setData(test);// store value of array in matrix
		
		assertEquals(82.0, matrix.determinant(), 0.001);
	}
	
	@Test	
	public void getdata() 
	{
		
		Matrix matrix = new Matrix(3);
		double[][] input = new double[3][3];
		double[][] test=new double[3][3];
		
		//inserting values into  matrix input
		input[0][0] = 5;
		input[0][1] = 4;
		input[0][2] = 8;
		input[1][0] = 6;
		input[1][1] = 9;
		input[1][2] = 2;
		input[2][0] = 2;
		input[2][1] = 5;
		input[2][2] = 3;
		
		test[0][0] = 5;
		test[0][1] = 4;
		test[0][2] = 8;
		test[1][0] = 6;
		test[1][1] = 9;
		test[1][2] = 2;
		test[2][0] = 2;
		test[2][1] = 5;
		test[2][2] = 3;
		
		matrix.setData(input);
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				assertTrue(test[i][j] == matrix.getData(i,j));// it is true when the value of test and matrix are equal
			}
		}
		
	}
	
	
	@Test
	public void testInverse() 
	{
		
		Matrix myMatrix = new Matrix(3);
		double[][] m = new double[3][3];
		double[][] inverse = new double[3][3];
		
		
		m[0][0] = 1;
		m[0][1] = 2;
		m[0][2] = 3;
		m[1][0] = 2;
		m[1][1] = 5;
		m[1][2] = 3;
		m[2][0] = 1;
		m[2][1] = 0;
		m[2][2] = 8;
		
		myMatrix.setData(m);
		
		
		
		
		
		inverse[0][0] =-40;
		inverse[0][1] = 16;
		inverse[0][2] = 9;
		inverse[1][0] = 13;
		inverse[1][1] = -5;
		inverse[1][2] = -3;
		inverse[2][0] = 5;
		inverse[2][1] = -2;
		inverse[2][2] =-1;
		
		
       
        
        for(int i=0;i<3;i++)
    	{
    		for(int j=0;j<3;j++)
    		{
    			assertTrue(inverse[i][j]==myMatrix.inverse().getData(i, j));
    		}
    		
    	}
        
	}
	
	
	
	
}
