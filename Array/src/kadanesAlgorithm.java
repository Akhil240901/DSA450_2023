public class kadanesAlgorithm {
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {1,2,3,-2,5};
        System.out.println(maxSubArray(arr,N));
    }
    //bestest way to solve subarray of time complexity O(n)
    static long maxSubArray(int[] arr, int n) {
        long currSum=0;
        long bestSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum=Math.max(currSum+arr[i],arr[i]);
            bestSum=Math.max(currSum,bestSum);
        }
        return bestSum;
    }
}
