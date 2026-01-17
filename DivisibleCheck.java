import java.util.Scanner;
public class DivisibleCheck{
    public static int IsDiv(int n , int m){
        if(n==0 || m==0) return 3; // if either is Zero
        else if (n % m == 0) return 2; // if perfectly divisible
        else return 1; // if not divisible
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = IsDiv(a , b);
        System.out.println(" Result : " + result);
    }

}