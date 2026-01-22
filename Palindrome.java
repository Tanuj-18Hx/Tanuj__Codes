import java.util.Scanner;
public class Palindrome{
    public static int IsPal(int n){
        int org = n ;
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = rev * 10 + digit;
            n=n/10;
        }
        if(org==rev) return 2 ;
        else return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Result : " + IsPal(a));
        sc.close();
    }
}