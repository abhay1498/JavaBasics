import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i;
		for(i=2;i*i<=num;i++) {
			while(num%i==0) {
				num=num/i;
				System.out.println(i);
			}
			
			}
		if(num!=1) {
			System.out.println(num);
		}
	}

}
