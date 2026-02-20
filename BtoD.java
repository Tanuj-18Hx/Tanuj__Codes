import java.util.*;
public class BtoD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        int p = 0;
        while(n>0){
            int l = n%10;
            sum+=(int)(l*Math.pow(2,p));
            p++;
            n/=10;
        }
        System.out.println(sum);
    }
}