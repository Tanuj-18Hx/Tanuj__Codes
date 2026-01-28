import java.util.Scanner;
public class IsPalindrome{
    public static int isPalPos(int n ){
        int[] freq = new int[10];
        while(n>0){
            int digit = n%10;
            freq[digit]++;
            n/=10;
        }
        int oddCount=0;
        for(int i=0;i<n;i++){
            if(freq[i]%2 != 0) oddCount++;
        }
        if(oddCount<=1) return 2;
        else return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Result : " + isPalPos(a));
        sc.close();
    }
}