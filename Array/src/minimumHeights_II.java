import java.lang.reflect.Array;
import java.util.Arrays;

public class minimumHeights_II {
    public static void main(String[] args) {
       int  K = 3, N = 5;
       int  arr[] = {3, 9, 12, 16, 20};
       int ans=minimumDiff(K,N,arr);
        System.out.println(ans);
    }

    static int minimumDiff(int k, int n, int[] arr) {
        //firstly sort the array so we can find out max diff between minimum and maximum tower
        Arrays.sort(arr);
        int max=arr[n-1];
        int min=arr[0];
        int diff=max-min;

        for(int i=0;i<n;i++){
            if(arr[i]-k ==0){
                continue;
            }
            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            min=Math.min(arr[0]+k,arr[i]-k);
            diff=Math.min(diff,max-min);
        }
        return diff;
    }
}
