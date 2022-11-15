package Gabbai;

//Made abstract to establish default implementation
abstract class Shoresh {

    //made the following private to demonstrate encapsulation because I only want certain methods to be able to approach this data
    private static String name; //name

    int age;
    private String pNouns; //pronouns
    private String shevet; //who are your people--Can include interpretaters, PCAs, caregivers, parents
    private String sup; //Support needs
    private String saf; //Safety needs
    private String accs; //Access needs

   //constructor
    public Shoresh() {
        this.name = name;
        this.age = age;
        this.pNouns = pNouns;
        this.shevet = shevet;
        this.sup = sup;
        this.saf = saf;
        this.accs = accs;

    }


    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpNouns() {
        return pNouns;
    }

    public void setpNouns(String pNouns) {
        this.pNouns = pNouns;
    }

     /* Needs to be redone as an array post fixing Daf methods

     public String getShevet() {
        return shevet;
    }

     public void setShevet(String shevet) {
        this.shevet = shevet;
    }

     */

    public String getSup() {
        return sup;
    }

    public void setSup(String sup) {
        this.sup = sup;
    }

    public String getSaf() {
        return saf;
    }

    public void setSaf(String saf) {
        this.saf = saf;
    }

    public String getAccs() {
        return accs;
    }

    public void setAccs(String accs) {
        this.accs = accs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

