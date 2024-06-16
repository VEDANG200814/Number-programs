import java.util.*;
public class Niven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n,sn=0;
        while(n1!=0){
            sn+=n1%10;
            n1/=10;
        }
        if(n%sn==0)
        System.out.println(n+" is a niven or harshad number");
        else
        System.out.println(n+" is not a niven or harshad number");
    }
}
