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

public class Daf extends Milah { //"Page" or groupings

    //declare additional variables of Daf

    static String kehila; //Name of list
    static ArrayList<Milah> milim; //ArrayList of kehila

    static int kehilaCounter = 1; //It starts at one because I'm always in it.

    //create kehila
    public Daf(String kehila) {
        Daf.kehila = kehila;
        Daf.milim = new ArrayList<>();

    }

    //add milah
    public void addMilah() {

        Milah milah = new Milah() {
            @Override
            public void setName(String name) {
                super.setName(name);
            }

            @Override
            public void setpNouns(String pNouns) {
                super.setpNouns(pNouns);
            }

            @Override
            public void setShevet(String shevet) {
                super.setShevet(shevet);
            }

            @Override
            public void setSup(String sup) {
                super.setSup(sup);
            }

            @Override
            public void setSaf(String saf) {
                super.setSaf(saf);
            }

            @Override
            public void setAccs(String accs) {
                super.setAccs(accs);
            }

            @Override
            public void setLifeCycle(ArrayList<String> lifeCycle) {
                super.setLifeCycle(lifeCycle);
            }

            @Override
            public void setAge(int age) {
                super.setAge(age);
            }


        };
        milim.add(milah);
        kehilaCounter++;
    }


    //read kehila
    public void printKehila() {
        for (Milah milah : this.milim) {
            toString();
        }
    }

    //find person by name
    public Milah findMilah(String name) {
        if (getName() == name) ;
        return null;
    }

    //delete milah
    public void removeMilah(String name) {
        Milah removedMilah = findMilah(getName());
        milim.remove(removedMilah);

        kehilaCounter--;

        //confirms
        System.out.println(removedMilah + "has been removed.");
    }

    //ucry
    static void ucryOptionsM() {
        System.out.println("Shalom!");
        System.out.println("Type (C) to create milah");
        System.out.println("Type (R) to read milim");
        System.out.println("Type (U) to update milah");
        System.out.println("Type (Y) to yeet milah");
        System.out.println("Type (Q) to quit");
    }


    //serialize Milim Arraylist
    public static void serializeArray(ArrayList<Milah> milim) {
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

        ArrayList<Milah> daf = new ArrayList<>(); // this create an object of type Milah to receive data from file or return

        try {
            // read object from a file
            FileInputStream file = new FileInputStream("milim.ser");
            // create a connect to a file
            ObjectInputStream in = new ObjectInputStream(file);

            // method for deserialization for an object
            daf = (ArrayList<Milah>) in.readObject();
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





