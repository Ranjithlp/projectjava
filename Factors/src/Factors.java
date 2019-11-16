import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i+" ");
				n=n/i;
			}
		}
		if(n>2)
			System.out.println(n);
		

	}

}
