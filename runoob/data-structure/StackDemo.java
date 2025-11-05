
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {


        

        // Last In First Out (LIFO) 栈结构
        Stack<Object> stack = new Stack<>();

        stack.push(10);
        stack.push("20"); // 自动装箱
        stack.push(true);

        System.out.println("Stack contents: " + stack);

        while (!stack.isEmpty()) {
            Object yang = stack.pop();
            System.out.println("Popped item: " + yang);
        }

        // First In First Out (FIFO) 

        Queue<Object> queue = new LinkedList<>();
        queue.add(10);
        queue.add("20");
        queue.add(true);

        while (!queue.isEmpty()) {
            Object item = queue.poll();
            System.out.println("Polled item: " + item);
        }


        // Heap 优先队列的基础,可以实现最大堆/最小堆结构
        // 使用统一的类型,避免类型比较异常
        
        PriorityQueue<Integer> priority = new PriorityQueue<>();
        priority.add(30);
        priority.add(10);
        priority.add(20);

        while (!priority.isEmpty()) {
            Integer item = priority.poll();
            System.out.println("Priority polled item: " + item);
        }


    }   
}



