import java.lang.Math;
public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = Integer.parseInt(args[0]);
		int v = Integer.parseInt(args[1]);
		double w = 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		System.out.println(w);

	}

}
