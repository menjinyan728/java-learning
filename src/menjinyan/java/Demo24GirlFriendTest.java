package src.menjinyan.java;

public class Demo24GirlFriendTest {
    public static void main(String[] args) {
        Demo23GirlFriend gf1 = new Demo23GirlFriend();
        gf1.name = "小仙女";
        gf1.age = 18;
        gf1.gender = "萌妹子";
        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);
        gf1.eat();
        gf1.sleep();

        System.out.println("====");
        Demo23GirlFriend gf2 = new Demo23GirlFriend();
        gf2.name = "小女孩";
        gf2.age = 19;
        gf2.gender = "妹子";
        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);
        gf2.eat();
        gf2.sleep();
    }
}
