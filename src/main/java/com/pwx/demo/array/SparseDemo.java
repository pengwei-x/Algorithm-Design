package com.pwx.demo.array;

/**
 * 稀疏数组 --二维数组
 *
 * 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0
 * 0 0 1 0 0 0 0 0
 * 0 0 0 2 0 0 0 0
 * 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0
 *
 * @author pengwei
 * @date 2021/6/13
 */
public class SparseDemo {

    public static void main(String[] args) {
        /**
         * 棋盘
         * 1代表黑棋 2代表白棋
         */
        int[][] array = new int[8][8];
        array[3][2]=1;
        array[4][3]=2;
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }

        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j]!=0){
                    ++sum;
                }
            }
        }
        //转稀疏数组
        int[][] sparse = new int[sum + 1][3];
        sparse[0][0]=8;
        sparse[0][1]=8;
        sparse[0][2]=sum;

        int row=1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j]!=0){
                    sparse[row][0]=i;
                    sparse[row][1]=j;
                    sparse[row][2]=array[i][j];
                    row++;

                }
            }
        }

        System.out.println("稀疏数组：");
        for (int[] ints : sparse) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }



    }

}
