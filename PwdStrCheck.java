import java.util.*;
public class PwdStrCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        boolean len = pass.length() >= 8;
        boolean hasDigit = pass.matches(".*\\d.*");
        boolean hasUpper = pass.matches(".*[A-Z].*");

        if(len && hasDigit && hasUpper) System.out.println("Strong Pswd");
        else System.out.println("Weak Pswd");
    }
}