public class PandaClient {
    public static void main(String [] args) {

        //declare a Panda object
        // (one specific example of the template)
        Panda p1 = new Panda();

        //access the name variable of the p1 panda object
        System.out.println(p1.name);
        //null bc no value has been set

        //update value of p1's name
        p1.name = "george";
        System.out.println(p1.name);

        //since age is a private variable, it can't
        //be directly changed
        //p1.age = 164;

        //to change age, need to call the public setAge() method
        p1.setAge(164);
        System.out.println(p1.name + " is " + p1.getAge() + " years old");

        //declare and instantiate another panda object
        //instantiate - make an object (specific example of the class)
        Panda p2 = new Panda();
        System.out.println(p2.name + " (before changing)");
        //each object gets its own separate copy of instance variables
        p2.name = "mark";
        p2.setAge(-3);

        //age is a private variable so it can't be accessed directly
//        System.out.println(p2.name + " is " + p2.age + " years old");

        //access age through the public getAge() method
        System.out.println(p2.name + " is " + p2.getAge() + " years old");

        //defaults to 0.0 if no constructor is defined
        //if no constructors are defined, values default to
        // 0/0.0/null/false
        System.out.println(p2.wingspan);

        //call overloaded constructor that accepts values
        Panda p3 = new Panda("po", 44, 250.2, 18);
        System.out.println(p3.name + " is " + p3.getAge() + " years old");

        p3.setAge(2);
        System.out.println(p3.name + " is " + p3.getAge() + " years old");

        p3.setAge(-100);

        p3.setAge(100);
        System.out.println(p3.name + " is " + p3.getAge() + " years old");

    }
}
