
/**
 * Write a description of class arrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrays

{
    private int[] array1;
    private int[] array2;
    private Person[] persons;
    private Person anna;
    public void person(){
        array1 = new int[] {1,2,3,4};
        array2 = new int[10];
        persons = new Person[10];
    }

    public void annainpersons() {
        Person anna = new Person("Anna", true,180,60);
        this.anna = anna;
        persons[0] = anna;
    }

    public void annavonstudentsholen() {
        Person tmp;
        tmp =persons[0];
        System.out.print(tmp);
        System.out.println(persons[0]);
        System.out.println(tmp == persons[0]);
    }
}