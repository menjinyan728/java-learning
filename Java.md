# Java的基本知识
### 关键字
````
概述：
被Java语言赋予特定含义的单词。
关键字的特点：
组成关键字的字母全部小写。
````
### 常见的二进制

````
二进制：由0~1组成 以0或者b开头。
十进制：由0~9组成 前面不加任何前缀。
八进制：有0~7组成 代码中以0开头。
十六进制：由0~9开头还有a~f组成（a=10 b=11 e=12 d=13 e=14）代码中以0x开头
````

````



二、class用于（创建\定义）一个类（类是Java最基本的组成单元）。



四、循环和高级循环
1、continue:跳过本次循环，继续执行下次循环
2、break:结束整个循环
````
### 整数类型
````
含义：整数类型简称整形，用来存储整数数值，即没有小数部分的数值，可以是正数也可以是负数
整数和小数取值范围的大小关系：
double>float>long>int>short>byte

````
### 浮点类型
````
float:在定义数值的时候加一个F为后缀
分为单精度浮点型（flaot）和双精度浮点型(double)
````
### 逻辑运算符
````
1、& 并且
        //运算逻辑：两边都为真，结果才是真
        
2 | 或者
        //运算逻辑：两边都为假，结果才是假，只要有一个为真结果就是真
        
3、^异或
        //运算逻辑：相同为false 不相同为true   
        
4、！逻辑非   取反             
````
### 数组
````
什么是数组：数组指的是一种容器，可以用来存储同种数据类型的多个值
数组容器在存储数据的时候，需要结合隐式转换考虑

例如：int类型的数组容器（boolen byte short int double）byte short int（这些可以）

例如： double类型的数组容器(byte short int long float double)全部可以

建议：容器的类型，和存储数据的类型保持一致

数组的初始化：就是在内存中，为数组容器开辟空间，并将数据存入容器中的过程。

初始化分为两种方式：
静态初始化    动态初始化

静态：就是在内存中，为数组开辟空间，并将数据存入容器的过程
格式：数据类型[]数组名 =new 数据类型[] {元素1，元素2，元素3...};
范例：int[] array =new int[]{11,22,33};(整数)
范例：double[] array2 =new double[]{11.1,22.2,33.3};(小数)

**数组的动态初始化**
含义：初始化时只指定数组的长度，由系统为数组分配初始值
格式：数据类型[]数组名=new 数据类型[数组长度];
范例：int[]arr=new int[3];

数组的地址值：表示数组在内存中的位置

**数组的访问：**
什么是索引
索引也叫做下标和角标
特点：从0开始，逐个+1增长，连续不间断

**数组的遍历**
数组遍历：将数组中所有的内容取出来，取出来之后可以（打印，求和，判断）
注意：遍历指的是取出数据的过程，不要局限的理解为遍历就是打印

