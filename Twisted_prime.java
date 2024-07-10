import java.util.*;
public class Twisted_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),n1=n,c=0,c1=0,rev=0;
        for(int i=1;i<=n;i++)
        if(n%i==0)
        c++;
        while(n1!=0){
            rev=rev*10+n1%10;
            n1=n1/10;
        }
        for(int i=1;i<=rev;i++)
        if(rev%i==0)
        c1++;
        if(c==2&&c1==2)
        System.out.println(n+" is a twisted prime or an emrip number");
        else
        System.out.println(n+" is not a twisted prime or an emrip number");
    }
}
