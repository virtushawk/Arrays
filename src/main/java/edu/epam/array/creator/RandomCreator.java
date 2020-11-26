package edu.epam.array.creator;

import edu.epam.array.entity.NumberArray;

import java.util.Random;

public class RandomCreator {
    private static final int DEFAULT_MAX = 1000;

    public NumberArray randomArray(int size, int range){
        Random rand = new Random();
        NumberArray numberArray = new NumberArray();
        for (int i = 0; i < size; i++){
            int number = rand.nextInt(range);
            numberArray.add(number);
        }
        return numberArray;
    }

    public NumberArray randomArray(int size){
      return randomArray(size,DEFAULT_MAX);
    }
}
