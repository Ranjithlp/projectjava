import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) 
			{
			
			TicTacToetest t = new TicTacToetest();
			Scanner s = new Scanner(System.in);
			int x=0,y=0;
			do
			{
				System.out.println(t.player==t.X?"Player X turn":"Player O turn");
				System.out.println("Enter x and y places");
				x=s.nextInt();
				y=s.nextInt();
				
				t.putSign(x, y);
				System.out.println(t.toString());
				System.out.println("_____________________________");
				t.displayWinner();
				
			}while(t.isEmpty);
		}
	}

	
	