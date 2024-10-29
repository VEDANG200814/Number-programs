import java.util.*;
public class Cyclic_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(),n1=n,f=1;
        String ns=String.valueOf(n);
        for(int i=0;i<ns.length();i++){
            for(int j=2;j<n1;j++){
                if(n1%j==0){
                    f=0;
                    break;
                }
            }
            if(f==1){
                n1=Integer.valueOf(ns.substring(ns.length()-1)+ns.substring(0,ns.length()-1));
                ns=String.valueOf(n1);
            }
            else
            break;
        }
        if(f==1)
        System.out.println("The number "+n+" is a cyclic prime");
        else
        System.out.println("The number "+n+" is not a cyclic prime");
    }
}
