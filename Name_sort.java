import java.util.*;

public class Name_sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students(less than 10)");
        int n = sc.nextInt();

        String[] names = new String[n];

        sc.nextLine();

        System.out.println("Enter the names of Students");

        for(int i=0; i<n; i++){
            names[i]= sc.nextLine();
        }

        Arrays.sort(names);

        System.out.println("Sorted array :");
        for(String name : names){
            System.out.println(name);
        }
    }
}
