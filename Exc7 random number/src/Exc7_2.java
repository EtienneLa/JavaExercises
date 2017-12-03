import java.util.Random;

public class Exc7_2 {

    public static void main(String[]args){

        Random r = new Random();

        int choice = 1 + r.nextInt(15);
        String response = "";

        if (choice == 1)
            response = "It is certain";

        else if (choice == 2)
            response = "It is decidedly so";

        else if (choice == 3)
            response = "Without a doubt";

        else if (choice == 4)
            response = "Yes - definitely";

        else if (choice == 5)
            response = "You may rely on it";

        else if (choice == 6)
            response = "As I see it, yes";

        else if (choice == 7)
            response = "Most likely";

        else if (choice == 8)
            response = "Outlook good";

        else if (choice == 9)
            response = "Signs point to yes";

        else if (choice == 10)
            response = "Yes";

        else if (choice == 11)
            response = "Ask again later";

        else if (choice == 12)
            response = "No";

        else if (choice == 13)
            response = "On your own risk";

        else if (choice == 14)
            response = "You should not rely on it";

        else if (choice == 15)
            response = "Hell no";

        else
            response = "8-BALL ERROR!";

        System.out.println(" MAGIC 8-BALL SAYS: " +  response);


    }
}
