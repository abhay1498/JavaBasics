import java.util.Scanner;

public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int k=sc.nextInt();
		int div=(int)Math.pow(10, k);
		
		int c=0;
		while(num!=0) {
			num=num/10;
			c++;
		}
		
		
		k=k%c;
		if(k<0) {
			k=k+c;
		}
		int knum=num%div;
		int krem=num/div;
		int temp=krem;
		int count=0;
		while(temp!=0) {
			temp=temp/10;
			count++;
			
		}
		int join=knum*(int)Math.pow(10, count)+krem;
		System.out.println(join);

		
		}
		

	}


