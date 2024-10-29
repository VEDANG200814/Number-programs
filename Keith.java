import java.util.*;
public class Keith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c=0,n1=n,i=2;
        while(n1!=0){
            n1/=10;
            c++;
        }
        int a[]=new int[c+1],f=0;n1=n;
        while(n1!=0){
            a[i]=n1%10;
            n1/=10;
            i--;
        }
        while(a[0]<=n){
            for(i=0;i<c;i++){
                a[c]+=a[i];
            }
            for(i=0;i<c;i++)
            a[i]=a[i+1];
            a[c]=0;
            if(a[0]==n){
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.println(n+" is a keith number");
        else
        System.out.println(n+" is a not keith number");
    }
}