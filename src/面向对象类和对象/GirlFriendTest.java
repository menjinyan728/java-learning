package src.面向对象类和对象;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友这个对象
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "小诗诗";
        gf1.age = 18;
        gf1.gender = "萌妹子";
        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);
        gf1.eat();
        gf1.sleep();
        System.out.println("++++++++++");
        GirlFriend gf2 = new GirlFriend();
        gf2.name = "大聪明";
        gf2.age = 19;
        gf2.gender = "大漂亮";
        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);
        gf2.eat();
        gf2.sleep();
    }
}
