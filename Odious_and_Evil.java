import java.util.*;
public class Odious_and_Evil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n,s=0,d=0,b=0,c=0;
        while(n1!=0){
            d=n1%2;
            n1/=2;
            b=d*(int)Math.pow(10,c)+b;
            c++;
        }
        while(b!=0){
            s+=b%10;
            b/=10;
        }
        if(s%2!=0)
        System.out.println(n+" is a odious number");
        else
        System.out.println(n+" is a evil number");
    }
}
