package src.menjinyan.test;

public class Test06Switch的特性 {
    public static void main(String[] args) {
        //switch的新特性（JDK12往上）
        int number=3;
        switch(number){
            case 1 ->System.out.println("一");
            case 2 ->System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这个数");
        }
    }
}
