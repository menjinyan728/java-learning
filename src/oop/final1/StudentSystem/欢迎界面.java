package src.oop.final1.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class 欢迎界面 {
    private static final String ADD_STUDENT = "1";
    private static final String DELET_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";


    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        A:
        while (true) {
            System.out.println("-------欢迎来到menjinyan学生管理系统-------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出学生");
            System.out.println("请输入您的选择");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) { //在这里用户来了一个choose选择
                case ADD_STUDENT -> addStudent(list);//如果添加学生就执行这一段
                case DELET_STUDENT -> deletStudent(list);//如果删除学生就执行这一段
                case UPDATE_STUDENT -> updateStudent(list);//如果添加学生就执行这一段
                case QUERY_STUDENT -> queryStudent(list);//如果查询学生就执行这一段
                case EXIT -> {//如果是这段就执行下面的退出代码逻辑
                    System.out.println("退出学生");
                    break A;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        //利用空参构造创建学生对象
        Student s = new Student();

        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学生的id");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                //表示id已经存在，需要重新录入
                System.out.println("id已经存在，请重新录入");
            } else {
                //表示id不存在，表示可以使用
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的家庭住址");
        String address = sc.next();
        s.setAddress(address);

        //把学生对象添加到集合当中
        list.add(s);

        //提示一下用户
        System.out.println("学生信息添加成功");
    }

    //删除学生
    public static void deletStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的id");
        String id = sc.next();
        //查询ID在集合中的索引
        int index = getIndex(list, id);
        //对index进行判断

        //如果-1，就表示不存在，结束方法回到初始的菜单
        if (index >= 0) {
            //如果大于等于0的，就表示存在，直接删除
            list.remove(index);
            System.out.println("id为:" + id + "的学生删除成功");
        } else {
            System.out.println("id不存在，删除失败");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的id");
        String id = sc.next();

        //contain or getindex 两种方法哪个更好
        //contain：只能判断是不是存在
        //getindex：除了能判断是否存在还能把索引拿到获取学生对象，通过学生对象就可以继续修改了
        //所以选择getindex
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("要修改的id" + id + "不存在，请重新输入");
            return;
        }
        //当前代码执行到这里，表示当前id是存在的
        //获取要修改的学生对象
        Student stu = list.get(index);
        //输入其他的信息进行比较、
        System.out.println("请输入要修改的学生姓名");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的学生家庭住址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);
        System.out.println("学生信息修改成功");
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        //打印表头信息
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        //当代码执行到这里，表示集合当中是有数据的
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    //判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        //循环遍历集合得到里面的每一个学生对象
        /*for (int i = 0; i < list.size(); i++) {
            //拿到学生对象后，获取id进行判断
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                //如果存在返回true
                return true;
            }
        }
        //如果不存在返回false
        return false;*/
        return getIndex(list, id) >= 0;
    }

    //通过id获取索引的方法
    public static int getIndex(ArrayList<Student> list, String id) {
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //得到每一个学生对象
            Student stu = list.get(i);
            String sid = stu.getId();
            //拿着集合中的id和要删除的id进行比较
            if (sid.equals(id)) {
                //如果一样，那么就返回索引
                return i;
            }
        }
        //当前循环结束之后没有找到，就表示不存在，返回-1
        return -1;
    }
}

///ccc