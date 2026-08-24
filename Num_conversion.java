import java.util.*;

public class Num_conversion {
    public static void main(String[] args) {
        int num, n;
        String binary="", octal="", hexadecimal="";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        num = sc.nextInt();

        n= num;
        while(n>0){
            int remainder = n%2;
            n= n/2;
            binary+= remainder;
        }
        System.out.println("No. in binary= "+binary);

        n= num;
        while(n>0){
            int remainder = n%8;
            n = n/8;
            octal+= remainder;
        }
        System.out.println("No. in octal = "+octal);

        n= num;
        while(n>0){
            int remainder = n%16;

            if(remainder<10)
            hexadecimal+= remainder;

            else
            hexadecimal+= (char)('A'+(remainder-10));
            n=n/16;
        }
        System.out.println("No. in hexadecimal = "+hexadecimal);
    }
}
