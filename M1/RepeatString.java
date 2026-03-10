import java.util.*;
class RepeatString{
    public static String repeatString(String s, int N){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(s);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String s=sc.next();
        System.out.println(repeatString(s, N));
        sc.close();
    }
}