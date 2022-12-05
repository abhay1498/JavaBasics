import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int m1=sc.nextInt();
		int[][] a=new int[n1][m1];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();			
				}
		}
		int n2=sc.nextInt();
		int m2=sc.nextInt();
		int[][] b=new int[n2][m2];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j]=sc.nextInt();			
				}
		}
		
			int[][] c=new int[n1][m2];
			for(int i=0;i<c.length;i++) {
				for(int j=0;j<c[i].length;j++) {
					for(int k=0;k<m1;k++) {
						c[i][j]+=(a[i][k]*b[k][j]);
					}
				}
			}
			
		
			for(int[] i:c) {
				System.out.println(Arrays.toString(i));
				
					}
				
		}

	}



