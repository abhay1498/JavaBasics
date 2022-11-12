import java.util.Scanner;

public class Pattern4 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=0;
		int star=n;
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
            space++;
            star--;
                
            }
            

            
		
		

	}

}
