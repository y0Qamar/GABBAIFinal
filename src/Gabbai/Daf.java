package Gabbai;

  /*
    class where we establish parameters on groupings of kehila and
    CRUD options

    Psuedocode:
    Arraylists  Daf - groupings of people who are interconnected by roots
    CRUD - that's a while loop, easy peasy
    serialize and desurrealize

     */

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Daf extends Milah { //"Page" or groupings

    //declare additional variables of Daf
    static ArrayList<Milah> milim; //ArrayList of kehila

    static Scanner jts = new Scanner(System.in);


    static int kehilaCounter = 2; //It starts at two because I'm always in it.


    //ucry
    public void ucryOpps() {
        System.out.println("Type (C) to create milah");
        System.out.println("Type (R) to read milim");
        System.out.println("Type (U) to update milah");
        System.out.println("Type (Y) to yeet milah");
        System.out.println("Type (Q) to quit");
    }

    //creating a daf
    public Daf() {
        Daf.milim = new ArrayList<>();

    }

    //add milah
    static void addMilah() {

        System.out.println("Please enter person's name:");
        /* add conditions--is only numbers
         */
        String name = jts.nextLine();
        Milah milah = new Milah() {
            @Override
            public void setName(String name) {
                super.setName(name);
                System.out.println("Please enter " + getName() + "'s pronouns (where applicable)");
            }

            @Override
            public void setpNouns(String pNouns) {
                pNouns = jts.nextLine();
                super.setpNouns(pNouns);
                System.out.println("Please enter " + getName() + "'s support needs.");

            }

            @Override
            public void setSup(String sup) {
                sup = jts.nextLine();
                super.setSup(sup);
                System.out.println("Please enter " + getName() + "'s safety needs.");
            }

            @Override
            public void setSaf(String saf) {
                saf = jts.nextLine();
                super.setSaf(saf);
                System.out.println("Please enter " + getName() + "'s access needs.");
            }

            @Override
            public void setAccs(String accs) {
                accs = jts.nextLine();
                super.setAccs(accs);
                System.out.println("Please enter " + getName() + "'s age");
            }


            @Override
            public void setAge(int age) {
                age = jts.nextInt();
                jts.nextLine();
                super.setAge(age);

            }

        };
        Daf.milim.add(milah);
        kehilaCounter++;
        System.out.println("The following person was added to the Milim:");
        milah.toString();
        System.out.println("Mazal tov! We have" + kehilaCounter + " milim in our Kehila.");
    }


    //read kehila
    public void printKehila() {
        for (Shoresh shoresh : this.milim) {
            toString();
        }
    }

    //find person by name
    public Milah findMilah(String name) {
        if (getName() == name) ;
        return null;
    }


    // Update Milah
    public void updateMilah() {
        System.out.println("Please enter name");
        String name = jts.nextLine();
        this.findMilah(name);
        System.out.println("What information would you like to change?");
        System.out.println("Type (name), (pronouns), (support), (access), (safety).");
        System.out.println("Type (Y) to exit");
        String change = jts.nextLine();

        if (change.equalsIgnoreCase("name")) {
            System.out.println("What would you like to change the name to?");
            String newName = jts.nextLine();
            this.setName(newName);
            System.out.println("--Name changed--");
            System.out.println(newName);
            System.out.println("What else would you like to change?");
            System.out.println("Type (Y) if there are no more changes.");
            change = jts.nextLine();

            //change pronouns
        } else if (change.equalsIgnoreCase("pronouns")) {
            System.out.println("What would you like to change the pronouns to?");
            String newPNouns = jts.nextLine();
            this.setpNouns(newPNouns);
            System.out.println("--Pronouns changed--");
            System.out.println(this.getName() + "'s pronouns have changed to" + newPNouns);
            System.out.println("What else would you like to change?");
            System.out.println("Type (Q) if there are no more changes.");
            change = jts.nextLine();

            //change support
        } else if (change.equalsIgnoreCase("support")) {
            System.out.println("Here are" + this.getName() + "'s current support needs: " + this.getSup());
            System.out.println("How would you like to change them?");
            String newSupp = jts.nextLine();
            this.setSup(newSupp);
            System.out.println("--Support needs changed--");
            System.out.println("What else would you like to change?");
            System.out.println("Type (Q) if there are no more changes.");
            change = jts.nextLine();

            //access
        } else if (change.equalsIgnoreCase("Access")) {
            System.out.println("Here are" + this.getName() + "'s current access needs: " + this.getAccs());
            System.out.println("How would you like to change them?");
            String newAccs = jts.nextLine();
            this.setAccs(newAccs);
            System.out.println("--Support needs changed--");
            System.out.println("What else would you like to change?");
            System.out.println("Type (Q) if there are no more changes.");
            change = jts.nextLine();

            // safety
        } else if (change.equalsIgnoreCase("Safety")) {
            System.out.println("Here are" + this.getName() + "'s current support needs: " + this.getSup());
            System.out.println("How would you like to change them?");
            String newSupp = jts.nextLine();
            this.setSup(newSupp);
            System.out.println("--Support needs changed--");
            System.out.println("What else would you like to change?");
            System.out.println("Type (Q) if there are no more changes.");
            change = jts.nextLine();

            //Makes sure of right input
        } else {
            System.out.println("Type (name), (pronouns), (support), (access), (safety).\" or (price)");
            change = jts.nextLine();
        }
    }


    //delete Milah
    public void removeMilah() {
        Milah removedMilah = findMilah(getName());
        Daf.milim.remove(removedMilah);

        kehilaCounter--;

        //confirms
        System.out.println(removedMilah + "has been removed.");
    }

    //serialize Milah

    public class SerializeMil {
        public static void serialize(Milah e) {
            try {
                //allows us to create a stream to write to a file
                FileOutputStream fileOut = new FileOutputStream("milim.ser");

                //responsible for streaming data to file
                ObjectOutputStream out = new ObjectOutputStream(fileOut);

                //writing object we passed in
                out.writeObject(e);

//closing the stream
                out.close();

                // closing the steam
                fileOut.close();

                System.out.println("Milah is saved");

                //   i is the name of the io exception
            } catch (IOException i) {
                //catches and prints all methods called and allows us to see where code went wrong

                i.printStackTrace();
                //stacks are last in first out
            }
        }
        //deserialize Milah
        public static void deSerialize() {
            // need to read from file object.ser the data from our milim and if possible
            // create a new milah, otherwise return null;


            Milah e = null; //creates an obj type Milah for us to attempt to either pull data from file or return

            try {
                //read object from a file
                FileInputStream file = new FileInputStream("milim.ser");
                //create a connect to file
                ObjectInputStream in = new ObjectInputStream(file);

                //method for deserialization of object
                e = (Milah) in.readObject();
                //makes it type Employee


                in.close();
                file.close();

                System.out.println("Milah has been loaded.");
                System.out.println(e.getName());

            } catch (IOException i) {
                i.printStackTrace();

            } catch (ClassNotFoundException c) {
                c.printStackTrace();
            }
        }



        //serialize Milim Arraylist
        public static void saveKehila(ArrayList<Milah> milim) {
            try {
                FileOutputStream fileOut = new FileOutputStream("milim.ser");
                // ^ opening a connect to a new file and allowing to connect
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                // ^ streaming data from an object into a file
                out.writeObject(milim);
                // take this object
                out.close();
                // close it once we are done with the file
                fileOut.close();
                // close it once we are done with the file
                System.out.println("Serialized data is saved!");


            } catch (IOException i) {
                i.printStackTrace();
                // history of all the methods that were called - allows us to see where the code went wrong.
                //principle of a stack is similar to pringles - last in, first out
            }

        }

        //deserialize milim Array
        public static void deserializeArray() {
// we need to read from the file object.ser the data for our employee
// and if possible create a new employee otherwise return null

            try {
                // read object from a file
                FileInputStream file = new FileInputStream("milim.ser");
                // create a connect to a file
                ObjectInputStream in = new ObjectInputStream(file);

                // method for deserialization for an object
                milim = (ArrayList<Milah>) in.readObject();
                // ^ read object and convert data to type Employee

                in.close();
                file.close();

                System.out.println("Object has been deserliazed");
                System.out.println(milim.size());

            } catch (IOException i) {
                i.printStackTrace();

            } catch (ClassNotFoundException c) {
                c.printStackTrace();
            }

        }
    }
}





