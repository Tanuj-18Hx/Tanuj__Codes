import java.util.Scanner;
public class DigitSum{
    public static int digitSum(int num){
        boolean isNegative = num<0;
        int currNo =Math.abs(num);
        while(currNo>=10){
            int sum = 0;
            while(currNo>0){
                sum += currNo%10;
                currNo=currNo/10;
            }
            currNo=sum;
        }
        if(isNegative) return -currNo;
        else return currNo;
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("Result : " + digitSum(num));
    }
}