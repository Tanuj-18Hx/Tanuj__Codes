import java.util.*;
public class DtoB{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [32];
        int i = 0;
        while(n>0){
            arr[i]=n%2;
            n/=2;
            i++;
        }
        for(int j=i-1; j>=0 ; j--){
            System.out.print(arr[j]);
        }
    }
}