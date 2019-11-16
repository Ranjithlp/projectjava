import java.io.*;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values: ");
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a[1].length;j++)
			{
				a[i][j] = scan.nextInt();
			}
		}
		PrintWriter out = new PrintWriter(System.out);
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a[1].length;j++)
			{
				out.print(a[i][j]);
			}
		}
		
		out.flush();
		out.close();
	}

}
