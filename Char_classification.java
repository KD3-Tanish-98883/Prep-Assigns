import java.util.Scanner;

public class Char_classification {
    public static void main(String[] args) {
        String str;
        char letter;
        int cu=0, cl=0, cd=0, co=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            letter = str.charAt(i);
            if(letter>='A' && letter<='Z')
            cu++;
            else if(letter>='a' && letter<='z')
            cl++;
            else if(letter>='0' && letter<='9')
            cd++;
            else
            co++;
        }
        System.out.println("String Entered="+ str);
        System.out.println("No. Upper Case Letters="+cu);
        System.out.println("No. Lower Case Letters="+cl);
        System.out.println("No. Digits="+cd);
        System.out.println("No. Other Characters="+co);
    }
}
