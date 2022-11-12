import java.util.Scanner;

public class BenjaminsBulb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		for(i=1;i*i<=n;i++) {
			System.out.println(i*i);
		}

	}

}
