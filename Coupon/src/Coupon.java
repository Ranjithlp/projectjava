
public class Coupon {
	
    public static int getCoupon(int n) {
    	int r = (int)(Math.random() * n);
        return r;
    }

    public static int collect(int n) {
        boolean[] isCollected = new boolean[n];  
        int count = 0;                           
        int distinct  = 0;                       
        while (distinct < n) 
        {
            int value = getCoupon(n);             
            count++;                             
            if (!isCollected[value]) 
            {           
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
        int count = collect(n);
        System.out.println(count);

	}

}
