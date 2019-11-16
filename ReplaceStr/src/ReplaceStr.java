import java.util.Scanner;
public class ReplaceStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello <<username>>,How are you?";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username: ");
        String a = scan.nextLine();
        if(a.length()>=3)
        {
            str = str.replace("<<username>>",a);
            System.out.println(str);
        }
        else{
            System.out.println("username should have min 3 char");
        }

	}

}
