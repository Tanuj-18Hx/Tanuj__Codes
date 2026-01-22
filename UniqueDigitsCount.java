import java.util.*;
public class UniqueDigitsCount {

    public static int countUnique(int n) {
        boolean[] seen = new boolean[10]; 
        int count = 0;

        while (n > 0) {
            int digit = n % 10;  

            if (!seen[digit]) {
                seen[digit] = true;
                count++;
            }

            n = n / 10; 
        }

        return count;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       System.out.println("Result : " + countUnique(a));
    }
}
