import java.util.Arrays;
//import java.io.*;
//import java.util.AbstractCollection;
public class StrAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "earth";
		String b = "heart";
		char c[] = a.toCharArray();
		char d[] = b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		boolean flag = true;
		if(c.length!=d.length)
			flag = false;
		for(int i=0;i<c.length;i++)
			if(c[i]!=d[i])
				flag = false;
		
		if(flag)
		{
			System.out.println("anagrams");
		}
		else
			System.out.println("not anagrams");

	}

}
