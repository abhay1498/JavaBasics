import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
			
		}
		int i=0;
		int j=ar.length-1;
		while(i<j) {
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
			
		}
		for(int k=0;k<ar.length;k++) {
			System.out.println(ar[k]);
		}
		

	}

}
