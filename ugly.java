import java.util.*;
class ugly{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),c=0,f=1;
        for(int i=2;i<=8;i++){
            for(int j=1;j<=i;j++)
            if(i%j==0)
            c++;
            if(c==2&&n%i==0&&i>=7){
                f=0;
                break;
            }
            c=0;
        }
        if(f==1)
        System.out.println(n+" is an ugly or hamming number");
        else
        System.out.println(n+" is not an ugly or hamming number");
    }
}