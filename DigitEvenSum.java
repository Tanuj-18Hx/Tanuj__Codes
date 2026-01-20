import java.util.Scanner;
public class DigitEvenSum{
    public static int  evenSum(int num){
        int temp = num;
        int sum = 0 ;
        while(temp != 0){
            int rem = temp%10;
            if(rem%2==0){
                sum+=rem ;
            }
            temp = temp/10;
        }
        return sum ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = evenSum(num);
        System.out.println("Result : " + result);
    }
}