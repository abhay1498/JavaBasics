import java.util.Scanner;
public class BrokenEconomyBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
			}
		int d=sc.nextInt();
		int ceil=0;
		int floor=0;
		int l=0;
		int h=ar.length-1;
		while(l<=h) {
			int mid = (l+h)/2; 
			if(d<ar[mid]) {
				h=mid-1;
				ceil=mid;
			}else if(d>ar[mid]) {
				l=mid+1;
				floor=mid;
			}else {
				ceil=ar[mid];
				floor=ar[mid];
				break;
			}
		}
		
		System.out.println(ceil);
		System.out.println(floor);

	}

}
