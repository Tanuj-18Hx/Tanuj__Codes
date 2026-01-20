import java.util.Scanner;
public class DigitEvenOddSum{
    public static int Sum(int num , String condition ){
        int temp = num , rem = 0 , sum = 0 ;
        if(condition.equals("even")){
            while(temp != 0){
                rem =temp%10;
                if(rem%2==0){
                    sum+=rem;
                }
                temp=temp/10;
            }
        }
        else if(condition.equals("odd")){
             while(temp != 0){
                rem =temp%10;
                if(rem%2!=0){
                    sum+=rem;
                }
                temp = temp/10;
            }
        }
        return sum ;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String cond = sc.next();
        int result = Sum(a,cond);
        System.out.println("RESULT : " + result);
    }
}