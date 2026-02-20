import java.util.Scanner;
public class ATMW{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double bal = sc.nextDouble();
        double deductA = sc.nextDouble();
        bal = bal - deductA - 0.5 ;
        System.out.printf("%.2f",bal);
        


    }
}