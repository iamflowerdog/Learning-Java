package subfolder;

public class Person {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) { // 加校验
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {
        Person yang = new Person();

        // 现在必须通过 setter 来改值
        yang.setName("Li");
        yang.name = "Yang"; // 错误：name 是私有的

        System.out.println("Name: " + yang.getName());
    }
}