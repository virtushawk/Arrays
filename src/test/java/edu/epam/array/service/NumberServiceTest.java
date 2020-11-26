package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NumberServiceTest {
    public NumberArray array;
    public NumberArray sortedArray;
    public NumberArray fibonacciArray;

    @BeforeMethod
    public void beforeMethod(){
        sortedArray = new NumberArray(30,31,32,33,35,37);
        array = new NumberArray(30,31,35,33,32);
        fibonacciArray = new NumberArray(5,4,13,89,100);
    }

    @Test
    public void binarySearchTest(){
        int number = 35;
        int expected = 4;
        NumberService numberService = new NumberService();
        int actual = numberService.binarySearch(sortedArray,number);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void maxTest(){
        int expected = 35;
        NumberService numberService = new NumberService();
        int actual = numberService.max(array);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void minTest(){
        int expected = 30;
        NumberService numberService = new NumberService();
        int actual = numberService.min(array);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void allPrimeNumbersTest(){
        NumberService numberService = new NumberService();
        NumberArray actual = numberService.allPrimeNumbers(array);
        NumberArray expected = new NumberArray(31);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void allFibonacciNumbers(){
        NumberService numberService = new NumberService();
        NumberArray actual = numberService.allFibonacciNumbers(fibonacciArray);
        NumberArray expected = new NumberArray(5,13,89);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void allNumbersWithUniqueDigitsTest(){
        NumberService numberService = new NumberService();
        NumberArray actual = numberService.allNumbersWithUniqueDigits(sortedArray);
        NumberArray expected = new NumberArray(30,31,32,35,37);
        Assert.assertEquals(actual,expected);
    }

    @AfterMethod
    public void afterMethod(){
        array = null;
        sortedArray = null;
        fibonacciArray = null;
    }
}
