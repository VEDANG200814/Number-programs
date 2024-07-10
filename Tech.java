import java.util.*;
public class Tech {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int hn1,hn2,c=0,n1=n,sn;
        while(n1!=0){
            n1/=10;
            c++;
        }
        hn1=n%(int)Math.pow(10,c/2);
        hn2=n/(int)Math.pow(10,c/2);
        sn=hn1+hn2;
        if(sn*sn==n)
        System.out.println(n+" is a tech number");
        else
        System.out.println(n+" is not a tech number");
    }
}
