import java.util.Arrays;
import java.util.Scanner;

public class StateOfWakanda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] ar=new int[n][m];
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		for(int[] display:ar) {
			System.out.println(Arrays.toString(display));
		}
		for(int j=0;j<ar[0].length;j++)
		{
			if(j%2==0) {
				for(int i=0;i<ar.length;i++) {
					System.out.println(ar[i][j]);
				}}
				else {
					for(int i=ar.length-1;i>=0;i--) {
						System.out.println(ar[i][j]);
					}
				}
			}
		}

	
}
