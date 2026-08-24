import java.util.*;
public class Grade {
    public static void main(String[] args) {
        int[] sub = new int[5];
        int add=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects out of 20");
        for (int i=0; i<5; i++){
            sub[i] = sc.nextInt();
            add+= sub[i];
        }
        System.out.println("Total Marks="+add);
        if (add>=90)
        System.out.println("Ex");
        else if (add>=80 && add<=89)
        System.out.println("A");
        else if (add>=70 && add<=79)
        System.out.println("B");
        else if (add>=60 && add<=69)
        System.out.println("C");
        else
        System.out.println("F");
    }
}
