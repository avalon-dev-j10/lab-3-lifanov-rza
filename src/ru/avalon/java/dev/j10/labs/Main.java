package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Main {

    public static void main(String[] args) {
        
        int sum = 0;
        
        System.out.println("Массив Фибоначчи: ");
        int[] array = new int[20];
        FibonacciInitializer fib = new FibonacciInitializer();
        fib.initialize(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма массива Фибоначчи: ");
        for(int i : array) sum += i;
        System.out.println(sum);
        
        System.out.println("\nМассив arrayRand: ");
        int[] arrayRand = new int[50 - (-50)];
        RandomInitializer randInit = new RandomInitializer();
        randInit.initialize(arrayRand);
        System.out.println(Arrays.toString(arrayRand));
        
        System.out.println("Отсортирован пузырьковой сортировкой: ");
        BubbleSort bubble = new BubbleSort();
        bubble.sort(arrayRand);
        System.out.println(Arrays.toString(arrayRand));
        
        System.out.println("\nМассив arrayRand2: ");
        int[] arrayRand2 = new int[50 - (-50)];
        randInit.initialize(arrayRand2);
        System.out.println(Arrays.toString(arrayRand2));
        
        System.out.println("Отсортирован сортировкой выбором: ");
        SelectionSort select = new SelectionSort();
        select.sort(arrayRand2);
        System.out.println(Arrays.toString(arrayRand2));
        
        System.out.println("\nМассив arrayRand3: ");
        int[] arrayRand3 = new int[9];
        randInit.initialize(arrayRand3);
        System.out.println(Arrays.toString(arrayRand3));
        
        System.out.println("Отсортирован сортировкой Шелла: ");
        ShellSortMC shell = new ShellSortMC();
        shell.sort(arrayRand3);
        System.out.println(Arrays.toString(arrayRand3));
        
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
