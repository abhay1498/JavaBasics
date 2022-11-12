import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			int icj=1;

			for(j=0;j<=i;j++) {
				System.out.print(icj + " ");
				int icj1=(icj*(i-j))/(j+1);
				icj=icj1;
			}
			System.out.println();
		}

	}

}
