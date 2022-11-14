import java.util.Scanner;

public class Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int[] arr=new int[n];
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		
		}
		int max=arr[0];
		int min=arr[0];
		for(i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}else
				if(arr[i]>max) {
					max=arr[i];
				}
		}
		int span=max-min;
		System.out.println(span);
		

	}

}
