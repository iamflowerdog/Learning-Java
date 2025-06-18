
public class FruitSize {
    enum Size {
        SMALL, MEDIUM, LARGE
    }
    Size size;
}


public class FruitSizeTest {
    public static void main(String[] args) {
        // 创建一个 FruitSize 对象
        FruitSize fruit = new FruitSize();
        
        // 设置大小为 MEDIUM
        fruit.size = FruitSize.Size.MEDIUM;
        
        // 输出大小
        System.out.println("Fruit size: " + fruit.size);
    }
}