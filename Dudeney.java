import java.util.*;
public class Dudeney {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n,s=0;
        double cr=(int)Math.cbrt(n);
        if(n>0){
            while(n1!=0){
                s+=n1%10;
                n1/=10;
            }
            if(cr*cr*cr==n && cr==s)
            System.out.println(n+" is a dudeney number");
            else
            System.out.println(n+" is not a dudeney number");
        }
        else
        System.out.println(n+" is not a dudeney number");
    }
}
