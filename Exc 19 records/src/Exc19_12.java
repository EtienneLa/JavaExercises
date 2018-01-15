import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Exc19_12 {

    public static void main( String[] args ) throws FileNotFoundException {

        Pupil[] pupils = new Pupil[30];

        System.out.print("Open which file: ");
        Scanner kb = new Scanner(System.in);
        String filename = kb.next();
        File file = new File(filename);
        Scanner filesc = new Scanner(file);

        for ( int i = 0; i < pupils.length; i++ ) {
            pupils[i] = new Pupil();
            pupils[i].id = filesc.nextInt();
            pupils[i].gradenum = filesc.nextInt();
            pupils[i].grade = filesc.nextInt();
            pupils[i].clgrade = filesc.next();
        }
        filesc.close(); kb.close();

        System.out.println("\nData loaded.");

        pupil_sort( pupils );

        System.out.println("Data sorted.");
        System.out.println("Here are the sorted grades:\n");

        for ( int i = 0; i < pupils.length; i++ )
            System.out.println(pupils[i]);
    }

    public static void pupil_sort ( Pupil[] pupils ) {

        int i, j, swap;
        Pupil temp;

        for ( i = 0; i < pupils.length - 1; i++ ) {
            swap = i;
            for ( j = i+1; j < pupils.length; j++ )
                if ( pupils[j].id < pupils[swap].id )
                    swap = j;
            if ( swap != i ) {
                temp = pupils[i];
                pupils [i] = pupils[swap];
                pupils[swap] = temp;
            }
        }
        for ( i = 0; i < pupils.length - 1; i++ ) {
            swap = i;
            for (j = i + 1; j < pupils.length; j++)
                if (pupils[j].id == pupils[swap].id && pupils[j].gradenum < pupils[swap].gradenum)
                    swap = j;
            if (swap != i) {
                temp = pupils[i];
                pupils[i] = pupils[swap];
                pupils[swap] = temp;
            }
        }
    }
}

class Pupil {

    int id;
    int gradenum;
    int grade;
    String clgrade;

    public String toString() {
        return "\t\t" + id + " " + gradenum + " " + grade + " " + clgrade;
    }
}
