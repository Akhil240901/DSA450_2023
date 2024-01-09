import java.util.Arrays;
import java.util.Scanner;

public class kthMinandMax {
    static  int  findKthEle(int arr[],int n,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the how many numbers you want");
        int n= sc.nextInt();
        int arr[]=new int [n];
        //arr[] = 7 10 4 3 20 15
        System.out.println("Enter the array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=findKthEle(arr,n,3);
        System.out.println(ans);
    }
}
