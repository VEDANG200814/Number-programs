import java.util.*;
public class Abundant_Perfect_Deficient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),s=0;
        for(int i=1;i<n;i++)
        if(n%i==0)
        s+=i;
        if(s==n)
        System.out.println(n+" is a perfect number");
        else if(s>n)
        System.out.println(n+" is an abundant number");
        else
        System.out.println(n+" is a deficient number");
    }
}
