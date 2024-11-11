package src.StringJoiner;

import java.util.StringJoiner;

public class Demo02 {
    public static void main(String[] args) {
        //1、创建对象
        StringJoiner sj = new StringJoiner(",", "=", ".");
        //2、添加元素
        sj.add("aaa").add("bbb").add("ccc");
        int len = sj.length();
        System.out.println(len);
        //3、打印
        System.out.println(sj);
        String str = sj.toString();
        System.out.println(str);
    }
}
