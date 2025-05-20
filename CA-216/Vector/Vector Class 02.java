import java.util.Vector;
public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector of Strings
        Vector<String> list = new Vector<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // Iterating through the Vector
        for (String element : list) {
            System.out.println(element);
        }

        list.insertElementAt("Orange", 1);

        // Removing an element.
        list.remove("Cherry");
        System.out.println(list);
    }
}