package lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class Program {

    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        int[] arr1 = new int[10000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[10000];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand2.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand1.nextInt();
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = rand3.nextInt();
        }
        Arrays.sort(arr3);
        for (int i = 0; i < arr3.length * 0.1; i++) {
            arr3[i] = rand3.nextInt();
        }
        Arrays.sort(arr1);
        System.out.println("Первый массив: " + Arrays.toString(arr1));
        System.out.println("Второй массив: " + Arrays.toString(arr2));
        System.out.println("Третий массив: " + Arrays.toString(arr3));

        int[] arr1_1 = arr1.clone();
        int[] arr1_2 = arr1.clone();
        int[] arr1_3 = arr1.clone();
        int[] arr1_4 = arr1.clone();
        int[] arr1_5 = arr1.clone();

        int[] arr2_1 = arr2.clone();
        int[] arr2_2 = arr2.clone();
        int[] arr2_3 = arr2.clone();
        int[] arr2_4 = arr2.clone();
        int[] arr2_5 = arr2.clone();

        int[] arr3_1 = arr3.clone();
        int[] arr3_2 = arr3.clone();
        int[] arr3_3 = arr3.clone();
        int[] arr3_4 = arr3.clone();
        int[] arr3_5 = arr3.clone();


        // Измерение времени
        //1 array
        System.out.println("1 array: ");
        long startTime = System.nanoTime();
        bubblesort(arr1_1);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("1 array time bubblesort: " + estimatedTime);
        long startTime1 = System.nanoTime();
        insertsort(arr1_2);
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("1 array time insertsort: " + estimatedTime1);
        long startTime2 = System.nanoTime();
        selectivesort(arr1_3);
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("1 array time selectivesort: " + estimatedTime2);
        long startTime3 = System.nanoTime();
        mergeSort(arr1_4, 0, arr1_4.length - 1);
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println("1 array time mergesort: " + estimatedTime3);
        long startTime4 = System.nanoTime();
        quickSort(arr1_5);
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println("1 array time quicksort: " + estimatedTime4);
        long startTime17 = System.nanoTime();
        Arrays.sort(arr1);
        long estimatedTime17 = System.nanoTime() - startTime17;
        System.out.println("1 array time sort: " + estimatedTime17);
        //2 array
        System.out.println("2 array: ");
        long startTime5 = System.nanoTime();
        bubblesort(arr2_1);
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println("2 array time bubblesort: " + estimatedTime5);
        long startTime6 = System.nanoTime();
        insertsort(arr2_2);
        long estimatedTime6 = System.nanoTime() - startTime6;
        System.out.println("2 array time insertsort: " + estimatedTime6);
        long startTime7 = System.nanoTime();
        selectivesort(arr2_3);
        long estimatedTime7 = System.nanoTime() - startTime7;
        System.out.println("2 array time selectivesort: " + estimatedTime7);
        long startTime8 = System.nanoTime();
        mergeSort(arr2_4, 0, arr1_4.length - 1);
        long estimatedTime8 = System.nanoTime() - startTime8;
        System.out.println("2 array time mergesort: " + estimatedTime8);
        long startTime9 = System.nanoTime();
        quickSort(arr2_5);
        long estimatedTime9 = System.nanoTime() - startTime9;
        System.out.println("2 array time quicksort: " + estimatedTime9);
        long startTime16 = System.nanoTime();
        Arrays.sort(arr2);
        long estimatedTime16 = System.nanoTime() - startTime16;
        System.out.println("2 array time sort: " + estimatedTime16);
        //3 array
        System.out.println("3 array: ");
        long startTime10 = System.nanoTime();
        bubblesort(arr3_1);
        long estimatedTime10 = System.nanoTime() - startTime10;
        System.out.println("3 array time bubblesort: " + estimatedTime10);
        long startTime11 = System.nanoTime();
        insertsort(arr3_2);
        long estimatedTime11 = System.nanoTime() - startTime11;
        System.out.println("3 array time insertsort: " + estimatedTime11);
        long startTime12 = System.nanoTime();
        selectivesort(arr3_3);
        long estimatedTime12 = System.nanoTime() - startTime12;
        System.out.println("3 array time selectivesort: " + estimatedTime12);
        long startTime13 = System.nanoTime();
        mergeSort(arr3_4, 0, arr3_4.length - 1);
        long estimatedTime13 = System.nanoTime() - startTime13;
        System.out.println("3 array time mergesort: " + estimatedTime13);
        long startTime14 = System.nanoTime();
        quickSort(arr3_5);
        long estimatedTime14 = System.nanoTime() - startTime14;
        System.out.println("3 array time quicksort: " + estimatedTime14);
        long startTime15 = System.nanoTime();
        Arrays.sort(arr3);
        long estimatedTime15 = System.nanoTime() - startTime15;
        System.out.println("3 array time sort: " + estimatedTime15);

        //Проверка
        System.out.println("Массив для проверки: ");
        int[] array = {1, 2, 2, 3, 4, 5, 2};
        System.out.println(Arrays.toString(array));
        int[] firstArray = getFirst(array, 3);
        System.out.println("Первые 3 элемента массива: ");
        for (int num : firstArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] lastArray = getLast(array, 3);
        System.out.println("Последние 3 элемента массива: ");
        for (int num : lastArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        int count = countIdentical(array);
        System.out.println("Число повторяющихся элементов в массиве: " + count);
        System.out.println();
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Массив без дубликатов: " + Arrays.toString(uniqueArray));

    }


    //quicksort
    public static void quickSort(int[] array) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, array.length - 1});

        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            int low = range[0];
            int high = range[1];

            if (low < high) {
                int pivotIndex = partition(array, low, high);
                stack.push(new int[]{low, pivotIndex - 1});
                stack.push(new int[]{pivotIndex + 1, high});
            }
        }
    }

    // Метод для разделения массива
    private static int partition(int[] array, int low, int high) {
        // Выбираем медиану из первого, последнего и среднего элементов как pivot
        int mid = low + (high - low) / 2;
        int pivot = medianOfThree(array, low, mid, high);

        while (low <= high) {
            while (array[low] < pivot) {
                low++;
            }
            while (array[high] > pivot) {
                high--;
            }
            if (low <= high) {
                swap(array, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    // Метод для нахождения медианы из трёх элементов
    private static int medianOfThree(int[] array, int low, int mid, int high) {
        if (array[low] > array[mid]) {
            swap(array, low, mid);
        }
        if (array[low] > array[high]) {
            swap(array, low, high);
        }
        if (array[mid] > array[high]) {
            swap(array, mid, high);
        }
        return array[mid];
    }

    // Метод для обмена элементов
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    //bubblesort
    public static void bubblesort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    //insertsort
    public static void insertsort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    //selectivesort
    public static void selectivesort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }

    //mergesort
    public static void mergeSort(int[] array, int left, int
            right) {
        if (right <= left) return;
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    static void merge(int[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;
        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];
        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];
        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;
        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray,скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, то скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    //Функции
    //getFirst
    public static int[] getFirst(int[] array, int n) {
        int[] firstArray = new int[n];
        for (int i = 0; i < n; i++) {
            firstArray[i] = array[i];
        }
        return firstArray;
    }

    //getLast
    public static int[] getLast(int[] array, int n) {
        int[] lastArray = new int[n];
        for (int i = 0; i < n; i++) {
            lastArray[i] = array[array.length - n + i];
        }
        return lastArray;
    }

    //countIdentic
    public static int countIdentical(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    //removeDuplicates
    public static int[] removeDuplicates(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean OnlyOne = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    OnlyOne = false;
                    break;
                }
            }
            if (OnlyOne) {
                count++;
            }
        }
    //Создание массива без дубликатов
        int[] uniqueArray = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean OnlyOne = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    OnlyOne = false;
                    break;
                }
            }
            if (OnlyOne) {
                uniqueArray[index] = array[i];
                index++;
            }
        }

        return uniqueArray;
    }


}
