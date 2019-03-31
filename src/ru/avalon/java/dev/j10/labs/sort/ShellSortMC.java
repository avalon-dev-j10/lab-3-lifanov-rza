package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>Алгоритм сортировки, являющийся усовершенствованным
 * вариантом сортировки вставками. Идея метода Шелла состоит
 * в сравнении элементов, стоящих не только рядом, но и на
 * определённом расстоянии друг от друга. Иными словами —
 * это сортировка вставками с предварительными «грубыми»
 * проходами. Аналогичный метод усовершенствования
 * пузырьковой сортировки называется сортировка расчёской.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка Шелла</a>
 */
public class ShellSortMC implements Sort {

    /**
     * {@inheritDoc}
     */
    public void sort(int[] array) {
        // эмпирическая последовательность Марцина Циура:
        int[] sequinceMarkCiur = {1,4,10,23,57,132,301,701,1750};
        // Находим наибольшее число (инкремент), подходящее для выборки из массива array.
        int number = 0;
        int increment = 1;
        boolean outOfWhile = true;
        do {
            if(array.length > sequinceMarkCiur[number]) {
                number++;
                increment = sequinceMarkCiur[number - 1];
            } else outOfWhile = false;
        } while (outOfWhile);
        
        // Проверяем массив на максимальное колличество эллементов.
        if (checkSizeArray(array)) {
            for (int i = 0; i < number; number--) {
                increment = sequinceMarkCiur[number - 1];
                if (increment == 1) {
                    // Сортировка вставками
                    insertionSort(array);
                } else {
                    // Внутренняя сортировка методом Шелла
                    innerSort(array, increment);
                }
            }
        }
        /*
         * TODO(Студент): Реализовать метод sort класса ShellSort
         */
    }
    private boolean checkSizeArray(int[] array) {
        boolean a = true;
        if (array.length > 4000) {
            System.out.println("Слишком большой массив для данной сортировки.");
            System.out.println("Число элементов должно быть не более 4000.");
            a = false;
        }
        return a;
    }
    
    private void innerSort(int[] array, int increment) {
        for (int i = 0; i < array.length / increment; i++) {
            for (int index = 0; index < increment; index++) {
                for (int j = index; j < array.length - increment; j += increment) {
                    if (array[j] > array[j + increment]) {
                    int k = array[j];
                    array[j] = array[j + increment];
                    array[j + increment] = k;
                    }
                }
            }
        }
    }
    
    private void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[i]) {
                int k = array[i];
                array[i] = array[j];
                array[j] = k;
                }
            }
        }
    }
    
}
            
        
