import java.util.Scanner;

public class SubsetsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int limit=(int)Math.pow(2, ar.length);
		
		for(int i=0;i<limit;i++) {
			String set="";
			int temp=i;
			for(int j=ar.length-1;j>=0;j--) {
				int r=temp%2;
				temp=temp/2;
				if(r==0) {
					set="-\t"+set;
				}else {
					set=ar[j]+"\t"+set;
				}

			}
			System.out.println(set);

		}
	}

}
