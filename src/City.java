//a class is a blueprint or template for something
//you want to represent in your program

public class City {

    //instance variables
    //features that every object/instance (example) of the class
    //will have, but each object can have individual values
    //for each variable
    //-private to limit access to outside classes
    private String name;
    private String language;
    private int population;
    private boolean lockdown;

    //-static means the variable or method belongs to
    //the whole class, not one specific object/instance
    //-non-static means that the variable or method belongs
    //to one specific object
    static int numCities = 0;

    //constructor is used to instantiate (create) an
    // object from another class
    public City(String name, String lang, int pop) {
        //initialize all instance variables

        //use "this" to refer to the instance var if the param
        //has same name
        this.name = name;
        this.language = lang; //"this" not necessary bc param has a diff name
        population = pop;

        //even though there are only 3 params, a constructor
        //should still initialize all variables
        lockdown = false;

        //every time the constructor
        //is called, this value goes up
        numCities++;
    }

    //accessor methods aka get methods aka getters
    //format: public returnType getVariable() {}
    //-return type should match the var type
    //purpose is to allow outside read access to the private variables

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public int getPopulation() {
        return population;
    }

    public boolean getLockdown() {
        return lockdown;
    }

    //mutator methods aka setters aka set methods
    //allow outside write access in a controlled way for private vars
    //format: public void setVariable() - optional param
    //void return

    public void setLockdown() {
        lockdown = !lockdown;
    }

    //format with a parameter to update the var's value
    public void setPopulation(int newPop) {
        population = newPop;
    }

    //return a string value
    //that is a representation of an object
    //-this will be output when you print an object
    public String toString() {
        return "Name: " + name +
                "\nLanguage: " + language +
                "\nPopulation: " + population +
                "\nLockdown: " + lockdown;
    }
}
