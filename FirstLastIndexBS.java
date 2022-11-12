import java.util.Scanner;

public class FirstLastIndexBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int l=0;
		int h=ar.length-1;
		int li=-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(k<ar[mid]) {
				h=mid-1;
				
			}else if(k>ar[mid]) {
				l=mid+1;
			}else {
				li=mid;
				l=mid+1;
			}
			
		}
		System.out.println(li);
		l=0;
		h=ar.length-1;
		int fi=-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(k<ar[mid]) {
				h=mid-1;
				
			}else if(k>ar[mid]) {
				l=mid+1;
			}else {
				fi=mid;
				h=mid-1;
			}
			

	}
		System.out.println(fi);
		

}}
