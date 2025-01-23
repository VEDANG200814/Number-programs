import java.util.*;
public class Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number");
        int n=sc.nextInt();
        int d=0,c=0,n1=n;
        while(n1>0){
            d+=n1%10*(int)Math.pow(2,c);
            n1/=10;
            c++;
        }
        System.out.println("Decimal equivalent is "+d);
    }
}
