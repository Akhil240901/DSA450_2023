import java.util.HashSet;
import java.util.Set;

public class union {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here


        Set<Integer> newset=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            newset.add(a[i]);
        }
        for(int j=0;j<m;j++){
            newset.add(b[j]);
        }
        int count=0;
        for (int name : newset) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
       int n=5, m=3;
       int a[]={1,2, 3, 4, 5};
       int b[]={ 1, 2, 3};
       int ans=doUnion(a,n,b,m);
       System.out.println(ans);
    }
}
