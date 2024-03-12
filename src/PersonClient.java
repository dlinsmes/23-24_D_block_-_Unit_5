import java.util.ArrayList;
public class PersonClient {
    public static void main(String [] args) {

        //a default, no-param constructor is available
        //when a constructor hasn't been defined in the class
        //-any instance variables will get values of 0/null/false
        //Person a = new Person();

        Person b = new Person("Bill", 98, false);
        Person c = new Person("Mr. Lin");

        //can't access the private variable from another class
        //System.out.println(c.name);

        System.out.println(c.getName());

        c.setSmart(true);
        System.out.println(c.getSmart());

        //without a toString() method in the class,
        //printing an object will output its memory location (not useful)
        System.out.println(b);

        //static means a variable or methods belongs to the whole class, rather
        //than one specific object

        //-call the static method directly from the class
        //without making an object first
        CSVImporter.importData("Panda.csv");

        CSVImporter ci = new CSVImporter();
        ci.importData("Panda.csv");

        //static methods and variables ARE accessible from
        //individual objects.

        //for static variables, the class and all objects
        //will share the same value

        System.out.println(Person.numPeople);
        System.out.println(b.numPeople);
        System.out.println(c.numPeople);

        b.numPeople = 100;

        //when the static variable is changed from one
        //object, it's changed for all the objects and the class
        //-it's the same variable and it's shared
        System.out.println(Person.numPeople);
        System.out.println(b.numPeople);
        System.out.println(c.numPeople);

        //random() is a static method - we know bc we've never made
        //a Math object
        double r = Math.random();

        //since main() is always static, you can call it
        //from a different class without making an object
        //CardClient.main(args);

        //ArrayLists vs arrays
        //ArrayLists have dynamic sizes - you can add and
        //remove objects
        //arrays have fixed lengths

        ArrayList<Person> people;

        people = new ArrayList<Person> ();

        //append the object at the end to the old list
        people.add(b);

        //insert the object at the indicated position
        people.add(0, c);

        System.out.println(people);

        Person d = new Person("Jackson");
        //replace with a new object
        people.set(1, d);

        System.out.println(people);

        //remove() will return the object that's
        //taken out from the list
        Person removed = people.remove(0);
        System.out.println("the object removed was: " + removed);
        System.out.println("remaining list: " + people);

        people.add(b);
        people.add(c);

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName());
        }

    }
}
