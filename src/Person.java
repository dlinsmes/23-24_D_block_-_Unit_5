public class Person {
    //a class is a blueprint
    //an object is one specific example made from the blueprint

    //(non-static) instance variables - every object will have these variables,
    //but each one can have different values

    //static (class) methods or variables -  belong to the whole class rather
    //than one specific object
    static int numPeople = 0;

    //private visibility means only this class can access the variable
    private String name;
    private int age;
    private boolean smart;

    public Person(String name, int age, boolean s) {
        //use "this" when the param has the same name as the
        //instance variables. "this" will refer to the instance var
        this.name = name;
        this.age = age;
        smart = s;

        //increment every time either
        // constructor is called
        numPeople++;
    }

    public Person(String name) {
        this.name = name;
        //regardless of how many params, should still
        //initialize all the instance variables
        age = 15;
        smart = false;

        numPeople++;
    }

    //accessors aka get methods aka getters return the private var
    //for outside access
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public boolean getSmart() {
        return smart;
    }

    //mutators aka setters aka set methods
    //change values of  private variables

    public void setSmart(boolean newSmart) {
        smart = newSmart;
    }

    public String toString() {
        //don't print in toString,
        // but return what you want the object to print as
        if (smart)
            return name + " is a very smart " + age + "-year-old person";
        return name + " is not a very smart " + age + "-year-old person";
    }

}
