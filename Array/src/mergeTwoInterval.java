import java.util.Arrays;
import java.util.Stack;
import java.util.Arrays;

public class mergeTwoInterval {
    public static void main(String[] args) {
      int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    static  int[][] merge(int[][] intervals){
        //SORT
        Arrays.sort(intervals,(a, b)-> Integer.compare(a[0],b[0]));

        //Stack to store merged interval
        Stack <int[]> stack=new Stack();
        stack.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){
            int startPoint2=intervals[i][0];
            int endPoint2=intervals[i][1];

            int[] popArray=stack.pop();

            int startPoint1=popArray[0];
            int endPoint1=popArray[1];

            int maxEnd=Math.max(endPoint1,endPoint2);
            if(endPoint1>=startPoint2){
                int[] merge=new int[]{startPoint1,maxEnd};
                stack.add(merge);
            }else{
                stack.add(popArray);
                stack.add(intervals[i]);
            }
        }

        int[][] output=new int [stack.size()][2];
        for(int i=output.length-1;i>=0;i--){
            int[] popArray=stack.pop();
            output[i][0]=popArray[0];
            output[i][1]=popArray[1];
        }

        return output;
    }
}
