import java.util.Scanner;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sp=2*n-3;
		int st=1;
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=st;j++) {
				System.out.print(j + " ");
			}
			for(j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			if(i==n) {
				st--;
			}
			for(j=st;j>=1;j--) {
				System.out.print(j + " ");
			}
			System.out.println();
			st++;
			sp-=2;
			
		}

	}

}
