package Gabbai;
/* Your project should implement at least 3 classes

        Class attributes should be encapsulated (private with getters/setters)

        Your manager class should have all 4 CRUD methods implemented

        Your manager class should implement saveData() and loadData() methods and your user interface should give the user
        an option to save before quitting and to load when first starting the program.

        Both methods should serialize and deserialize your class data.
        You should strive to have at least 10 commits in your git log by the end of this challenge.

        Personal extra credit: Tzadaka account as well.

 */

/* the class where we establish the parameters for
people important to the Kehila.
All congregant info needs to be set to private

Pseudocode: This is for me as a rabbi to keep information donor/constituent data-bases can't.
This information once collected will not be sold, used for commercial purposes,
Or seen by anyone other than me.

Shoresh - Kehila member abstract class - ever single member of the Kehila
Getter, setters
Milah class extends Shoresh

getter
setter
Member counter - Very very important! but it always has to report 1 off


todo:
 1)  milim variables - String name String Shevet String Jewish Birthday int age String addy (kid method no)
 String lifeCycle (abstract)
2) Milah - person, private
3) getter - done
4) setter


 */

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

