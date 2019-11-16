import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter year: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean flag;
		if(n%400==0)
			flag = true;
		else if(n%100==0)
			flag=false;
		else if(n%4==0)
			flag=true;
		else
			flag=false;
		if(flag)
			System.out.println("it is a leap year");
		else
			System.out.println("it is not a leap year");

	}

}
