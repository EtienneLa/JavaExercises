import java.util.Scanner;

public class Exc18_4 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String[] pokeParty = {"PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY"};

        int x;

        do {
            System.out.println("EXCHANGE POKEMON\n");
            System.out.println("0. " + pokeParty[0]);
            for ( int i = 1; i < pokeParty.length; i++ )
                System.out.print("\t" + i + ". " + pokeParty[i] + "\n");

            System.out.println("\nChoose a Pokemon to exchange with " + pokeParty[0] + ". (Or enter 0 to quit.");
            System.out.print("> ");
            x = kb.nextInt();

            String temp = pokeParty[0];
            pokeParty[0] = pokeParty[x];
            pokeParty[x] = temp;

        } while ( x != 0);
    }
}
