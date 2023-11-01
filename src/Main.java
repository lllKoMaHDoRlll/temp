import java.awt.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StudentsGroup studentsGroup = new StudentsGroup();
        int n2 = sc.nextInt();
        int[] marks = new int[n2];
        for (int i = 0; i < n2; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), marks);
            studentsGroup.add(student);
        }

        System.out.println("Hello world!");
        String name_to_remove = sc.nextLine();
        studentsGroup.del(name_to_remove);

        System.out.println(studentsGroup);
    }
}
