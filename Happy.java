import java.util.*;
public class Happy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n,s=0;
        while(n1!=0){
            while(n1!=0){
                s+=(int)Math.pow(n1%10,2);
                n1/=10;
            }
            if(s>9){
                n1=s;
                s=0;
            }
        }
        if(s==1)
        System.out.println(n+" is a happy number");
        else
        System.out.println(n+" is not a happy number");
    }
}
