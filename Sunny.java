import java.util.*;
class Sunny{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n+1,sq=(int)Math.sqrt(n1);
        if(n1==sq*sq)
        System.out.println(n+" is a sunny number");
        else
        System.out.println(n+" is not a sunny number");
    }
}
