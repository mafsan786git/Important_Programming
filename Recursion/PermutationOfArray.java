import java.io.*;
import java.util.*;


public class PermutationOfArray {
    static int[] StringToInt(StringTokenizer input){
        int[] arr = new int[input.countTokens()];
        int i=0;
        while(input.hasMoreTokens())
            arr[i++] = Integer.parseInt(input.nextToken());
        return arr;
    }

    public static void Permutation(List<List<Integer>> list,List<Integer> tempList,int[] arr){
        if(tempList.size() == arr.length)
        {
            list.add(new ArrayList<>(tempList));
            System.out.println(tempList);
            return ;
        }

        for (int i = 0; i < arr.length; i++) {
            if(tempList.contains(arr[i])) continue;
            tempList.add(arr[i]);
            Permutation(list, tempList, arr);
            tempList.remove(tempList.size()-1);
        }
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());
        int[] arr = new int[input.countTokens()];
        arr = StringToInt(input);
        List<List<Integer>> list = new ArrayList<>();
        Permutation(list, new ArrayList<>(), arr);
        System.out.println();
        System.out.println();
        System.out.println();
        // for(List<Integer> lt : list){
        //     System.out.println(lt);
        // }
        
    }
    
}
