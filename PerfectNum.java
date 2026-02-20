import java.util.Scanner;
public class PerfectNum{
    public static void main(String[] args){
        int n = 25 ;
        int num = n*n ;
        boolean f = true ;
        while(n>0){
            int i = n%10 ;
            int  j = num%10;
            if(i != j){
                f = false ;
                break;
            }
            num/=10;
            n/=10;
        }
        System.out.println(f);
        
    }
}