//a class is a blueprint/template
//for something you want to represent
//in your program
public class Panda {
    //instance variables
    //-each panda we make will have
    //these characteristics, but with
    //different values

    String name;

    //age should only be able to
    // increase from the current value

    //private is a visibility modifier that
    //only allows read and write access to
    //the current class
    //-outside classes cannot see/use this variable
    private int age;
    double weight;
    double wingspan;

    //generally, all instance variables should be private

    //defne a constructor
    //-a constructor is a special method used for
    //instantiating (making instances of) new Panda objects
    //-instance and object mean the same thing - specific
    //examples made from the class
    public Panda() {
        //a constructor should initialize
        //all instance variables
        name = "charles";
        age = 0;
        weight = 8.9;
        wingspan = 40.0;
    }

    //overloaded constructors
    //-have a different type/quantity/sequence
    //of parameters
    public Panda(String n, int a, double weight, double wingspan) {
        //initialize all instance variables
        name = n;
        age = a;
        //the "this" keyword will refer to the instance variable
        //without "this" will refer to the parameter with the same name
        this.weight = weight;
        this.wingspan = wingspan;

        //if there were only 3 params, still want to define
        //a default value for the remaining instance variable

    }

    //accessor method aka get method aka getter
    //-allow read access to a private variable
    // to other classes
    //-return type should match the variable type
    //ex: getName() should return a String
    public int getAge() {
        return age;
    }

    //mutator methods aka set methods aka setters
    //-allow outside classes to modify instance variables
    // in controlled ways
    public void setAge(int yearsToAdd) {
        if (yearsToAdd >= 0) {
            age += yearsToAdd;
        }
        else {
            System.out.println("age can't be changed with a negative");
        }
    }
}
