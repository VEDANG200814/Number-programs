import java.util.*;
public class Twin_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0,c1=0;
        for(int i=1;i<=a;i++)
        if(a%i==0)
        c++;
        for(int i=1;i<=b;i++)
        if(b%i==0)
        c1++;
        if(c==2&&c1==2&&Math.abs(a-b)==2)
        System.out.println(a+" and "+b+" are twin prime numbers");
        else
        System.out.println(a+" and "+b+" are not twin prime numbers");
    }
}
