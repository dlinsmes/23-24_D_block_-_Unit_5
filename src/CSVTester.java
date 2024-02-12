import java.util.ArrayList;
public class CSVTester {
    public static void main(String [] args) {

        //copy/move csv file into top-level project folder (not in src)

        Panda p = new Panda("bill", 2, 400.0, 8.4);

        //call the static method from CSVImporter and save the result to data
        ArrayList<String []> data = CSVImporter.importData("Panda.csv");

        //iterate through each array (row) in data
        for (int i = 0; i < data.size(); i++) {

            //iterate through each element in each array (row)
            for (int j = 0; j < data.get(0).length; j++) {
                //print each cell
                System.out.print(data.get(i)[j] + " ");
            }
            System.out.println();
        }

        //0th row contains labels
        data.remove(0);

        String [] row0 = data.get(0);
        String name = row0[0];

        //need to convert String to int
        //int age = row0[1];

        //convert a String into an int
        int age = Integer.parseInt(row0[1]);
        double weight = Double.parseDouble(row0[2]);
        double wingspan = Double.parseDouble(row0[3]);

        Panda p1 = new Panda(name, age, weight, wingspan);
        System.out.println(p1.name);

        ArrayList<Panda> embearassment = new ArrayList<Panda>();
        //loop through data to make Panda objects
        for (String [] row: data) {
            String n = row[0];
            int a = Integer.parseInt(row[1]);
            double we = Double.parseDouble(row[2]);
            double ws = Double.parseDouble(row[3]);

            Panda temp = new Panda(n, a, we, ws);
            embearassment.add(temp);
        }

        System.out.println();
        System.out.println("look at all these pandas");
        //iterate through list of pandas
        for (Panda pa: embearassment) {
            System.out.println(pa.name);
        }
    }
}
