import java.util.*;
public class Buzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n%7==0||n%10==7)
        System.out.println(n+" is a buzz number");
        else
        System.out.println(n+" is not a buzz number");
    }
}