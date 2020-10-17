import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

//  1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0

        System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: \n" +
                "[ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0\n");
        int[] arr01 = {
                1, 1, 0, 0, 1, 0, 1, 1, 0, 0
        };
        System.out.println("Начальный массив:" + Arrays.toString(arr01));
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i] == 0) {
                arr01[i] = 1;
            } else {
                arr01[i] = 0;
            }
        }
        System.out.println("Конечный  массив:" + Arrays.toString(arr01) + "\n");
//  2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21

        System.out.println("2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21 \n");
        int[] arrx3 = new int[8];
        arrx3[0] = 0;
        for (int i = 1; i < arrx3.length; i++) {
            arrx3[i] = arrx3[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arrx3) + "\n");

//  3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2

        System.out.println("3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2 \n");
        int[] arrx2 = {
                1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1
        };
        for (int i = 0; i < arrx2.length; i++) {
            if (arrx2[i] < 6) {
                arrx2[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrx2) + "\n");

//  4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами

        System.out.println("4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов \n" +
                "одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами \n");
        int x = 6;
        int[][] arr1 = new int[x][x];
        for (int i = 0; i < arr1.length; i++) {

            arr1[i][i] = 1;
            arr1[i][arr1.length - 1 - i] = 1;
            System.out.println(Arrays.toString(arr1[i]));
        }

//  5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)
        System.out.println("\n" + "5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета) \n");
        int[] minMax = {
                1, -12, 11, 5, 6, 7, -5, 3, 17, -9
        };
        System.out.println(Arrays.toString(minMax) + "\n");
        int max = minMax[0];
        int min = minMax[0];
        for (int i = 1; i < minMax.length; i++) {
            if (minMax[i] > max) {
                max = minMax[i];
            }
            if (minMax[i] < min) {
                min = minMax[i];
            }
        }
        System.out.println("Минимальный элемент массива = " + min);
        System.out.println("Максимальный элемент массива = " + max + "\n");

//  6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в
//  массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
//  checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят

        System.out.println("** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, \n" +
                "если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: \n" +
                "checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница \n" +
                "показана символами ||, эти символы в массив не входят \n");
        int[] arr = {
                1, -3, -2, -1, 3, 2
        };
        System.out.println(Arrays.toString(arr));
        System.out.println(checkBalance(arr) + "\n");

//  7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
//  при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя
//  пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
//  при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами

        System.out.println("**** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или\n" +
                "отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения\n" +
                "задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];\n" +
                "[ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами \n");
        int[] ar = {
                0, 1, 2, 3, 4, 5, 6
        };
        System.out.println(Arrays.toString(ar));
        shift(ar, -5);
        System.out.println(Arrays.toString(ar));
    }

    public static boolean checkBalance(int arr[]) {
        boolean balance = false;
        int sumTot = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTot += arr[i];
        }
        if (sumTot == 0) {
            System.out.println("Сумма элементов массива = 0. Баланс перед первым и после последнего элемента");
            balance = true;
        }
        for (int i = 1; i < arr.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft = sumLeft + arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                sumRight = sumRight + arr[j];
            }
            if (sumLeft == sumRight) {
                balance = true;
                System.out.println("Баланс между " + (i - 1) + " и " + i + " элементами массива");
            }
        }
        return balance;

    }

    public static int[] shift(int ar[], int n) {
        if (n == 0) {
            System.out.println("Элементы массива не двигались:");
        } else if (n < 0) {
            System.out.println("Двигаем элементы массива на " + Math.abs(n) + " шаг(-а,-ов) влево:");
            for (int x = 1; x <= Math.abs(n) % ar.length; x++) {
                int y = ar[ar.length - 1];
                ar[ar.length - 1] = ar[0];
                for (int i = 1; i < (ar.length - 1); i++) {
                    ar[i - 1] = ar[i];
                }
                ar[ar.length - 2] = y;
            }
        } else if (n > 0) {
            System.out.println("Двигаем элементы массива на " + n + " шаг(-а,-ов) вправо:");
            for (int x = 1; x <= Math.abs(n) % ar.length; x++) {
                int y = ar[0];
                ar[0] = ar[ar.length - 1];
                for (int i = ar.length - 1; i > 1; i--) {
                    ar[i] = ar[i - 1];
                }
                ar[1] = y;
            }
        }
        return ar;
    }
}

