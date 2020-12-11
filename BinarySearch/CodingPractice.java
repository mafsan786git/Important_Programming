import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CodingPractice {
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(input.nextToken());
        int m = Integer.parseInt(input.nextToken());
        input = new StringTokenizer(br.readLine());
        long sum=0;
        while(input.hasMoreTokens())
            sum += Long.parseLong(input.nextToken());
        String str = "100000000000000000";
        long low = 0;
        long high = Long.parseLong(str);
        long mid =0;
        long ans=0;
        while(low<=high){
            mid = low+(high-low)/2;
            if(mid*m >= sum)
            {
                ans = mid;
                high = mid-1;
            }else
                low = mid+1;
        }
        System.out.println(ans);
    }
    
}
