import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n1=a;
		int n2=b;
	
		while(a%b!=0) {
			int rem=a%b;
			a=b;
			b=rem;
			
		}
		int gcd=b;
		int lcm=(n1*n2)/gcd;
		System.out.println(gcd);
		System.out.println(lcm);
		
		
		}

	
}
