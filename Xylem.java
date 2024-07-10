import java.util.*;
public class Xylem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c=0,n1=n,l,f,m,slf=0,sm=0;
        while(n1!=0){
            c++;
            n1/=10;
        }
        l=n%10;
        f=n/(int)Math.pow(10,c-1);
        m=n%(int)Math.pow(10,c-1)/10;
        while(m!=0){
            sm+=m%10;
            m/=10;
        }
        slf=l+f;
        if(slf==sm)
        System.out.println(n+" is a xylem number");
        else
        System.out.println(n+" is a phloem number");
    }
}
