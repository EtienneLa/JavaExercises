import java.util.Scanner;

class Studentdb {

    String name;
    int grade;
    double avrg;

    public String toString() {

        return name + ", " + grade + ", " + avrg;
    }
}

public class Exc19_5 {

    public static void main( String[] args ) throws Exception {

        Scanner kb = new Scanner(System.in);
        Studentdb[] student = new Studentdb[3];

        for ( int i = 0; i < student.length; i++ ) {
            student[i] = new Studentdb();
            System.out.print("Enter student " + (i+1) + "'s name: ");
            student[i].name = kb.next();
            System.out.print("Enter student " + (i+1) + "'s grade: ");
            student[i].grade = kb.nextInt();
            System.out.print("Enter student " + (i+1) + "'s average: ");
            student[i].avrg = kb.nextDouble();
        }
        System.out.println();

        for ( int i = 0; i < student.length; i++ ) {
            System.out.println(i+1 + ". " + student[i]);
        }
    }
}
