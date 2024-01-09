public class rotateAnArray {
    static void rotate(int A[],int n){
        int temp=A[n-1];
        for(int i=n-1;i>0;i--){
            A[i]=A[i-1];
        }
        A[0]=temp;
    }

    static  void printRotatedArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int N = 5;
        int A[] = {1, 2, 3, 4, 5};
        rotate(A,N);
        printRotatedArray(A,N);
    }
}
