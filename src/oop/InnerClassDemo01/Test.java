package src.oop.InnerClassDemo01;

public class Test {
    public static void main(String[] args) {
         /*
    求:写一个Javabean类描述汽车。
属性:汽车的品牌，车龄，颜色，发动机的品牌，使用年限。
内部类的访问特点:
内部类可以直接访问外部类的成员，包括私有
外部类要访问内部类的成员，必须创建对象
     */

        Car c = new Car();
        c.CarName = "宾利";
        c.CarAge = 1;
        c.CarColor = "粉色";

        //用c调用show方法
        c.show();
    }

}
