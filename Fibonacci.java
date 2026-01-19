import java.util.Scanner;
public class Fibonacci{
    public static int fibonacci(int num){
        int first = 0 , second = 1 ,next =0;
        if(num == 1) return first ;
        else if (num == 2) return second ;
        else {
            for(int i=3 ; i<= num; i++){
                next = first + second ;
                first = second ;
                second = next ;
            }
            return second ;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibonacci(num));
    }
}