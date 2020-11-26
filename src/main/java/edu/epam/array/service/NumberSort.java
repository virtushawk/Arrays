package edu.epam.array.service;
import edu.epam.array.entity.NumberArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumberSort {
    private static final Logger logger = LogManager.getLogger(NumberSort.class);

    public void bubbleSort(NumberArray array){
        logger.info("bubbleSort array starts .. {} ",array);
        for (int i = 0; i + 1 < array.size(); i++){
            for (int j = 0; j + 1 < array.size() - i; j++){
                if (array.get(j+1) < array.get(j)){
                    swap(array,j,j + 1);
                }
            }
        }
        logger.info("bubbleSort array finished .. {} ",array);
    }

    public void insertionSort(NumberArray array){
        logger.info("insertionSort array starts .. {} ",array);
        for (int i = 1; i < array.size(); i++){
            for (int j = i; j > 0 && array.get(j) < array.get(j - 1); j--){
                swap(array,j,j-1);
            }
        }
        logger.info("insertionSort array finished .. {} ",array);
    }

    public void selectionSort(NumberArray array){
        logger.info("selectionSort array starts .. {} ",array);
        for (int i = 0; i < array.size(); i++){
            int min = array.get(i);
            int index = i;
            for (int j = i; j < array.size(); j++){
                if(min > array.get(j)){
                    min = array.get(j);
                    index = j;
                }
            }
            swap(array,i,index);
        }
        logger.info("selectionSort array finished .. {} ",array);
    }

    public void swap(NumberArray array ,int index1, int index2){
        int number1 = array.get(index1);
        int number2 = array.get(index2);
        array.set(index1,number2);
        array.set(index2,number1);
    }

}
