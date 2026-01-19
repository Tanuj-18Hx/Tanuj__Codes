import java.util.Scanner;
public class DigitCount{
    public static int digitcount(int num){
        int count=0;
        int temp = num;
        if(num==0) return count=1;
        else{
            while(temp!=0){
                temp=temp/10;
                count++;
            }
        }
        return count ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("Result : " + digitcount(num));
    }
}