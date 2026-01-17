import java.util.Scanner;

public class LastDigitSum{
    public static int lastdigit(int num1){
        num1 = Math.abs(num1);
        return num1%10 ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = lastdigit(a) + lastdigit(b) ;
        System.out.println("Result : " + result);
        sc.close();
    }
}
