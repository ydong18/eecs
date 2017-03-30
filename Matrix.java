package lab7;

import static java.lang.Math.pow;

public class Matrix{
	public static int MaxSize = 10;
	private double mdata[][];
	private int n = 0;
	
		
	//constructor to set value and array
	public Matrix(int num)
	{
		n=num;
		mdata = new double[n][n];
	}
	
	
	public void setData(double[][] Array)
	{
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				mdata[i][j] = Array[i][j];// inserting value
			}
		}
	}
	
	
	public double getData(int row, int col)
	{
		return mdata[row][col];
	}
		
	
	public double determinant() 
	{
		double det = 0.0;
		//caculating determinant in different conditon
		if (n == 1)
		{
			det = mdata[0][0];
		}
		else if (n == 2)
		{
			det = mdata[0][0] * mdata[1][1] - mdata[0][1] * mdata[1][0];
		}
		else
		{
			for (int i = 0; i < n; ++i)
			{
				det += pow(-1.0, (double)i) * mdata[0][i] * subMatrix(0, i).determinant();
			}
		}
			
		return det;
	}
	
	
	

	public Matrix inverse(){
		Matrix inv = new Matrix(n);
		double det = determinant();
		
		for (int i = 0; i < n; ++i)
		{
			for (int j = 0; j < n; ++j)
			{
				inv.mdata[i][j] = pow(-1.0, (double)i + j) * subMatrix(j, i).determinant() 
			}
		}
		
		return inv;
	}


	public Matrix subMatrix(int r, int c)
	{
		Matrix sub = new Matrix(n - 1);
		
		int row = 0; 
		for (int i = 0; i < n; ++i)
		{
			if (i == r) continue;
			
			int col = 0;
			for (int j = 0; j < n; ++j)
			{
				if (j == c) continue;
				
				sub.mdata[row][col] = mdata[i][j];
				++col;
			}
			++row;
		}
		return sub;
	}

	
	
	
}