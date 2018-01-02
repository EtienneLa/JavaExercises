import java.util.Scanner;

public class Exc17_14 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String[] names = {"Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks"};
        double[] grade = {99.5, 78.5, 95.6, 96.8, 82.7};
        int[] id = {123456, 813225, 823669, 307760, 827131};

        System.out.println("Values:");

        for (int i = 0; i < names.length; i++){
            System.out.print("\t\t" + names[i] + " " + grade[i] + " " + id[i]);
            System.out.println();
        }
        System.out.print("\nID number to find: ");
        int findId = kb.nextInt();
        int found = 0;

        for (int i = 0; i < id.length; i++){
            if (id[i] == findId)
                found = i;
        }
        System.out.println("Found in slot " + found);
        System.out.println("\t\tName: " + names[found]);
        System.out.println("\t\tAverage: "+ grade[found]);
        System.out.println("\t\tID: " + id[found]);

    }
}
