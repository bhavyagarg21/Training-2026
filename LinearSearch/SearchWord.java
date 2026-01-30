import java.util.*;
public class SearchWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String word=sc.next();
        sc.nextLine();
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextLine());
        }

        for(String s:list){
            String[] words=s.split(" ");
            for(String w:words){
                if(w.equalsIgnoreCase(word)){
                    System.out.println(s);
                    return;
                }
            }
        }
        System.out.println("Not found");
        sc.close();
    }
}
