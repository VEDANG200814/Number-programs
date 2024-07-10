import java.util.*;
public class Superspy {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n,c=0,sn=0;
        while(n1!=0){
            sn+=n1%10;
            n1/=10;
            c++;
        }
        if(c==sn)
        System.out.println(n+" is a superspy number");
        else
        System.out.println(n+" is not a superspy number");
   } 
}
