
public class HouseSizeTest {
    public static void main(String[] args) {
        // 创建一个 Size 对象
        Size house = new Size();
        
        // 设置大小为 MEDIUM
        house.size = Size.HouseSizeEnum.MEDIUM;
        
        // 输出大小
        System.out.println("House size: " + house.size);
    }
}

class Size {
    enum HouseSizeEnum {
        SMALL, MEDIUM, LARGE
    }
    HouseSizeEnum size;
}