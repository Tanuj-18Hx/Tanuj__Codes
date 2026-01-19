import java.util.Scanner;
public class IsPrime{
    public static int isPrime(int num){
        boolean isprime = true ;
        if(num<=1){
            isprime=false;
        }
        else {
            for(int i=2 ; i<=num/2 ; i++){
                if(num%i==0){
                    isprime = false;
                    break;
                }
            }
        }
        if(isprime) return 2 ;
        else return 1 ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = isPrime(a);
        System.out.println("Result : " + result);
    }
}