public class moveNegNum {
    static void  move(int arr[]){
        int j=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]<0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }

    }
    public static void main(String[] args) {
       int arr[]={ -12, 11, -13, -5, 6, -7, 5, -3, -6};
       move(arr);
//       for(int i=0;i< arr.length;i++){
//           System.out.println(arr[i]);
//       }
    }
}
