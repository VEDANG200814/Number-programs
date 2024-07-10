import java.util.*;
public class Mersene {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),f=0;
        for(int i=0;i<=n;i++)
        if(n==((int)Math.pow(2,i)-1)){
            f=1;
            break;
        }
        if(f==1)
        System.out.println(n+" is a mersene number");
        else
        System.out.println(n+" is not a mersene number");
    }
}
