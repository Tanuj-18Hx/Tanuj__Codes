import java.util.Scanner;
public class ALTSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 9629728;
        int sum = 0;
        boolean f = false;

        for(int i = 1000000000 ; i>0 ; i/=10){
            if(n>=i){
                f = f^true;
                if(f) sum+=n/i;
                n=n%i;
            }
        }
        System.out.println(sum);
        


    }
}