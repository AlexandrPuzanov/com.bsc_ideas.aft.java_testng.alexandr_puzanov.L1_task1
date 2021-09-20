
package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {


        int sum = 0;
        int min = 0;
        int max = 0;
        int min1 = 0;
        int max1 = 0;
        double summ2 = 0;
        double summ3 = 0;
        double sred = 0;


        //В массиве целых чисел заменить нулями отрицательные элементы
        System.out.println("замена нулями отрицательных элементов");
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);

        }
        System.out.println(Arrays.toString(array) + "исходный массив");

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array) + "массив, где отрицательные элементы заменены нулями");


        //В массиве целых чисел заменить все нечётные числа на 0
        System.out.println("замена нулями нечетных чисел");
        int array1[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            array1[i] = (int) (Math.random() * 20 - 10);

        }
        System.out.println(Arrays.toString(array1) + "исходный массив");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == -1 | array1[i] % 2 == 1) {
                array1[i] = 0;
            }

        }
        System.out.println(Arrays.toString(array1) + "массив, где нечетные числа заменены нулями");
        //В массиве целых чисел определить сумму элементов, состоящих на чётных позициях

        System.out.println("В массиве целых чисел определить сумму элементов, состоящих на чётных позициях");
        int array2[] = new int[20];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 20 - 10);

        }
        System.out.println(Arrays.toString(array2) + "исходный массив");
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {

                sum = sum += array2[i];
            }
        }
        System.out.println("сумма элементов на нечетных позициях " + sum);


        // В массиве целых чисел поменять местами максимальный отрицательный элемент и минимальный положительный
        System.out.println("В массиве целых чисел поменять местами максимальный отрицательный элемент и минимальный положительный");
        int array3[] = new int[20];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) (Math.random() * 20 - 10);

        }
        System.out.println(Arrays.toString(array3) + "исходный массив");
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 0) {
                max = array3[i];
                break;

            }
        }

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 0 && array3[i] > max) {
                max = array3[i];

            }
        }

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == max) {
                max1 = i;

            }
        }


        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > 0) {
                min = array3[i];
                break;
            }
        }


        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > 0 && array3[i] < min)
                min = array3[i];

        }
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == min)
                min1 = i;

        }

        int sort = array3[max1];
        array3[max1] = array3[min1];
        array3[min1] = sort;

        System.out.println(Arrays.toString(array3) + " Массив в котором поменяны местами максимальный отрицательный и минимальный положительный элемент");


        //В массиве целых чисел найти разницу между средним арифметическим и значение минимального элемента
        System.out.println("В массиве целых чисел найти разницу между средним арифметическим и значение минимального элемента");
        int array4[] = new int[20];
        int min2 = array4[0];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = (int) (Math.random() * 20 - 10);

        }

        System.out.println(Arrays.toString(array4) + "исходный массив");
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] < min2) min2 = array4[i];
            summ2 = summ2 + array4[i];
            summ3 = summ2 / array4.length;
            sred = summ3 - min2;

        }
        System.out.println("разника между средним арефмитическим и значением минимального элемента " + sred);

        //В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.

        System.out.println("В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным");
        int array5[] = new int[20];

        for (int i = 0; i < array5.length; i++) {
            array5[i] = (int) (Math.random() * 20 - 10);

        }

        System.out.println(Arrays.toString(array5) + "исходный массив");


        for (int i = 0; i < array5.length - 1; i++) {
            if (array5[i] > 0 && array5[i + 1] < 0)
                array5[i] = array5[i] * 3;

        }

        System.out.println(Arrays.toString(array5) + "массив в котором утроен каждый положительный элемент, который стоит перед отрицательным");

        //В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные.
        int array6[] = new int[20];
        for (int i = 0; i < array6.length; i++) {
            array6[i] = (int) (Math.random() * 20 - 10);

        }

        System.out.println(Arrays.toString(array6) + "исходный массив");
        int povtor = 0;
        for (int i = 0; i < array6.length; i++) {
            for (int j = i + 1; j < array6.length; j++) {
                if (array6[i] < 0) {
                    povtor++;
                }

            }


        }
       /* System.out.println(povtor + "fdsfgdhdfg");
        int[] newpovtor = new int[povtor];
        int povtor1 = 0;
        for (int i = 0; i < array6.length; i++) {
            for (int j = i + 1; j < array6.length; j++) {
                if ((array6[i] == array6[j])) {
                    newpovtor[povtor1] = array6[i];
                    povtor1++;
                }
            }
        }
        System.out.println(Arrays.toString(newpovtor));*/


    }

}

