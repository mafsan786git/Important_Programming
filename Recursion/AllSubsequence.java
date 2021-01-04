
import java.util.ArrayList;
import java.util.Scanner;

public class AllSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        ArrayList<String> output = new ArrayList<>();
        SubSequence(str,0, "",output);
        sc.close();
    }
    static void SubSequence(String original,int index,String ans,ArrayList<String> output){
        
        if(index == original.length())
        {
            if(!output.contains(ans)){
                System.out.println(ans);
                output.add(ans);
            }
            return ;
        }
        
            if(ans != "" && !output.contains(ans))
            {
                System.out.println(ans);
                output.add(ans);
            }
            SubSequence(original, index+1, ans+original.charAt(index),output);
            // if(index == start){
            //     start = index+1;
            //     output.clear();
            // }
            if(output.size()!=0)
            output.remove(output.size()-1);
            SubSequence(original, index+1, ans,output);
    }
    
}
