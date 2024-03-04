public class duplicateNumber {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);

            if(nums[index]<0){
                return index;
            }else{
                nums[index]=-nums[index];
            }
        }
        return -1;
    }
}
