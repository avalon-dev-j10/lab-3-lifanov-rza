package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {

    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param arrayRand массив, подлежащий инициализации
     */
    public void initialize(int[] arrayRand) {
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
//        Random rand = new Random();
        for (int i = 0; i < arrayRand.length; i++) {
            arrayRand[i] = (int) (Math.random() * 102 - 51);
//            array[i] = rand.nextInt()* 100 - 100;
        }
    }
}
