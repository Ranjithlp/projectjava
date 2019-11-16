import java.util.Scanner;
import java.lang.Math;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double firstroot = 0,secondroot = 0;
		System.out.println("Enter the value of a: ");
		double a = scan.nextInt();
		System.out.println("Enter the value of b: ");
		double b = scan.nextInt();
		System.out.println("Enter the value of c: ");
		double c = scan.nextInt();
		
		double d = (b*b)-(4*a*c);
		firstroot = (-b+Math.sqrt(d))/(2*a);
		secondroot = (-b-Math.sqrt(d))/(2*a);
		System.out.println(firstroot+" "+secondroot);	
	}

}
