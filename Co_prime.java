import java.util.*;
public class Co_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=sc.nextInt(),n2=sc.nextInt();
        int i,f1=1,f2=1;
        for(i=2;i<n1;i++)
        if(n1%i==0){
            f1=0;
            break;
        }
        for(i=2;i<n2;i++)
        if(n2%i==0){
            f2=0;
            break;
        }
        if(f1==1&&f2==1&&Math.abs(n1-n2)==2)
        System.out.println(n1+" and "+n2+" is a co-prime number");
        else
        System.out.println(n1+" and "+n2+" is not a co-prime number");
    }
}