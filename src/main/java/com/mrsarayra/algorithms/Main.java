package com.mrsarayra.algorithms;

import com.mrsarayra.algorithms.enums.SortDirection;
import com.mrsarayra.algorithms.sorting.AbstractSort;
import com.mrsarayra.algorithms.sorting.BubbleSort;
import com.mrsarayra.algorithms.sorting.CountingSort;
import com.mrsarayra.algorithms.sorting.InsertionSort;
import com.mrsarayra.algorithms.sorting.MergingSort;
import com.mrsarayra.algorithms.sorting.QuickSort;
import com.mrsarayra.algorithms.sorting.SelectionSort;
import com.mrsarayra.algorithms.sorting.ShakerSort;
import com.mrsarayra.algorithms.sorting.ShellSort;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {


    private static final int TEST_ARRAY_SIZE = 10000;
    private static final Random RANDOM = new Random((System.currentTimeMillis() * 13) % 1000);
    private static final int UPPER_BOUND = 20;
    private static final int LOWER_BOUND = 5;


    public static void main(String[] args) {
        // write your code here
        List<AbstractSort> sortingAlgorithms = Arrays.asList
                (new BubbleSort(),
                        new SelectionSort(),
                        new InsertionSort(),
                        new ShakerSort(),
                        new ShellSort(),
//                        new BogoSort(),
                        new CountingSort(),
                        new MergingSort(),
                        new QuickSort());

        int[] randomNumbers = IntStream.generate(() -> RANDOM.nextInt(UPPER_BOUND) - LOWER_BOUND).limit(TEST_ARRAY_SIZE).toArray();

        for (AbstractSort algorithm : sortingAlgorithms) {
            System.out.println("\n" + algorithm.getName());
            System.out.print("ASC sorting: ");
            long tBefore = System.currentTimeMillis();
            algorithm.sort(randomNumbers.clone(), SortDirection.ASC);
            System.out.println(System.currentTimeMillis() - tBefore);
            System.out.print("DSC sorting: ");
            tBefore = System.currentTimeMillis();
            algorithm.sort(randomNumbers.clone(), SortDirection.DSC);
            System.out.println(System.currentTimeMillis() - tBefore);
        }
    }

}
