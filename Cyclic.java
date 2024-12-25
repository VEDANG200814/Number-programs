import java.util.*;
public class Cyclic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),n1=n,nd=0,f=1,i1=0;
        while(n1>0){
            nd++;
            n1=n1/10;
        }
        for(int i=1;i<=nd;i++){
            i1=i*n;
            while (i1!=0){
                if(String.valueOf(n).indexOf(String.valueOf(i1%10))==-1){
                    f=0;
                    break;
                }
                i1/=10;
            }
        }
        if(f==1)
        System.out.println("The number "+n+" is a Cyclic number");
        else
        System.out.println("The number "+n+" is not a Cyclic number");
    }
}
