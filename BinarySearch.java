import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int low=0;
		int hi=ar.length-1;
		while(low<=hi){
			int mid=(low+hi)/2;

			if(k>ar[mid]) {
				low=mid+1;
				
			}else if(k<ar[mid]) {
				hi=mid-1;
			}else {
				System.out.println(mid);
				return;
			}
		}
		System.out.println(-1);

	}

}
