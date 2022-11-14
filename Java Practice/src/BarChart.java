import java.util.Scanner;
public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		int i;
		for(i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int max=ar[0];
		for(i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
				
			}
		}
		for(int j=max;j>=1;j--){
			for(int b=0;b<ar.length;b++) {
				if(ar[b]>=j) {
				
					System.out.print("* ");
				}else {
					System.out.print("  ");
				} 
			}
			System.out.println();
		}
		

	}
	

}
