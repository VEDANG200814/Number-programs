import java.util.*;
public class spy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n,sn=0,pn=1;
        while(n1!=0){
            sn+=n1%10;
            pn*=n1%10;
            n1/=10;
        }
        if(sn==pn)
        System.out.println(n+" is a spy number");
        else
        System.out.println(n+" is not a spy number");
    }
}
