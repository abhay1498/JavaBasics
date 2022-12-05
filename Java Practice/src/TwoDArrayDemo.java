import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[][] ar=new int[3][3];
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				ar[i][j]=sc.nextInt();			
				}
		}
		for(int[] table:ar) {
			System.out.println(Arrays.toString(table));
		}
	}
}

