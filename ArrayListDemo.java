import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // System.out.println(cars);

        System.out.println(cars.get(0));

        // change an item
        cars.set(0, "Opel");
        System.out.println(cars.get(0));

        // remove an item
        cars.remove(0);
        System.out.println(cars.get(0));

        // Adding the items
        cars.add("Rolls Royce");
        cars.add("Lamborghini");

        // ArrayList size
        System.out.println(cars.size());

        // Loop Through an ArrayList
        for (String car : cars) {
            System.out.println(car);
        }

        // Clear the items
        cars.clear();

        // Integer for objects
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        
        myNumbers.add(10);
        myNumbers.add(32);
        myNumbers.add(28);
        myNumbers.add(92);

        // sort the list
        Collections.sort(myNumbers);

        for (Integer i : myNumbers) {
            System.out.println(i);
        }

    }
}