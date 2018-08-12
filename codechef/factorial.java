import java.util.Scanner;
import java.util.Arrays;
class Factorial{
public static void main(String[] args){
    
    int k=1;
    Scanner in = new Scanner(System.in);
    int testcase= in.nextInt();
    int[] arr=new int[testcase];
    
    for(int i=0;1<testcase;i++){
        arr[i]=in.nextInt();
        
    }
    for(int arr1: arr){
        while(arr1>0){
            arr1=arr1*k;
            k++;
        }
       System.out.println(arr1);  
    }
    

}
}

