import java.util.*;
public class Disarium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n,c=0,s=0;
        while(n1!=0){
            n1/=10;
            c++;
        }
        n1=n;
        while(n1!=0){
            s+=(int)Math.pow(n1%10,c);
            c--;
            n1/=10;
        }
        if(s==n)
        System.out.println(n+" is a disarium number");
        else
        System.out.println(n+" is not a disarium number");
    }
}