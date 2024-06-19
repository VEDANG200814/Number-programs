import java.util.*;
public class Duck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n,f=0,d=0;
        while(n1!=0){
            if(n1%10==0){
                f=1;
                break;
            }
            n1/=10;            
        }
        if(f==1)
        System.out.println(n+" is a duck number");
        else
        System.out.println(n+" is not a duck number");
    }    
}
