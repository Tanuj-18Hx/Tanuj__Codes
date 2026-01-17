import java.util.Scanner;
public class CountEvenOdd{
    public static int countEven(int num1, int num2, int num3, int num4, int num5){
        int countEven = 0;
        if(num1 % 2 == 0) countEven++;
        if(num2 % 2 == 0) countEven++;
        if(num3 % 2 == 0) countEven++;
        if(num4 % 2 == 0) countEven++;
        if(num5 % 2 == 0) countEven++;
        return countEven ;
    }
    public static int countOdd(int nuM1, int nuM2, int nuM3, int nuM4, int nuM5){
        int countOdd = 0;
        if(nuM1 % 2 != 0) countOdd++;
        if(nuM2 % 2 != 0) countOdd++;
        if(nuM3 % 2 != 0) countOdd++;
        if(nuM4 % 2 != 0) countOdd++;
        if(nuM5 % 2 != 0) countOdd++;
        return countOdd ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        int Num3 = sc.nextInt();
        int Num4 = sc.nextInt();
        int Num5 = sc.nextInt();
        int result1 = countEven(Num1,Num2,Num3,Num4,Num5);
        int result2 = countOdd(Num1,Num2,Num3,Num4,Num5);
        System.out.println("No. Of Even : " + result1 );
        System.out.println("No. Of Odd : " + result2 );

    }
}