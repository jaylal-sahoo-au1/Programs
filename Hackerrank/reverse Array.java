import java.util.*;

public class Solution
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int n=s.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i]=s.next();
        }
        
        for(int i=n; i>0; i--){
            System.out.print(arr[i-1]+" ");
        }
        
        s.close();
    }
}