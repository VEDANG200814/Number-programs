import java.util.*;
public class Krishnamurthy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),n1=n,d=0,s=0,f=1;
        while(n1>0){
            d=n1%10;
            f=1;
            for(int i=1;i<=d;i++)
            f=f*i;
            s+=f;
            n1/=10;
        }
        if(s==n)
        System.out.println(n+" is a krishnamurthy number");
        else
        System.out.println(n+" is not a krishnamurthy number");
    }
}