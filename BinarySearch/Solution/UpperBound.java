package Solution;

/*
You are given n different numbers and an integer k. Write a program that finds upper bound of k in log(n) time complexity. Upper bound of a number k in a sorted list is the index of the first number which is greater than k (here the answer is given considering index to be starting from 0)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class UpperBound {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(input.nextToken());
        int k = Integer.parseInt(input.nextToken());
        input = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int i=0;
        while(input.hasMoreTokens()){
            arr[i++] = Integer.parseInt(input.nextToken());
        }
        int low = 0,high = n,mid= 0;
        while(low < high){
            mid = low + (high-low)/2;
            if(arr[mid] > k)
                high = mid;
            else
                low = mid+1;
        }
            System.out.println(high);

        
    }
    
    
}
