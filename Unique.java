import java.util.*;
public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int c=0,n1=n,f=1;
        for(int i=0;i<=9;i++){
            while(n1!=0){
                if(n1%10==i)
                c++;
                n1/=10;
            }
            if(c>1){
                f=0;
                break;
            }
            c=0;n1=n;
        }
        if(f==1)
        System.out.println(n+" is a unique number");
        else
        System.out.println(n+" is not a unique number");
    }
}
