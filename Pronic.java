import java.util.*;
public class Pronic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),f=0,c=1;
        while(c!=n){
            if(c*(c+1)==n){
                f=1;
                break;
            }
            c++;
        }
        if(f==1)
        System.out.println(n+" is a pronic number");
        else
        System.out.println(n+" is not a pronic number");
    }
}
