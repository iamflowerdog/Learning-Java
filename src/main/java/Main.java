import subfolder.Cat;
import subfolder.Dog;

public class Main {
    public static void main(String[] args) {
        // 创建 Dog 对象，使用命令行参数
        if (args.length < 3) {
            System.out.println("请传入 name age breed 三个参数");
            return;
        }

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        String breed = args[2];

        Dog myDog = new Dog(name, age, breed);
        myDog.displayInfo();


        // 创建 Cat 对象，使用命令行参数

        Cat myCat = new Cat("Tom", 3, "Gray");
        myCat.displayInfo();
        
        // 演示私有化字段的访问限制
        Dog testDog = new Dog("Max", 5, "Labrador");
        
        // 以下代码会导致编译错误，因为这些字段是私有的
        // testDog.name = "Buddy";  // 错误：name 是私有的
        // testDog.age = 6;         // 错误：age 是私有的
        // testDog.breed = "Husky"; // 错误：breed 是私有的
        
        // 正确的方式是使用公共方法访问
        testDog.setName("Buddy");   // 正确：通过公共方法修改名字
        System.out.println("Dog's new name: " + testDog.getName());
    }
}