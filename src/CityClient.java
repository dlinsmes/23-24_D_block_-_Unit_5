//client/tester classes create objects from
//other classes

public class CityClient {

    public static void main(String [] args) {

        City c1 = new City("uhhhhhh", "brazillian", 5);
//        City c1 = new City();

        //if you don't define a constructor, a default no-param
        //constructor is available to use
        //-all instance variables will have default values of 0/null/false

        //name is a private variable so you can't directly access it
        //-need to use the public get method
//        System.out.println(c1.name);

        System.out.println(c1.getName());
        System.out.println(c1.getLanguage());
        System.out.println(c1.getPopulation());
        System.out.println(c1.getLockdown());

        System.out.println();

        City c2 = new City("los angeles", "brazillian", 1);
        System.out.println(c2.getName());

        System.out.println(c2.getLockdown());

        //lockdown is private so use the set method to
        //update its value
        //c2.lockdown = true;
        c2.setLockdown();

        System.out.println(c2.getLockdown());

        System.out.println();

        //if you print an object directly, you get the
        //memory location (not useful)
        //UNLESS you define a toString() method in the class

        System.out.println(c1);
        //toString() gets called automatically if its defined
        //-you don't need to explicitly call the method
        System.out.println(c1.toString());


        System.out.println();

        //arrays of objects
        City [] cities = new City [3];

        cities[0] = c1;
        cities[1] = c2;
        cities[2] = new City("new york city", "new yorkian", 2);

        //for loop to iterate through the array
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i].getName());
        }

        //for each loop that iterates through array
        for (City c: cities) {
            //set pop of each city to 100
            c.setPopulation(100);
            System.out.println(c.getPopulation());
        }

        //print the cities in the array that have brazillian as their language
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].getLanguage().equals("brazillian")) {
                System.out.println(cities[i]);
                System.out.println();
            }
        }

        System.out.println();

        //same but with separated steps
        for (int i = 0; i < cities.length; i++) {
            City temp = cities[i];
            String lang = temp.getLanguage();
            if (lang.equals("brazillian")) {
                System.out.println(temp);
                System.out.println();
            }
        }



    }
}
