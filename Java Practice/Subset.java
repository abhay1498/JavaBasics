import java.util.Scanner;
public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int[] sub=subs(ar);
		display(sub);
		

	}
	public static int[] subs(int[] ar) {
		int i,j,k;
		for(i=0;i<ar.length;i++) {
			for(j=i;j<ar.length;j++) {
				for(k=i;k<=j;k++) {
					System.out.print(ar[k]);
				}
				System.out.println();
			}
			
		}
		return ar;
	}
	public static void display(int[] ar) {
		for(int val:ar) {
			System.out.println(val);
		}
	}

}
