import java.util.Scanner;
public class ArraySum{
    public static void main(String[] args){
        //int[] arr = {1,2,3,4,5,6,7,8} ;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr =  new int[size];
        for(int i = 0 ; i < size ; i++  ){
            arr[i]=sc.nextInt();
        }

        // int sum = 0 ;
        // int product = 1 ;
        // for(int i = 0 ; i < size ; i++){
        //     sum+=arr[i];
        //     product*=arr[i];
        // }

        // System.out.println(sum);
        // System.out.println(product);

        // for(int j = size-1 ; j >= 0 ; j--){
        //     System.out.print(arr[j]+" ");
        // }

        int  s = 0 ;
        int e = arr.length - 1 ;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp ;
            s++;
            e--;
        }

        for(int i : arr) System.out.print(i);

    }
}