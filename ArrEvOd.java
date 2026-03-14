import java.util.Scanner;
public class ArrEvOd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr =  new int[size];
        for(int i = 0 ; i < size ; i++  ){
            arr[i]=sc.nextInt();
        }
        int Ec = 0;
        int Oc = 0;

        for(int i = 0 ; i < size ; i++) {
            if(arr[i]%2==0) Ec++;
            else Oc++;
        }
        System.out.println("No. of Even digits : " + Ec);
        System.out.println("No. of Odd Digits : " + Oc);


    }
}