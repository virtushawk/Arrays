package edu.epam.array.service;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

public class JaggedArraySortTest {

    public int [][] array;
    public int [][] expectedArray;
    public int [][] expectedArrayDesc;

    @BeforeMethod
    public void beforeMethod(){
        array = new int[][]{{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        expectedArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        expectedArrayDesc = new int[][]{{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
    }

    @Test
    public void sortByMaxTest(){
        JaggedArraySort jaggedArraySort = new JaggedArraySort();
        jaggedArraySort.sortByMax(array);
        boolean actual = Arrays.deepEquals(array,expectedArray);
        Assert.assertTrue(actual);
    }

    @Test
    public void sortBySumTest(){
        JaggedArraySort jaggedArraySort = new JaggedArraySort();
        jaggedArraySort.sortBySum(array);
        boolean actual = Arrays.deepEquals(array,expectedArray);
        Assert.assertTrue(actual);
    }

    @Test
    public void sortByMinTest(){
        JaggedArraySort jaggedArraySort = new JaggedArraySort();
        jaggedArraySort.sortByMin(array);
        boolean actual = Arrays.deepEquals(array,expectedArray);
        Assert.assertTrue(actual);
    }

    @Test
    public void sortByMaxDescTest(){
        JaggedArraySort jaggedArraySort = new JaggedArraySort();
        jaggedArraySort.sortByMaxDesc(array);
        boolean actual = Arrays.deepEquals(array,expectedArrayDesc);
        Assert.assertTrue(actual);
    }

    @Test
    public void sortBySumDescTest(){
        JaggedArraySort jaggedArraySort = new JaggedArraySort();
        jaggedArraySort.sortBySumDesc(array);
        boolean actual = Arrays.deepEquals(array,expectedArrayDesc);
        Assert.assertTrue(actual);
    }

    @Test
    public void sortByMinDescTest(){
        JaggedArraySort jaggedArraySort = new JaggedArraySort();
        jaggedArraySort.sortByMinDesc(array);
        boolean actual = Arrays.deepEquals(array,expectedArrayDesc);
        Assert.assertTrue(actual);
    }

    @AfterMethod
    public void afterMethod(){
        array = null;
        expectedArray = null;
        expectedArrayDesc = null;
    }
}
