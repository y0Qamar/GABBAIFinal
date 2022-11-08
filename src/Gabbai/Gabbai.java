package Gabbai;

/* The class where Milah are instantiated, added to the Daf, CRUD called
serialized and deserialized

 todo: Pre Oct Com
1) Separate out this logic for create so you can it in the loops ,
 2) Take out String arrays for now
 3) Fix main
 4) Commit
 5) Make a git

 */






 */


import java.util.ArrayList;
import java.util.Scanner;

public class Gabbai extends Shoresh {

    //main
    public static void main(String[] args) {

        //declares new daf (congregation)
        Daf kehila = new Daf();
        //declare joanne the scanner
        Scanner jts = new Scanner(System.in);
        //while loopin for crud nuggets
        Daf.ucryOpps();
        String reply = jts.nextLine();


        //NOTE TO SELF: Before you even start this, know that it daunts you. Take breaks, frfr.
        while (!reply.equalsIgnoreCase("Q")) {

            //CAM!!!! - Refactored create after I asked you about it.

            if (reply.equalsIgnoreCase("C")) {
                 Daf.addMilah();
                Daf.ucryOpps();
                reply = jts.nextLine();


           } else if (reply.equalsIgnoreCase("R")) {
                kehila.printKehila();
               System.out.println("What do you want to do next?");
               Daf.ucryOpps();
               reply = jts.nextLine();
               //Add Find by name
           } else if (reply.equalsIgnoreCase("U")) {
               System.out.println("Please enter product ID Number");
               int productID = jts.nextInt();
               jts.nextLine();
               Product updatedP = targay.findProductByPID(productID);
               System.out.println("What information would you like to change?");
               System.out.println("Type (name) or (price).");
               System.out.println("Type (Y) to exit");
               String change = jts.nextLine();
               if (change.equalsIgnoreCase("name")) {
                   System.out.println("What would you like to change the name to?");
                   String newName = jts.nextLine();
                   updatedP.pName = newName;
                   System.out.println("--Name changed--");
                   System.out.println(updatedP);
                   System.out.println("What else would you like to change?");
                   System.out.println("Type (Y) if there are no more changes.");
                   change = jts.nextLine();
                   //change price
               } else if (change.equalsIgnoreCase("price")) {
                   System.out.println("What would you like to change the price to?");
                   double newPrice = jts.nextDouble();
                   jts.nextLine();
                   updatedP.pCost = newPrice;
                   System.out.println("--Price changed--");
                   System.out.println(updatedP);
                   System.out.println("What else would you like to change?");
                   System.out.println("Type (Q) if there are no more changes.");
                   change = jts.nextLine();
                   //if wrong input is typed
               } else {
                   System.out.println("Please type (name) or (price)");
                   change = jts.nextLine();

                   //anything else
                   //checks if user is ready to quit the program yet or do something else
                   System.out.println("What else would you like to do?\n");
                   ucryOptionsM();
                   reply = jts.nextLine();

               }

               //Yeet
           } else if (reply.equalsIgnoreCase("Y")) {
               System.out.println("What is the ID of the product you would like to yeet?");
               int deleteId = jts.nextInt();
               jts.nextLine();
               //finds person by name to remove
               targay.removeProduct(deleteId);
               ucryOptionsM();
               reply = jts.nextLine();
           }

           //Quit
           while (reply.equalsIgnoreCase("Q"));
           //sout, system.exit, sout


       }


       //add
       //pringt
       //serialize
   }

}

                 */
