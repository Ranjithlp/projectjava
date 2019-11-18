import java.util.*; 
import java.lang.*;
public class VendingMachine {
	 
    public static void countCurrency(int amount) 
    { 
        int[] notes = { 1000, 500, 100, 50, 20, 10, 5, 1 }; 
        int[] noteCounter = new int[8];
        int minNotes = 0;
       
        for (int i = 0; i < 8; i++) { 
            if (amount >= notes[i]) { 
                noteCounter[i] = amount / notes[i]; 
                amount = amount - noteCounter[i] * notes[i]; 
            } 
        } 
       
        System.out.println("Currency Count ->"); 
        for (int i = 0; i < 8; i++) { 
            if (noteCounter[i] != 0) { 
                System.out.println(notes[i] + " : "
                    + noteCounter[i]); 
            } 
        } 
        System.out.println("The minimum notes to returned: ");
        for(int i=0;i<8;i++) {
        	minNotes = minNotes + noteCounter[i];
        }
        System.out.print(minNotes);
    } 
      
    public static void main(String argc[]){ 
        int amount = 878; 
        countCurrency(amount); 
    } 
      
} 


