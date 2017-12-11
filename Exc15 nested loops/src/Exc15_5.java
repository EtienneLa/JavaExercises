public class Exc15_5 {

    public static void main( String[] args ){

        for (int i = 10; i <= 50; i++) {

            for (int j = 10; j <= 50; j++) {

                if ((i + j) == 60 && Math.abs(i - j) == 14) {

                    System.out.print("(" + i + ", " + j + ")\n");
                }
            }
        }
    }
}
