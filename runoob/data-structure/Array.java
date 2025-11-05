public class Array {
    

    // 数组（Arrays）是一种基本的数据结构，可以存储固定大小的相同类型的元素。


    public static void main(String[] args) {

        int[] array = new int[5];
        // array[0] = 10;
        // array[1] = 20;
        // array[2] = 30;
        // array[3] = 40;
        // array[4] = 50;

        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 10;
        }

        int[] clonedArray = array.clone();

        boolean[] booleanList;

        booleanList = new boolean[3];

        char[] charlist;

        charlist = new char[4];


        int [] intlist = {1, 2, 3, 4, 5};

        Object[] objArray = new Object[3];
        objArray[0] = "Hello";
        objArray[1] = 123;
        objArray[2] = 45.67;

        System.out.println("Object array length: " + objArray.length);


        System.out.println("Int array length: " + intlist.length);

        System.out.println("Char array length: " + charlist.length);


        System.out.println("Boolean array length: " + booleanList.length);

        

        System.out.println("Cloned array class: " + clonedArray.getClass());
        System.out.println("Original array class: " + array.getClass());

        System.out.println("Cloned array length: " + clonedArray.length);
        System.out.println("Array length: " + array.length);
    }


}
