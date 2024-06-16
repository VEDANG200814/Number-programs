import java.util.*;
class Armstrong{
    //Class 9 & 10 standard
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n,s=0;
        while(n1!=0){
            s+=(int)Math.pow(n1%10,3);
            n1/=10;
        }
        if(s==n)
        System.out.println(n+" is an Armstrong number");
        else
        System.out.println(n+" is not an Armstrong number");
    }
    //Class 11 onwards standard
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter a number");
    //     int n=sc.nextInt();
    //     int n1=n,c=0,s=0;
    //     while(n1!=0){
    //         n1/=10;
    //         c++;
    //     }
    //     n1=n;
    //     while(n1!=0){
    //         s+=(int)Math.pow(n1%10,c);
    //         n1/=10;
    //     }
    //     if(s==n)
    //     System.out.println(n+" is an Armstrong number");
    //     else
    //     System.out.println(n+" is not an Armstrong number");
    // }
}