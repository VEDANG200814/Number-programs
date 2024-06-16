import java.util.*;
public class Multipleharshad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n,n2=n1,c=0,sn=0;
        while(n2>9){
            while(n1!=0){
                sn+=n1%10;
                n1/=10;
            }
            if(n2%sn==0){
                n1=n2/sn;
                n2=n1;
                sn=0;
                c++;
            }
        }
        if(c>=2)
        System.out.println(n+" is a multiple niven or harshad number");
        else
        System.out.println(n+" is not a multiple niven or harshad number");
    }
}
