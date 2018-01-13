import java.util.Scanner;

class Student {

    String name;
    int grade;
    double avrg;
}

public class Exc19_4 {

    public static void main( String[] args ) throws Exception {

        Scanner kb = new Scanner(System.in);

        Student first = new Student();

        System.out.print("Enter the first student's name: ");
        first.name = kb.next();
        System.out.print("Enter the first student's grade: ");
        first.grade = kb.nextInt();
        System.out.print("Enter the first student's average: ");
        first.avrg = kb.nextDouble();
        System.out.println();

        Student second = new Student();

        System.out.print("Enter the second student's name: ");
        second.name = kb.next();
        System.out.print("Enter the second student's grade: ");
        second.grade = kb.nextInt();
        System.out.print("Enter the second student's average: ");
        second.avrg = kb.nextDouble();
        System.out.println();

        Student third = new Student();

        System.out.print("Enter the third student's name: ");
        third.name = kb.next();
        System.out.print("Enter the third student's grade: ");
        third.grade = kb.nextInt();
        System.out.print("Enter the third student's average: ");
        third.avrg = kb.nextDouble();
        System.out.println();

        System.out.println("The names are: " + first.name + " " + second.name + " " + third.name);
        System.out.println("The grades are: " + first.grade + " " + second.grade + " " + third.grade);
        System.out.println("The averages are: " + first.avrg + " " + second.avrg + " " + third.avrg);
    }
}
