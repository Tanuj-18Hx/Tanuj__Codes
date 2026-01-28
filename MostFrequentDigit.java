import java.util.Scanner;

public class MostFrequentDigit {

    public static int mostFrequentDigit(int n, int m, int o, int p) {

        int[] count = new int[10];
        countDigits(n, count);
        countDigits(m, count);
        countDigits(o, count);
        countDigits(p, count);

        int maxCount = count[0];
        int result = 0;

        for (int i = 1; i < 10; i++) {

            if (count[i] > maxCount) {
                maxCount = count[i];
                result = i;
            }
            else if (count[i] == maxCount && i > result) {
                result = i;
            }
        }

        return result;
    }

    public static void countDigits(int num, int[] count) {

        if (num == 0) {
            count[0]++;
        }

        while (num > 0) {
            int digit = num % 10;
            count[digit]++;
            num = num / 10;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int result = mostFrequentDigit(a, b, c, d);

        System.out.println("Most frequent digit = " + result);
    }
}