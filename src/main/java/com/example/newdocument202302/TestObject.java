package com.example.newdocument202302;


import org.junit.Test;

import java.util.Arrays;

public class TestObject {

    @Test
    public void one() {
        byte a = 10;
        int b = 20;
//        a = a + b;
        System.out.println(a);

        a += 20;
        System.out.println(a);
    }

    @Test
    public void two() {
        int a = 10;
        a = ++a;
        System.out.println(a);

        int b = 10;
        b = b++;
        System.out.println(b);
    }

    @Test
    public void three() {
        int a = 10;
        int c = a % 3;
        System.out.println(c);
        System.out.println(a %= 3);

        System.out.println("----------------------------------------------");


        int[] numbers = {20, 10, 3, 2, 1, 6, 7};
        //二分法查找  ：对按照顺序结构进行存储的数据进行查找
        Arrays.sort(numbers);//小到大排序
        //遍历排序好的数组内容  string类型
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + "");
        }
        int findNumber = 10;
        int index2 = -1;
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (findNumber == numbers[mid]) {
                index2 = mid;
                System.out.println("查找到元素" + numbers[mid]);
                System.err.println("元素索引值位置是" + index2);
                break;
            } else if (findNumber < numbers[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (index2 == -1) {
            System.err.println("该元素不存在");
        }

    }

    /**
     * 快排
     * 快排的大致思想
     * 快速排序实现的重点在于数组的拆分，通常我们将数组的第一个元素定义为比较元素，然后将数组中小于比较元素的数放到左边，将大于比较元素的放到右边，
     * 这样我们就将数组拆分成了左右两部分：小于比较元素的数组；大于比较元素的数组。我们再对这两个数组进行同样的拆分，直到拆分到不能再拆分，数组就自然而然地以升序排列了。
     */
    @Test
    public void four() {
        //6 1 2 7 9 3 4 5 10 8
        int[] arr = {6, 1, 2, 7, 9, 11, 4, 5, 10, 8};
        // int[] arr = {2,2,2,2,2,2,2,2};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        int i, j, temp, t;
        //简单的数组判断
        if (low > high) {//0,8
            return;//终止程序
        }
        i = low;//左边哨兵的索引 0
        j = high;//右边哨兵的索引  8
        //temp就是基准位
        temp = arr[low];//以最左边为  基准位 0
        while (i < j) { //0 <8
            //先看右边，依次往左递减
            //先从右往左找一个小于 基准位的数
            //当右边的哨兵位置所在的数>基准位的数 时
            //继续从右往左找（同时 j 索引-1）
            //找到后会跳出 while循环
            while (temp <= arr[j] && i < j) {//循环high次数,必须是j先出发判断
                j--;
            }
            //再看左边，依次往右递增
            //步骤和上面类似
            while (temp >= arr[i] && i < j) {//循环high次数
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                //z、y 都是临时参数，用于存放 左右哨兵 所在位置的数据
                int z = arr[i];
                int y = arr[j];
                // 左右哨兵 交换数据（互相持有对方的数据）
                arr[i] = y;
                arr[j] = z;
            }
        }
        //这时 跳出了 “while (i<j) {}” 循环
        //说明 i=j 左右在同一位置
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];//或 arr[low] = arr[j];
        arr[i] = temp;//或 arr[j] = temp;
        //i=j
        //这时  左半数组<(i或j所在索引的数)<右半数组
        //也就是说(i或j所在索引的数)已经确定排序位置， 所以就不用再排序了，
        // 只要用相同的方法 分别处理  左右数组就可以了
        //递归调用左半数组
        quickSort(arr, low, j - 1);
        //递归调用右半数组
        quickSort(arr, j + 1, high);
    }


    /**
     * 冒泡排序
     *
     * @param
     */
    @Test
    public void five() {
        int[] arr = {2, 5, 1, 3, 8, 5, 7, 4, 3};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {//移动到最大索引值的时候不需要在进行比较，所以内部循环少一次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
