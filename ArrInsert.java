import java.util.Scanner;
public class ArrInsert{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] arr =  new int[10];
        for(int i = 0 ; i < size ; i++  ){
            arr[i]=sc.nextInt();
        }
        int pos = sc.nextInt();
        int trg = sc.nextInt();
        for(int i = size-1 ; i >= pos ; i--){
            arr[i+1] = arr[i];
        }
        arr[pos]= trg ;
        size++;
        
        for(int i=0 ; i < size ; i++ ) System.out.print(arr[i] + " ");


    }
}