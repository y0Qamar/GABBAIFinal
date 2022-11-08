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

public class Daf extends Shoresh { //"Page" or groupings

    //declare additional variables of Daf
    static ArrayList<Shoresh> milim; //ArrayList of kehila

   static Scanner jts = new Scanner(System.in);


    static int kehilaCounter = 1; //It starts at one because I'm always in it.

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
        Shoresh milah = new Milah() {
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
        System.out.println("Thank you.");
        milim.add(milah);
        kehilaCounter++;

    }


    //read kehila
    public void printKehila() {
        for (Shoresh shoresh : this.milim) {
            toString();
        }
    }

    //find person by name
    public Shoresh findMilah(String name) {
        if (getName() == name) ;
        return null;
    }

    //delete milah
    public void removeMilah(String name) {
        Shoresh removedShoresh = findMilah(getName());
        milim.remove(removedShoresh);

        kehilaCounter--;

        //confirms
        System.out.println(removedShoresh + "has been removed.");
    }

    //ucry
    static void ucryOpps() {
        System.out.println("Shalom!");
        System.out.println("Type (C) to create milah");
        System.out.println("Type (R) to read milim");
        System.out.println("Type (U) to update milah");
        System.out.println("Type (Y) to yeet milah");
        System.out.println("Type (Q) to quit");
    }

    //serialize Milah

    public class SerializeMil {
        public static void serialize(Shoresh e) {
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

                System.out.println("serialized data is saved");

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


            Shoresh e = null; //creates an obj type Milah for us to attempt to either pull data from file or return

            try {
                //read object from a file
                FileInputStream file = new FileInputStream("milim.ser");
                //create a connect to file
                ObjectInputStream in = new ObjectInputStream(file);

                //method for deserialization of object
                e = (Shoresh) in.readObject();
                //makes it type Employee


                in.close();
                file.close();

                System.out.println("Milah has been deserialized.");

                System.out.println(e.getName());

            } catch (IOException i) {
                i.printStackTrace();

            } catch (ClassNotFoundException c) {
                c.printStackTrace();
            }
        }



        //serialize Milim Arraylist
        public static void serializeArray(ArrayList<Shoresh> milim) {
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

            ArrayList<Shoresh> daf = new ArrayList<>(); // this create an object of type Milah to receive data from file or return

            try {
                // read object from a file
                FileInputStream file = new FileInputStream("milim.ser");
                // create a connect to a file
                ObjectInputStream in = new ObjectInputStream(file);

                // method for deserialization for an object
                daf = (ArrayList<Shoresh>) in.readObject();
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





