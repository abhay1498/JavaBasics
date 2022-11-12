import java.util.Scanner;

public class RotateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int k=sc.nextInt();
		int temp=num;
		int nod=0;
		//Finding count of digits in the given number 
		while(temp>0) {
			temp=temp/10;
			nod++;
			
		}
		int knum=1;
		int kmul=1;
		int join = 0;
		k=k%nod;
		if(k<0) {
			k=k+nod;
		}
		
			int div=(int)Math.pow(10, k);

			
			knum=num%div;
			kmul=num/div;
			join=knum*(int)Math.pow(10, nod-k)+kmul;

			
		System.out.println(join);

		
		}
		

	}


