import java.util.Scanner;

public class Exc13_8 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int select = 0, triangleb, triangleh, rectl, rectw, square, radius;

        while (select != 5) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("\n1) Triangle\n2) Rectangle\n3) Square\n4) Circle\n5) Quit");
            System.out.print("Which shape: ");

            select = kb.nextInt();

            if (select == 1){

                System.out.print("\nBase: ");
                triangleb = kb.nextInt();
                System.out.print("Height: ");
                triangleh = kb.nextInt();
                System.out.println("\nThe area is " + triangle_area(triangleb, triangleh));
            }
            else if (select == 2){

                System.out.print("\nLength: ");
                rectl = kb.nextInt();
                System.out.print("Width: ");
                rectw = kb.nextInt();
                System.out.println("\nThe area is " + rectangle_area(rectl, rectw));
            }
            else if (select == 3){

                System.out.print("\nSide length: ");
                square = kb.nextInt();
                System.out.println("\nThe area is " + square_area(square));
            }
            else if (select == 4){

                System.out.print("\nRadius: ");
                radius = kb.nextInt();
                System.out.println("\nThe area is " + circle_area(radius));
            }

        }
        System.out.println("\nGoodbye!");
    }

    public static Double triangle_area(int triangleb, int triangleh){

        double area = 0.5*triangleb*triangleh;

        return area;
    }
    public static Integer rectangle_area(int rectl, int rectw){

        int area = rectl*rectw;

        return area;
    }
    public static Integer square_area(int square){

        int area = square*square;

        return area;
    }
    public static Double circle_area(int radius){

        double area = Math.PI*radius*radius;

        return area;
    }
}