import java.util.*;
public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sqn=n*n,sqn1=sqn,c=0,lp,fp,s;
        while(sqn1!=0){
            c++;
            sqn1/=10;
        }
        if(c%2==0){
            lp=n%(int)Math.pow(10,c/2);
            fp=n/(int)Math.pow(10,c/2);
            s=lp+fp;
            if(s==n)
            System.out.println(n+" is a Kaprekar number");
            else
            System.out.println(n+" is not a Kaprekar number");
        }
        else
        System.out.println(n+" is not a Kaprekar number");       
    }
}
