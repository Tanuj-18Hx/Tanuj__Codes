import java.util.Scanner;
public class FreqArr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [10];
        while(n>0){
            arr[n%10]++;    // Freq Array !!
            n/=10;
        }
        // int trg = sc.nextInt();
        // System.out.println(arr[trg]);    To Count How many Time no. comes
       
        // for(int i = 0; i<10 ; i++){
        //     if(arr[i] == 1) System.out.println(i);  // For Unique Digit
        // }

        //   for(int i = 1; i<10 ; i++){
        //     if(arr[i] == 0){ 
        //     System.out.println(i);   // For missing no.
        //     break ; 
        //     }
        // }

        // int c = 0 ;
        //   for(int i = 0; i<10 ; i++){
        //     if(arr[i]%2 == 1 && c<=2) {
        //         c++;
        //     }
        // }
        // if(c<2) System.out.prinltn("Palindrome Possible");
        // else System.out.prinltn("Not");


        // int d = -1 ;
        // int index = 0;
        //   for(int i = 0; i<10 ; i++){
        //     if(arr[i]>max){
        //         max=arr[i];              // To check Which no. comes more 
        //         index=i;
        //     }
        // }
        // System.out.prinln(index + " " + max);



    }
}