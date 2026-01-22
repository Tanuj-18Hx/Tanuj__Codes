import java.util.Scanner;
public class NonRepeat{
public static int NRC(int input1) {

    int[] freq = new int[10];

    while (input1 > 0) {
        int digit = input1 % 10;  
        freq[digit]++;
        input1 = input1 / 10;
    }

    int count = 0;
    for (int i = 0; i < 10; i++) {
        if (freq[i] == 1)
            count++;
    }

    return count;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("Result : " + NRC(a));
    sc.close();
}
}