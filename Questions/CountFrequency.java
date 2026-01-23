import java.util.*;

public class CountFrequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text: ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' ') map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Character c:map.keySet()){
            System.out.println(c+" "+map.get(c));
        }
        sc.close();
    }
}
