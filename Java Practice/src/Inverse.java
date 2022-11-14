import java.util.Scanner;
public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int[] inv=inverse(ar);
		
		display(inv);
		
	}
	public static int[] inverse(int[] ar) {
		int[] inver=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			int val=ar[i];
			inver[val]=i;
		}
		
		return inver;
	}
	public static void display(int[] ar) {
		for(int val:ar) {
			System.out.println(val);
		}
	}

}
