import java.util.Arrays;

/*
Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
         Maximum element is: 35
* */
//1st way to find max and min in an array
class MaxMin{
    public int max;
    public int min;
}
public class maxAndMin {
    //Time Complexity: O(n)
    //Auxiliary Space: O(1) as no extra space was needed.
    static  MaxMin  findMaxAndMin(int arr[],int max,int min){
        MaxMin mm= new  MaxMin();
        mm.max=max;
        mm.min=max;
        for(int i=1;i< arr.length;i++){
            if(arr[i]>mm.max){
                mm.max=arr[i];
            }
            if(arr[i]<mm.min){
                mm.min=arr[i];
            }
        }
        return mm;
    }

    //Time complexity:
    // O(n log n), where n is the number of elements in the array, as we are using a sorting algorithm.
    //Auxilary Space: is O(1), as we are not using any extra space.
    static MaxMin findMaxAndMin2(int[] arr,int n){
        MaxMin mm=new MaxMin();
        Arrays.sort(arr);
        mm.max=arr[n-1];
        mm.min=arr[0];
        return mm;
    }

    public static void main(String[] args){
        int arr[]={22,14,8,17,35,3};
        MaxMin ans= findMaxAndMin(arr,arr[0],arr[0]);
//      MaxMin ans= findMaxAndMin2(arr,arr.length);
        System.out.println(ans.max);
        System.out.println(ans.min);
    }
}


//2nd instead of comparing ,we can sort the array using sort() function and assign max and min as arr[n-1] and arr[0] resp. a
