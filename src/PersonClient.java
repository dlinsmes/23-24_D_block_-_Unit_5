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

        System.out.println();

        //for-each loop that does the same thing
        //p will iterate through each object, p is NOT an int (index)
        for(Person p: people) {
            System.out.println(p.getName());
        }

        System.out.println();

        people.add(b);
        people.add(b);
        people.add(b);

        //remove all objects from the list using a for loop

        //code goes here

        //when you remove from an arraylist, the indices of all other
        //elements get shifted so that the indices are [0, size)

//        int origSize= people.size();
//        for (int i = 0; i < people.size(); i++) {
//            people.remove(i);
//            i--;
//        }

        for (int i = people.size()-1; i >= 0; i--) {
            people.remove(i);
        }

        System.out.println(people.size());

        //array of Person objects
        Person [] personArray;

        personArray = new Person[3];

        //null bc no objects have been saved to the array
        System.out.println(personArray[0]);
        System.out.println();

        personArray[0] = b;
        personArray[1] = c;
        personArray[2] = new Person("lin");

        //for loop that iterates through personArray to print each object's name
        for (int i = 0; i < personArray.length; i++) {
            //for arrays, use brackets instead of.get()
            System.out.println(personArray[i].getName());
        }

        System.out.println();
        for (Person p: personArray) {
            System.out.println(p.getName());

            //p is a Person object, NOT an int value meant to be indexed
            //System.out.println(peopleArray[p]);
        }

        System.out.println();
        System.out.println(b);

        int num = 100;

        changeAge(b, num);

        //primitive values don't get changed by methods
        //objects (incl arrays and arrayLists) DO get changed by methods
        System.out.println("num is: " + num);
        System.out.println("person's age is: " + b.getAge());

        //these all refer to the same object, NOT different copies of the object
        //if you make a change through any one of these references (x, y, z, b),
        //the change is seen through all the other references
        Person x = b;
        Person y = b;
        Person z = y;

        y.setAge(50);

        System.out.println(b.getAge());
        System.out.println(x.getAge());
        System.out.println(y.getAge());
        System.out.println(z.getAge());


        //if toString() is removed from Person, these will
        // all output the same memory location because they
        //refer to the same object
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        //to make a separate copy that will have independent variables:
        Person w = new Person(b.getName(), b.getAge(), b.getSmart());

        w.setAge(-50);

        System.out.println(b.getAge());
        System.out.println(w.getAge());
    }

    public static void changeAge(Person p, int newAge) {
        p.setAge(newAge);
        newAge = -1;
    }
}
