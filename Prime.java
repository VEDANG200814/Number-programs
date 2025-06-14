import java.util.*;
public class Prime {
    public static void main(String[] args) {
        long s=System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c=0;
        // int f=1;
        for(int i=1;i<=n;i++)
        // for(int i=2;i<=(int)Math.sqrt(n);i++)
        if(n%i==0)
        // {
            // f=0;
            // break;
        // }
        c++;
        if(c==2)
        // if(f==1)
        System.out.println(n+" is a prime number");
        else
        System.out.println(n+" is not a prime number");
        long e=System.currentTimeMillis();
        System.out.println(e-s);
    }
}
