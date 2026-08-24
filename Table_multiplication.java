import java.util.*;

public class Table_multiplication {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a= sc.nextInt();
        b= sc.nextInt();

        for(int i=a; i<=b; i++){

            for(int j=1; j<=10; j++){

                System.out.println(i*j);
            }
            System.out.println("");
        }
    }
}
