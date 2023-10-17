public class reverse {
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

    static  void  printArr(int arr[],int len){
         for(int i=0;i<len;i++){
             System.out.println(arr[i]);
         }
    }
    public static void main(String[] args) {
       int  arr[] = {1, 2, 3};
        printArr(arr, 3);
       reverse( arr,0,arr.length-1);
       printArr(arr, arr.length);
    }
}
