import java.util.*;
class Bouncy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int d,d1=n%10,fa=1,fd=1,n1=n/10;
        while(n1!=0){
            d=n1%10;
            n1=n1/10;
            if(d<d1)
            fa=0;
            if(d>d1)
            fd=0;
            d1=d;
        }
        if(fa==1||fd==1)
        System.out.println(n+" is not a bouncy number");
        else
        System.out.println(n+" is a bouncy number");
    }
}