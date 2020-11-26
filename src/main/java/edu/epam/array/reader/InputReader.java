package edu.epam.array.reader;
import edu.epam.array.entity.NumberArray;
import edu.epam.array.validator.InputValidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReader {

    private List<String> readFromFile(String path){
        ArrayList<String> numbers = new ArrayList<>();
        File file = new File(path);
        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                numbers.add(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public NumberArray numbersFromFile(String path){
        NumberArray numberArray = new NumberArray();
        InputValidator inputValidator = new InputValidator();
        ArrayList<String> data = (ArrayList<String>) readFromFile(path);
        for (String line: data) {
            String [] numbers = line.split("\\s+");
            for (String number: numbers) {
                if (inputValidator.isNumber(number)){
                    int num = Integer.parseInt(number);
                    numberArray.add(num);
                }
            }
        }
        return numberArray;
    }

}
