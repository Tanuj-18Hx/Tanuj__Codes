import java.util.Scanner;
public class PalindromeString{
    public static String PS(String st){
        String str = st.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)) return "1" ;
            start ++ ;
            end --; 
        }
        return "2";
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String St = sc.next();
        System.out.println("Result : " + PS(St));
        sc.close();
    }
}