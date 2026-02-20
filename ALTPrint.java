import java.util.Scanner;
public class ALTPrint{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 9629728;
        for(int i = 1000000000 ; i>0 ; i/=10){
            if(n>=i){
                System.out.println(n/i);
                n=n%i;
            }
        }
        


    }
}