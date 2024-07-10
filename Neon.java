import java.util.*;
public class Neon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sq=n*n,s=0;
        while(sq!=0){
            s+=sq%10;
            sq/=10;
        }
        if(s==n)
        System.out.println(n+" is a neon number");
        else
        System.out.println(n+" is not a neon number");
    }
}
