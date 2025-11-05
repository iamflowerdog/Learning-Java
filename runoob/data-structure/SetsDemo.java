import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


// set 用于存储不重复的元素集合

class SetsDemo {

    public static void main(String[] args) {
        Set <Integer> hasSet = new HashSet<>();

        hasSet.add(10);
        hasSet.add(20);
        hasSet.add(null);
        hasSet.add(30);


        System.out.println("Set contents: " + hasSet);


        Set <String> strSet = new HashSet<>();
        strSet.add("Apple");
        strSet.add("Banana");
        strSet.add("Apple"); // Duplicate, will not be added


         System.out.println("String Set contents: " + strSet);


        Set <Integer> anotherSet = new TreeSet<>();
        anotherSet.add(20);
        anotherSet.add(10);
        anotherSet.add(30);

        System.out.println("TreeSet contents (sorted): " + anotherSet);

        

       

    }
}