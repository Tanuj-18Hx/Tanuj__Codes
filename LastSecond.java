import java.util.Scanner;

public class LastSecond{
    public static int lastSecond(int num){
        num = Math.abs(num);
        
        if(num<10) return 0;

        return (num/10)%10;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = lastSecond(a);
        if(result == 0){
            System.out.println("No Second Last Digit !!");
        }
        else {
            System.out.println(result);
        }
        sc.close();
    }
}
