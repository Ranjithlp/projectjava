
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";
	       String primePalin = "";

	       for (i = 1; i <= 1000; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 1000 are :");
	       System.out.println(primeNumbers);
		
	}

}
