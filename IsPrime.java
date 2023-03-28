import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        // Prime Number Generation
    
    int i,j,n;

    Scanner scn = new Scanner(System.in);
    
    System.out.print("Enter the number till which you want prime numbers: ");
    n = scn.nextInt();
    
    System.out.println("Prime numbers are:-\n");    
    for(i=2;i<=n;i++)
    {
        int c=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
                c++;
        }
         
       if(c==2)
            System.out.println(i);
    }
}
}
