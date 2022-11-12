import java.util.Scanner;
public class FiboPattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int a=0;
		int b=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(a + " ");
				int c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}

	}

}
