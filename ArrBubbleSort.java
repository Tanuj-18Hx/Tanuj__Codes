import java.util.Scanner;
public class ArrBubbleSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr =  new int[size];
        for(int i = 0 ; i < size ; i++  ){
            arr[i]=sc.nextInt();
        }
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size-1 ; j++){         // for optimised code we use (size-i-1) for j stopping
                if(arr[j]>arr[j+1]){                   // so it will not consider the sorted one
                    int temp = arr[j] ; 
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }

        for(int i : arr) System.out.print(i + " ");
       


    }
}