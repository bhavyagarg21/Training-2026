import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int n){
        int cnt=0;
        while(n!=0){
            cnt+=n%10;
            n/=10;
        }
        int num=0;
        while(n!=0){
            num+=Math.pow(n%10,cnt);
            n/=10;
        }
        if(num!=n) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(isArmstrong(num));
        sc.close();
    }
}
