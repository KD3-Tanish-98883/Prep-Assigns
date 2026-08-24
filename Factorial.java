import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int n, fact = 1;

        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the no.");
        n = sc.nextInt();

        for(int i=n ; i>=1; i--){
            fact = fact*i;
        }

        System.err.println("Factorial =" +fact);
    }
}
