package Gabbai;

/* The class where milim are creatd, added to groups, CRUD called
serialized and deserialized

todo:
 1) Main -done
 2) imports--scanner, -done
 3) joanne the scanner -done

 todo: (Before Sept Com) take breaks or you a punk
  1) Copy past while -done
  2) edit the pseudocode/comments on while: change all variables and add quti code -done
  3) Commit -Sept -bout to be done
  4) edit the meat
  4B) Commit -Oct
  5) Double chek
  6) Run



 */

import java.util.Scanner;

public class Gabbai {

   //main
   public static void main(String[] args) {
       //declare joanne the scanner
       Scanner jts = new Scanner(System.in);
       //while loopin for crud nuggets
       Daf.ucryOpps();
       String reply = jts.nextLine();


       //NOTE TO SELF: Before you even start this, know that it daunts you. Take breaks, frfr.
       while (!reply.equalsIgnoreCase("Q")) {

           //Create
           if (reply.equalsIgnoreCase("C")) {

               //Asks person's name
               System.out.println("Please enter person's name:");
               /* add conditions--is only numbers
                */
               String name = jts.nextLine();

               //asks int age
               System.out.println("Please Enter Product Name");
               String pName = jts.nextLine();

               //String pNouns
               System.out.println("Please Enter Product Cost ");
               double pCost = jts.nextDouble();
               jts.nextLine();

               //String Shevet
               System.out.println("Is Product in Stock? (True) or (False)");
               boolean inStock = jts.nextBoolean();
               jts.nextLine();

               //String sup

               //String saf

               //String accs

               //Add Arraylsit<String> lifeCycle;

               //creates new person
               Product newProduct = new Product(pName, pID, pCost, inStock);
               targay.products.add(newProduct);
               targay.printInventory();
               //asks same Question again until user inputs Q
               ucryOptionsM();
               reply = jts.nextLine();

               //Add read method
           } else if (reply.equalsIgnoreCase("R")) {
               targay.printInventory();
               System.out.println("What do you want to do next?");
               ucryOptionsM();
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
