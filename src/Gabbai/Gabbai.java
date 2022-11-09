package Gabbai;

/* The class where Milah are instantiated, added to the Daf, CRUD called
serialized and deserialized


 */




import java.util.ArrayList;
import java.util.Scanner;

public class Gabbai extends Daf {

    //main
    public static void main(String[] args) {

        //declares new daf (congregation)
        Daf kehila = new Daf();
        //declare joanne the scanner
        Scanner jts = new Scanner(System.in);

        //Calls crud
        System.out.println("Shalom! I'm your Gabbai. I hold our people.");
        kehila.ucryOpps();
        String reply = jts.nextLine();

        while (!reply.equalsIgnoreCase("Q")) {

            //Create
            if (reply.equalsIgnoreCase("C")) {
                kehila.addMilah();
                kehila.ucryOpps();
                reply = jts.nextLine();

                //Read
            } else if (reply.equalsIgnoreCase("R")) {
                kehila.printKehila();
                System.out.println("What do you want to do next?");
                kehila.ucryOpps();
                reply = jts.nextLine();

                //Update
            } else if (reply.equalsIgnoreCase("U")) {
                kehila.updateMilah();
                System.out.println("What else would you like to do?\n");
                kehila.ucryOpps();
                reply = jts.nextLine();
            }

            //Yeet
        else if (reply.equalsIgnoreCase("Y")) {
                kehila.removeMilah();
                System.out.println("What else would you like to do?\n");
                kehila.ucryOpps();
                reply = jts.nextLine();
            }
            //Quit
            while (reply.equalsIgnoreCase("Q")) {
                System.out.println("Would you like to save your data before you quit: (Y)or(N)?");
                reply = jts.nextLine();
                if (reply.equalsIgnoreCase("Y")) {
                    SerializeMil.serialize(kehila);
                } else if (reply.equalsIgnoreCase("N")) {
                    System.exit(0);
                }
            }
        }
    }
}