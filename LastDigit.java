import java.util.Scanner;

public class LastDigit{
    public static int lastdigit(int num){
        num = Math.abs(num);
        return num%10;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(lastdigit(a));
        sc.close();
    }
}
