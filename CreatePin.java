import java.util.*;

public class CreatePin {

    public static int createPIN(int input1, int input2, int input3) {

        int h1 = input1 / 100;
        int t1 = (input1 / 10) % 10;
        int u1 = input1 % 10;

        int h2 = input2 / 100;
        int t2 = (input2 / 10) % 10;
        int u2 = input2 % 10;

        int h3 = input3 / 100;
        int t3 = (input3 / 10) % 10;
        int u3 = input3 % 10;


        int unit = Math.min(u1, Math.min(u2, u3));
        int tens = Math.min(t1, Math.min(t2, t3));
        int hundreds = Math.min(h1, Math.min(h2, h3));


        int maxDigit = Math.max(Math.max(h1, Math.max(t1, u1)),
                       Math.max(Math.max(h2, Math.max(t2, u2)),
                       Math.max(h3, Math.max(t3, u3))));


        int pin = maxDigit * 1000 + hundreds * 100 + tens * 10 + unit;

        return pin;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Pin : " + createPIN(num1,num2,num3));
        sc.close();
    }
}
