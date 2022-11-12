import java.util.Scanner;

public class Pattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int star=1;
		int i,j;
		for ( i = 1; i <= n; i++ )
        {
            for ( j = 1; j <= space; j++)
            {
                System.out.print(" ");
                }
            for(j=1;j<=star;j++)
            {
            	System.out.print("*");
            }
            System.out.println();
            space--;
            star++;
                
            }
            

            
		
		

	}

}
