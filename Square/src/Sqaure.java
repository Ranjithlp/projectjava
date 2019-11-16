import java.util.Scanner;
import java.lang.Math;
public class Sqaure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		for(int i=0;i<=n;i++)
		{
			double a = Math.pow(2, i);
			System.out.println(a);
		}
		

	}

}
