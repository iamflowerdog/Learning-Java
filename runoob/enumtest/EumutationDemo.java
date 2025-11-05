
import java.util.Enumeration;
import java.util.Vector;

public class EumutationDemo {

    public static void main(String[] args) {
        // 创建一个 Vector 对象

        Vector<String> vector = new Vector<>();

        vector.add("Orange");
        vector.add("Grapes");
        vector.add("Apple");
        vector.add("Banana");

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            String fruit = enumeration.nextElement();
            System.out.println("Fruit: " + fruit);
        }   


        Vector intVector = new Vector(3, 2);


        intVector.add(1);
        intVector.add(2);
        intVector.add(3);

        System.out.println("Initial capacity: " + intVector.capacity()); // 3

        intVector.add(4); // 超出初始容量，触发扩容
        System.out.println("New capacity: " + intVector.capacity()); // 5


        
    
    }
    
}
