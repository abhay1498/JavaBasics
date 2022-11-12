import java.util.Scanner;


public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int t=sc.nextInt();
			/*int count=0;
			
			for(int num=2;num*num<=t;num++) {
				if(t%num==0)
					count++;
					if(count>2)
						break;
			}
			if(count==0)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
		}*/
			int div=2;
			while(div*div<=t) {
				if(t%div==0) {
				break;
				}
			div++;
			}
		if(div*div>t) {
			System.out.println("Prime");}
			else {
				System.out.println("Not Prime");
		}
		
		

	}

}}
