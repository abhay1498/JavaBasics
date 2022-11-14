import java.util.Scanner;
public class Difference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int[] ar1=new int[n1];
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int[] ar2=new int[n2];
		for(int i=0;i<ar2.length;i++) {
			ar2[i]=sc.nextInt();
		}
		
		int[] diff=new int[n2];
		int i=ar1.length-1;
		int carry=0;
		int j=ar2.length-1;
		int k=diff.length-1;
		while(k>=0) {
			int d=0;
			int a1v=i>=0? ar1[i]:0;
			if(ar2[j]+carry>=a1v) {
				d=ar2[j]+carry - a1v;
			}else {
				d=ar2[j]+carry+10 - a1v;
				carry-=1;
			}
			diff[k]=d;
			i--;
			j--;
			k--;
			
			}	
		int id=0;
		while(id<diff.length) {
			if(diff[id]==0) {
				id++;
			}else {
				break;
			}
		}
		while(id<diff.length) {
			System.out.println(diff[id]);
			id++;
			
		}
		
		
		

	}
	

}
