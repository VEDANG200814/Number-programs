import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)//for(int i=1;i<=(int)Math.sqrt(n);i++)
        if(n%i==0)//{
        // if(i==1||i==n)
        // c++;
        // else
        // c+=2;
        //}
        c++;
        if(c==2)
        System.out.println(n+" is a prime number");
        else
        System.out.println(n+" is not a prime number");
    }
}
