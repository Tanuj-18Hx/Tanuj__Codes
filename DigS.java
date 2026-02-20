
import java.util.*;
public class DigS{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int sum = 0 ;
        // int org = n ;
        // int rev =0 ;
        // int log = (int)Math.log10(n);`
        // while(n>0){
        //     int temp = n ;
        //     while(temp>0){
        //         int last = temp%10;
        //         sum+=last;
        //         temp/=10;
        //     }
        //     n%=Math.pow(10,log);
        //     log--;
        // }
        // System.out.println(sum);

int len = (int)Math.log10(n);
int m = len ;

int sum = 0;
        // int[] arr = new int[len+1];
        for(int i = 0 ; i<=len ; i++){
            // arr[i]=n/m;
            int d = (int)(n/Math.pow(10,m)); 
            n%=Math.pow(10,m);  
            m--; 
            
            sum+=d*(i+1);
        }
        System.out.println(sum);

        
    }
}