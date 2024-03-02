public class maximumSubarray {
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {1,2,3,-2,5};
        System.out.println( maximumSubaaray(arr,N));
    }

    private static int maximumSubaaray(int[] arr, int n) {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
