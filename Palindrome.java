import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n,rev=0;
        while(n1!=0){
            rev=rev*10+n1%10;
            n1/=10;
        }
        if(n==rev)
        System.out.println(n+" is a palindrome number");
        else
        System.out.println(n+" is not a palindrome number");
    }
}