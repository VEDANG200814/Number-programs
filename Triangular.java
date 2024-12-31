import java.util.*;
public class Triangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),s=0,f=0;
        for(int i=1;i<=n;i++){
            s+=i;
            if(s==n){
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.println(n+" is a Triangular number");
        else
        System.out.println(n+" is not a Triangular number");
    }
}
