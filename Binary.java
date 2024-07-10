import java.util.*;
public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int b=0,n1=n,c=0;
        while(n1>0){
            b=n1%2*(int)Math.pow(10,c)+b;
            n1/=2;
            c++;
        }
        System.out.println("The binary form of "+n+" is: "+b);
    }
}
