package edu.epam.array.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class JaggedArraySort {
    private static final Logger logger = LogManager.getLogger(JaggedArraySort.class);

    public void sortByMax(int [][] array){
        logger.info("SortByMax starts ... {} " ,Arrays.deepToString(array));
        for (int i = 0; i + 1 < array.length; i++){
            for (int j = 0; j + 1 < array.length - i; j++){
                if (max(array[j+1]) < max(array[j])){
                    swap(array,j,j + 1);
                }
            }
        }
        logger.info("SortByMax finished : {} ", Arrays.deepToString(array));
    }

    public void sortByMaxDesc(int [][] array){
        logger.info("SortByMaxDesc starts ... {} " ,Arrays.deepToString(array));
        for (int i = 0; i + 1 < array.length; i++){
            for (int j = 0; j + 1 < array.length - i; j++){
                if (max(array[j+1]) > max(array[j])){
                    swap(array,j,j + 1);
                }
            }
        }
        logger.info("SortByMaxDesc finished : {} ", Arrays.deepToString(array));
    }

    public void sortBySum(int [][] array){
        logger.info("SortBySum starts ... {} " ,Arrays.deepToString(array));
        for (int i = 0; i + 1 < array.length; i++){
            for (int j = 0; j + 1 < array.length - i; j++){
                if (sum(array[j+1]) < sum(array[j])){
                    swap(array,j,j + 1);
                }
            }
        }
        logger.info("SortBySum finished : {} ", Arrays.deepToString(array));
    }

    public void sortBySumDesc(int [][] array){
        logger.info("SortBySumDesc starts ... {} " ,Arrays.deepToString(array));
        for (int i = 0; i + 1 < array.length; i++){
            for (int j = 0; j + 1 < array.length - i; j++){
                if (sum(array[j+1]) > sum(array[j])){
                    swap(array,j,j + 1);
                }
            }
        }
        logger.info("SortBySumDesc finished : {} ", Arrays.deepToString(array));
    }

    public void sortByMin(int [][] array){
        logger.info("SortByMin starts ... {} " ,Arrays.deepToString(array));
        for (int i = 0; i + 1 < array.length; i++){
            for (int j = 0; j + 1 < array.length - i; j++){
                if (min(array[j+1]) < min(array[j])){
                    swap(array,j,j + 1);
                }
            }
        }
        logger.info("SortByMin finished : {} ", Arrays.deepToString(array));
    }

    public void sortByMinDesc(int [][] array){
        logger.info("SortByMinDesc starts ... {} " ,Arrays.deepToString(array));
        for (int i = 0; i + 1 < array.length; i++){
            for (int j = 0; j + 1 < array.length - i; j++){
                if (min(array[j+1]) > min(array[j])){
                    swap(array,j,j + 1);
                }
            }
        }
        logger.info("SortByMinDesc finished : {} ", Arrays.deepToString(array));
    }

    public int max(int [] array){
        int max = array[0];
        for (int number: array) {
            if (max < number){
                max = number;
            }
        }
        return max;
    }

    public int min(int [] array){
        int min = array[0];
        for (int number: array) {
            if (min > number){
                min = number;
            }
        }
        return min;
    }

    public void swap(int [][] array, int index1, int index2){
        int [] temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public int sum(int [] array){
        int sum = 0;
        for (int number: array) {
            sum += number;
        }
        return sum;
    }

}
