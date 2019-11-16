import java.util.Arrays;
public class PrimePalAna {
	
	static final int NO_OF_CHARS = 256;
	
	public static boolean palin(int a)
	{
		String s = Integer.toString(a);
		String p = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			p = p + s.charAt(i);
		}
		if(p.equals(s))
		{
			return true;
		}
		else
			return false;
	}
	
	static boolean areAnagram(String str1, String str2) 
    { 
        // Create two count arrays and initialize 
        // all values as 0 
        int[] count = new int[NO_OF_CHARS]; 
        int i; 
  
        // For each character in input strings,  
        // increment count in the corresponding  
        // count array 
        for (i = 0; i < str1.length() && i < str2.length(); 
                                                   i++) 
        { 
            count[str1.charAt(i)]++; 
            count[str2.charAt(i)]--; 
        } 
  
        // If both strings are of different length. 
        // Removing this condition will make the program  
        // fail for strings like "aaca" and "aca" 
        if (str1.length() != str2.length()) 
          return false; 
  
        // See if there is any non-zero value in  
        // count array 
        for (i = 0; i < NO_OF_CHARS; i++) 
            if (count[i] != 0) 
                return false; 
         return true; 
    } 

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
		     boolean b = palin(i);
		     if(b)
		    	 primePalin = primePalin + i+" ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 1000 are :");
	       System.out.println(primeNumbers);
	       System.out.println("Prime numbers which are palindrome are: ");
	       System.out.println(primePalin);
	       String[] str = primeNumbers.split(" ");
	       /*for(int j=0;j<str.length;j++)
	       {
	    	   System.out.println(str[j]);
	       }*/
	       for (int j = 0; j < str.length; j++) 
	            for (int k = j+1; k < str.length; k++) 
	                if (areAnagram(str[j], str[k])) 
	                    System.out.println(str[j] + " is anagram of " + str[k]);
		

		

	}

}
