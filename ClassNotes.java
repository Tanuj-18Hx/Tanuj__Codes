
public class ClassNotes{
    public static void  main(String[] args){
        // String s = "MAAM";
        // StringBuilder sb = new StringBuilder(s);
        // sb.append(s);
        // sb.append("python");
        // sb.append(10);
        // sb.append(false);         // To add Strings in StringBuilder 
        // sb.append(12.89);

       // sb.reverse();
        // System.out.println(sb.toString().equals(s));       // To check Palindrome or not 

        String str = "programming";
        String s = str.substring(0,5);          // To detach some part of main string 

        // while(str.length() > 0 ){
        //     System.out.println(str);
        //     str = str.substring(0,str.length()-1);
        // }
        while(str.length() > 0 ){
            System.out.println(str);
            str = str.substring(1,str.length());
        }

//System.out.println(s);

    }
}
