import java.util.*;

public class student {
    public static void main(String[] args) {

        String stuname;
        String rollno;
        int tmarks;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of the student");
        stuname = sc.nextLine();
        rollno = sc.nextLine();
        tmarks = sc.nextInt();

        System.out.println("Student name = " + stuname);
        System.out.println("Student Rollno. = " + rollno);
        System.out.println("Total Marks = " + tmarks);
    }
}