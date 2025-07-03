package subfolder;

import Dog;

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
        
    }
}