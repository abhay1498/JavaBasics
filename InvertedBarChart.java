import java.util.Scanner;
public class InvertedBarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int max=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		for(int floor=max;floor>=1;floor--) {
			for(int i=0;i<ar.length;i++) {
				if(ar[i]>=floor) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		

	}

}
