import java.util.Scanner;
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		rotate(ar,k);
		display(ar);
		}
	public static void reverse(int[] ar, int i, int j)
	{
		int la=i;
		int ra=j;
		while(la<ra) {
			int temp=ar[la];
			ar[la]=ar[ra];
			ar[ra]=temp;
			la++;
			ra--;
				
			}
		
		

	}
	public static void display(int[] ar) {
		for(int val:ar) {
			System.out.println(val);
		}
	}
	public static void rotate(int[] ar, int k) {
		k=k%ar.length;
		if(k<0) {
			k=k+ar.length;
		}
		
		
		//first array
		reverse(ar, 0, ar.length-k-1);
		
		//second half
		reverse(ar,ar.length-k,ar.length-1);
		
		//all
		reverse(ar,0,ar.length-1);
		
	}

}
