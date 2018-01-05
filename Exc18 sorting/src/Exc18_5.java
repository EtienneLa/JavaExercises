import java.util.Scanner;

public class Exc18_5
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };

        int a;
        int b;
        String btemp;

        do
        {
            System.out.println("EXCHANGE POKEMON\n");
            for ( int i=0; i<pokeParty.length; i++ )
                System.out.println("    " + i + ". " + pokeParty[i]);

            System.out.print("\nChoose a Pokemon (or -1 to quit). => ");
            a = keyboard.nextInt();

            if ( a >= 0 )
            {
                System.out.print("Choose a Pokemon to exchange with " + pokeParty[a] + ". => ");
                b = keyboard.nextInt();

                System.out.println("\nExchanging " + pokeParty[a] + " with " + pokeParty[b] + ".\n");

                btemp = pokeParty[b];
                pokeParty[b] = pokeParty[a];
                pokeParty[a] = btemp;
            }


        } while ( a >= 0 );

    }



}