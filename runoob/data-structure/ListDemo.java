import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListDemo {
    


    public static void main(String[] args) {


        List<Object> list = new ArrayList<>();

        list.add(10);
        list.add(20);

        list.add("30"); 
        list.add(40.5);
        list.add(true);

        for (Object item : list) {
            System.out.println("Item: " + item);
        }

        List<Object> linkList = new LinkedList<>();
        linkList.add("Apple");
        linkList.add(234);
        linkList.add(56.78);
        linkList.add(false);    

        // int[] numbers = {1, 2, 3, 4, 5};


        // System.out.println("\n LinkedList contents:" + linkList);


        linkList.forEach(item -> {
            System.out.println("LinkedList Item: " + item);
        });

        list.forEach(item -> {
            System.out.println("ArrayList Item: " + item);
        });




        System.out.println("\n This is a placeholder for the List class." + list);
    }
}
