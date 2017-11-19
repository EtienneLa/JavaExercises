public class Exc4_3 {

    public static void main(String[]args){

        int people = 30;
        int cars = 30;
        int buses = 30;

        if ( cars > people){
            System.out.println("We should take the cars.");
        }
        else if ( cars < people){
            System.out.println("We should not take the cars.");
        }
        else{
            System.out.println("We can not decide.");
        }
        if (buses > cars){
            System.out.println("That's way too many buses.");
        }
        else if (buses < cars){
            System.out.println("Maybe we could take the buses.");
        }
        else{
            System.out.println("We still can not decice.");
        }
        if (people > buses){
            System.out.println("All right, let's just take the buses.");
        }
        else{
            System.out.println("Fine, let's just stay home then.");
        }
    }
}
