import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		
		int[] ar1=new int[n1];
		
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int[] ar2=new int[n2];
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i]=sc.nextInt();
		}
		int carry=0;
		int[] sum=new int[n1>n2? n1:n2];
		int i=ar1.length-1;
		int j=ar2.length-1;
		int k=sum.length-1;
		while(k>=0) {
			int d=0;
			if(i>=0); {
				d+=ar1[i];
				
			}
			if(j>=0) {
				d+=ar2[j];
			}
			d+=carry;
			carry=d/10;
			d=d%10;
			sum[k]=d;
			i--;
			j--;
			k--;
		}
		if(carry!=0) {
			System.out.println(carry);
		}
		for(int val:sum) {
			System.out.println(val);
		}
		
		
		
		

	}

}
