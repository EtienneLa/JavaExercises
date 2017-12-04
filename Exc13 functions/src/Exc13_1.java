import java.util.Scanner;

public class Exc13_1 {

    public static void main( String[] args){

        Scanner kb = new Scanner(System.in);

        System.out.println( "1. Butterfly" );
        System.out.println( "2. Elephant" );
        System.out.println( "3. Teddy Bear" );
        System.out.println( "4. Snake" );

        System.out.print( "\nWhich animal to draw? ");
        int chosen = kb.nextInt();

        if( chosen == 1) {
            drawButterfly();
            drawButterfly();
        }
        else if( chosen == 2)
            drawElephant();
        else if( chosen == 3)
            drawTeddyBear();
        else if( chosen == 4)
            drawSnake();
        else
            System.out.println( "\nSorry, that wasn't one of the choices.");

        System.out.println( "\nGoodbye!");
    }

    public static void drawButterfly(){

        System.out.println("  .==-.                   .-==.     ");
        System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
        System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
        System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
        System.out.println("      `._... .q(_)p. ..._.'         ");
        System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
        System.out.println("        .\"\"' .'|=|`. `\"\".       ");
        System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
        System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
        System.out.println("      \\O `::/       \\::' O/       ");
        System.out.println("       \"\"--'         `--\"\"   hjw");
    }

    public static void drawElephant(){

        System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
        System.out.println("   _.-'         \\ __...----...__ /         '-._");
        System.out.println(" .'      .:::...,'              ',...:::.      '.");
        System.out.println("(     .'``'''::;                  ;::'''``'.     )");
        System.out.println(" \\             '-)              (-'             /");
        System.out.println("  \\             /                \\             /");
        System.out.println("   \\          .'.-.            .-.'.          /");
        System.out.println("    \\         | \\0|            |0/ |         /");
        System.out.println("    |          \\  |   .-==-.   |  /          |");
        System.out.println("     \\          `/`;          ;`\\`          /");
        System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
        System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
        System.out.println("               / /`;   .==.   ;`\\ \\");
        System.out.println("         .---./_/   \\  .==.  /   \\ \\");
        System.out.println("        / '.    `-.__)       |    `\"");
        System.out.println("       | =(`-.        '==.   ;");
        System.out.println(" jgs    \\  '. `-.           /");
        System.out.println("         \\_:_)   `\"--.....-'");
    }

    public static void drawTeddyBear(){

        System.out.println("            ___   .--. ");
        System.out.println("      .--.-\"   \"-' .- |");
        System.out.println("     / .-,`          .'");
        System.out.println("     \\   `           \\");
        System.out.println("      '.            ! \\");
        System.out.println("        |     !  .--.  |");
        System.out.println("        \\        '--'  /.____");
        System.out.println("       /`-.     \\__,'.'      `\\");
        System.out.println("    __/   \\`-.____.-' `\\      /");
        System.out.println("    | `---`'-'._/-`     \\----'    _");
        System.out.println("    |,-'`  /             |    _.-' `\\");
        System.out.println("   .'     /              |--'`     / |");
        System.out.println("  /      /\\              `         | |");
        System.out.println("  |   .\\/  \\      .--. __          \\ |");
        System.out.println("   '-'      '._       /  `\\         /");
        System.out.println("      jgs      `\\    '     |------'`");
        System.out.println("                 \\  |      |");
        System.out.println("                  \\        /");
        System.out.println("                   '._  _.'");
        System.out.println("                      ``");
    }

    public static void drawSnake(){

        System.out.println("         ,,'6''-,.");
        System.out.println("        <====,.;;--.");
        System.out.println("        _`---===. \"\"\"==__");
        System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
        System.out.println("     |( @@@  |===|  @@@  ||");
        System.out.println("      \\\\ @@   |===|  @@  //");
        System.out.println("        \\\\ @@ |===|@@@ //");
        System.out.println("         \\\\  |===|  //");
        System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
        System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
        System.out.println("             |==||                           `\\   \\");
        System.out.println("            |==| |          pb                 )   |");
        System.out.println("           |==| |       _____         ______,--'   '");
        System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
        System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
        System.out.println("                \"\"\"\"		");
    }
}
