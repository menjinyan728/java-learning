package src.menjinyan.Test;

public class Test16二维数组的练习 {
    public static void main(String[] args) {
        /*某商城每个季度的营业额如下：单位（万元）
        第一季度：22,66,44
        第二季度：77,33,88
        第三季度：25,45,65
        第四季度：11,66,99

        要求：计算出每个季度的总营业额和全年的总营业额
         */
        int[][] yearArrArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int yearSum = 0; //全年的总营业额
        //2、遍历二维数组，得到每一个一维数组并求和
        for (int i = 0; i < yearArrArr.length; i++) {
            //i表示二维数组中的每一个索引
            //yearArrArr[i]表示二维数组里面的每一个元素（也就是一维数组）
            int[] quarterArr = yearArrArr[i];
            int sum = getSum(quarterArr);
            System.out.println("第" + (i + 1) + "个季度的宗营业额为:" + sum);
            yearSum += sum;
        }
        System.out.println("全年的总营业额为:" + yearSum);
    }

    //定义一个方法记录每个季度的营业额
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
