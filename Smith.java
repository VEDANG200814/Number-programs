import java.util.*;
public class Smith {
    boolean is_Prime(int n){
        for(int i=2;i<n;i++)
        if(n%i==0)
        return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Smith ob=new Smith();
        System.out.println("Enter a number");
        int n=sc.nextInt(),n1=n,sn=0,sf=0,i1=0;
        for(int i=2;i<=n1;i++)
        if(n1%i==0&&ob.is_Prime(i)){
            if(i>9){
                i1=i;
                while(i1!=0){
                    sf+=i1%10;
                    i1/=10;
                }
            }
            else{
                sf+=i;
                n1/=i;
                i=2;
            }
        }
        n1=n;
        while(n1!=0){
            sn+=n1%10;
            n1/=10;
        }
        if(sn==sf)
        System.out.println(n+" is a Smith number");
        else
        System.out.println(n+" is not a Smith number");
    }
}