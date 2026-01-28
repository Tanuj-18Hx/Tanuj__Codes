import java.util.Scanner;
public class SecondWordUpperCase{
    public static String SWUC(String st){
        String[] words = st.split(" ");
        if(words.length<2) return "LESS";
        else return words[1].toUpperCase();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String result = SWUC(st);
        System.out.println("Result : " + result);
        sc.close();
    }
}