

class MathUtils {

    // 方法重载（Method Overloading）同一个类中可以有多个同名的方法，但参数不同
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public float add(int a, float b) {
        return a + b;
    }

}

public class AddNumber {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        // 使用整数相加
        int intResult = mathUtils.add(5, 10);
        System.out.println("整数相加结果: " + intResult);

        // 使用浮点数相加
        double doubleResult = mathUtils.add(5.5, 10.2);
        System.out.println("浮点数相加结果: " + doubleResult);

        // 使用浮点数相加
        float floatResult = mathUtils.add(5.5f, 10.2f);
        System.out.println("浮点数相加结果: " + floatResult);

        // 使用整数和浮点数相加
        float mixedResult = mathUtils.add(5, 10.2f);
        System.out.println("整数和浮点数相加结果: " + mixedResult);
    }
}
// 注意：请确保 MathUtils 类在同一包或导入路径中