package Solution;
/*
Given a sorted array with repeating integers. You need to find the first occurence , last occurence and count of a given key in the array. USE ONLY BINARY SEARCH. Your algorithm should run in LogN time.If element is not present print -1 -1 0.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LowerUpperBound {
    static int LowerBound(int[] arr,int n,int target) {
        int low = 0,high = n,mid= 0;
        int ans = -1;
        while(low < high){
            mid = low + (high-low)/2;
            if(arr[mid] == target)
            {
                high = mid;
                ans = mid;
            }
            else if(arr[mid] > target)
                high = mid-1;
            else
                low = mid+1;
        }
        return ans;
    }

    static int UpperBound(int[] arr,int n,int target) {
        int low = 0,high = n-1,mid= 0;
        int ans = -1;
        while(low <= high){
            mid = low + (high-low)/2;
            if(arr[mid] == target)
            {
                low = mid+1;
                ans = mid;
            }
            else if(arr[mid] > target)
                high = mid-1;
            else
                low = mid+1;
        }
        

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(input.nextToken());
        input = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int i=0;
        while(input.hasMoreTokens()){
            arr[i++] = Integer.parseInt(input.nextToken());
        }
        input = new StringTokenizer(br.readLine());
        int target = Integer.parseInt(input.nextToken());
        int lower = LowerBound(arr,n,target);
        int upper = UpperBound(arr,n,target);
        if(lower == -1)
            System.out.println(lower+ " " + upper + " " + 0);
        else
         System.out.println(lower+ " " + upper + " " + (upper-lower + 1));
    }
}
