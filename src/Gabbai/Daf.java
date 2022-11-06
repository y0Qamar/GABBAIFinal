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


        //serialize

        //deserialize
    }





