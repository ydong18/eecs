package lab7;


import java.io.*;
import java.util.Scanner;



public class main {

    public static void main(String[] args) throws IOException {
            
            // ifstream(set to open and read input.txt)
            FileInputStream in = new FileInputStream("input.txt");
            
            Scanner myfile = new Scanner(in);
            
            
            
            
            try{
                // set to write in output.txt
                PrintStream out = new PrintStream("output.txt");   
                
                while (myfile.hasNextLine())
                {
                int n = myfile.nextInt(); // get size of array
                    if(n >0)
                    {
                        
                    
                    double array[][] = new double[n][n];
        
                    // read the matrix from input.txt and print it in output.txt    
                        out.println("M = ");
                        for(int i = 0; i<n; i++)
                        {
                            for(int j = 0; j<n; j++)
                            {
                                
                                array[i][j] =  myfile.nextInt();// storing value in array
                                out.print(array[i][j]+" ");
                            }
                            out.println(" ");
                        }       
                        
                        
                    
                        Matrix  matirx = new Matrix(n);
                        matirx.setData(array);  
                        double det = matirx.determinant();
                       out.println("det(M) = " + det);
                        
    
                        
                        if (det != 0)
                        {
                        
                            out.println("Inv(M) = ");
                            for(int i = 0; i<n; i++)
                            {
                                for(int j = 0; j<n; j++)
                                {
                                    out.print(matirx.inverse().getData(i,j)+" ");
                                }
                               out.println();
                            }
                        }
                    }
                }
                out.close();

            } 
            
            catch (IOException e) {
                System.out.println("failed to write");
                }
    }
}
