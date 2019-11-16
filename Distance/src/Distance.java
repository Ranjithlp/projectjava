import java.lang.Math;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		double dist = Math.sqrt((a*a + b*b));
		System.out.println(dist);
	}

}
