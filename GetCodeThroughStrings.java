import java.util.Scanner;

public class GetCodeThroughStrings {

    public static int getPIN(String St) {

        String[] words = St.split(" ");
        int tLength = 0;

        for (String word : words) {
            tLength += word.length();
        }

        while (tLength >= 10) {

            int sum = 0;

            while (tLength > 0) {
                sum += tLength % 10;
                tLength = tLength / 10;
            }

            tLength = sum;
        }

        return tLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println("Numeric PIN = " + getPIN(input));

        sc.close();
    }
}