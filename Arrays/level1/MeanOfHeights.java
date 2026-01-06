import java.util.*;
public class MeanOfHeights {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] heights=new double[11];
        System.out.println("enter the heights: ");
        int sum=0;
        for(int i=0;i<11;i++){
            heights[i]=sc.nextDouble();
            sum+=heights[i];
        }
        double mean_height=sum/11;
        System.out.println(mean_height);
        sc.close();

    }
}
