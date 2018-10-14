package com.zengyikeji.arithmetic;

/**
 * @autor ProsperKing
 * @date 2018/10/14 - 10:08
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,9,2};

        int[] converseSort = converseSort(arr);

        for (int i : converseSort) {
            System.out.println(i);
        }

    }
//converse
    public static int[] converseSort(int[] arr){
        int amount = arr.length-1;
        for (int i = 0; i < amount; i++) { //比较轮数
            for (int j = 0; j < amount-i; j++) { //比较次数
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        return arr;
    }
//forward
    public static int[] forwardSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        return arr;
    }

}
