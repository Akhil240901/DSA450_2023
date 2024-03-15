import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(nextPermutationF(nums)));
    }
    static int[] nextPermutationF(int[] nums) {
        int n=nums.length;
        int k=n-2;

        //check whether array is null or empty
        if(n==0 || nums==null)return nums;

        //check for kth element
        for(int i=n-1;i>0;i--){
            if(nums[i]<=nums[i-1])
                k--;
            else{
                break;
            }
        }

        //if k=-1 then reverse array and return
        if(k==-1){
            reverse(nums,0,n-1);
            return nums;
        }

        //swap the kth and ith element and reverse k+1 onwards element
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[k]){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        reverse(nums,k+1,n-1);
        return nums;
    }
   static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
