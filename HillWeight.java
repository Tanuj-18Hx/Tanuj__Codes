import java.util.*;
class HillWeight {

    public static int THW(int input1, int input2, int input3) {

        int totalWeight = 0;

        for (int level = 1; level <= input1; level++) {

            int stars = level;  
            int weightPerStar = input2 + (level - 1) * input3;

            totalWeight = totalWeight + (stars * weightPerStar);
        }

        return totalWeight;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(THW(num1,num2,num3));
        sc.close();
    }
}
