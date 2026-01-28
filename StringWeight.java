import java.util.Scanner;
public class StringWeight{
    public static int SW(String st , int choice){
        int weight = 0 ;
        st = st.toLowerCase();
        for(int i=0 ; i < st.length() ; i++){
            char ch = st.charAt(i);

            if(ch>='a' && ch<='z'){
                boolean isVowel = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
                if(choice==0 && isVowel) continue ;
                weight = weight + (ch - 'a' +1);
            }
        }
        return weight;
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String St = sc.nextLine();
        int Choice = sc.nextInt();
        int result = SW(St , Choice);
        System.out.println("Result : " + result);
        sc.close();
    }
}