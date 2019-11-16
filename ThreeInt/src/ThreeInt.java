
public class ThreeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,0,-1,-2,3};
		int n = a.length;
		int count=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;j<n;j++) {
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
