import java.util.*;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sq=n*n,c=0,n1=n;
        while(n1!=0){
            n1/=10;
            c++;
        }
        if(n==sq%(int)Math.pow(10,c))
        System.out.println(n+" is an automorphic number");
        else
        System.out.println(n+" is not an automorphic number");
    }
}
