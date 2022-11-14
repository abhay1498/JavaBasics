import java.util.Scanner;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int[] ar=new int[n];
		for(i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the data");
		int d=sc.nextInt();
		for(i=0;i<ar.length;i++) {
			if(ar[i]==d) {
				System.out.println(i);
				break;
			}}
				System.out.println("-1");
		}

	}


