package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NumberSortTest {

    public NumberArray array;
    public NumberArray expectedArray;

    @BeforeMethod
    public void beforeMethod(){
        array = new NumberArray(31,32,30);
        expectedArray = new NumberArray(30,31,32);
    }

    @Test
    public void bubbleSortTest(){
        NumberSort numberSort = new NumberSort();
        numberSort.bubbleSort(array);
        Assert.assertEquals(array,expectedArray);
    }

    @Test
    public void insertionSortTest(){
        NumberSort numberSort = new NumberSort();
        numberSort.insertionSort(array);
        Assert.assertEquals(array,expectedArray);
    }

    @Test
    public void selectionSortTest(){
        NumberSort numberSort = new NumberSort();
        numberSort.selectionSort(array);
        Assert.assertEquals(array,expectedArray);
    }


    @AfterMethod
    public void afterMethod(){
        array = null;
    }
}
