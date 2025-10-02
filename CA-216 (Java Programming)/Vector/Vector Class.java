import java.util.*;

class VectorExample {
    public static void main(String[] args) {
        Vector<String> list = new Vector<String>();

        list.addElement("Chandan Chaudhary");
        list.addElement("Suraj Verma");
        list.addElement("Deepanshu Yadav");

        System.out.println("Vector Elements: " + list);

        list.insertElementAt("Deepak Singh", 1);

        System.out.println("Vector Elements: " + list);
    }
}