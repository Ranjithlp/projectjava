import java.util.Scanner;
public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float r=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		float n = scan.nextInt();
		//System.out.println(n);
		if(n!=0)
		{
			for(float i=2;i<=n;i++)
			{
				r = r + 1/i;
			}
		}
		System.out.println(r);

	}

}
