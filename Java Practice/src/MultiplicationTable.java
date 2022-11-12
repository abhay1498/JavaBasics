import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		for(i=1;i<=10;i++) {
			int mult=n*i;
			System.out.println(n + "*" + i + "=" + mult);
		}

	}

}
