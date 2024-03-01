public class reverse {
    //in place solution ,no extra array requires
    //time complexity:-o(n)
    //space complexity:-o(1)
    static  void reverse(int arr[],int start,int end){
           int temp;
           while(start<end){
               temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
               start++;
               end--;
           }
    }

    //Non in-place solution,array needed
    //time complexity:-o(n)
    //space complexity:-o(n)
    static  void reverse2(int arr[],int start,int end){
        int[] rev_arr=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            rev_arr[i]=arr[arr.length-1-i];
        }
    }

//Time Complexity: O(n). The recursion goes through each element once, so it’s linear.
//Auxiliary Space Complexity: O(n) for non in-place, O(log n) for in-place (due to recursion stack).
    static void reverse_rec(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse_rec(arr,start+1,end-1);
    }
    static  void  printArr(int arr[],int len){
         for(int i=0;i<len;i++){
             System.out.println(arr[i]);
         }
    }
    public static void main(String[] args) {
       int  arr[] = {1, 2, 3};
        printArr(arr, 3);
       //reverse( arr,0,arr.length-1);
       //printArr(arr, arr.length);
       // reverse2( arr,0,arr.length-1);
       //printArr(arr, arr.length);
        reverse_rec( arr,0,arr.length-1);
        printArr(arr, arr.length);
    }
}
