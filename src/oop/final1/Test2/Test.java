package src.oop.final1.Test2;

public class Test {
    public static void main(String[] args) {
        /*
        final修饰的基本数据类型:记录的数据值不能发生改变
        final修饰的引用数据类新:记录的地址值不能发生改变，内部的属性值还是可以改变的

        核心:常量记录的数据是不可以发生改变的

        字符串是不可变的
         */
        final double PI = 3.14;

        //创建对象
        final Student S = new Student(23, "zhangsan");
        S.setName("李四");
        S.setAge(24);
        System.out.println(S.getName() + "," + S.getAge());

        //数组
        final int[] ARR = {1, 2, 3, 4};
        ARR[0] = 10;
        ARR[1] = 20;
        //遍历数组
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }
    }
}
