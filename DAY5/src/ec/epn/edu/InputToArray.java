package ec.epn.edu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class InputToArray {

    public ArrayList<ArrayList<Integer>> getTheArray() {
        ArrayList<ArrayList<Integer>> measurements = new ArrayList<>();
        try {
            Path inputPath = Paths.get("");
            Path absPath = Paths.get(inputPath.toAbsolutePath().toString(), "src", "ec", "epn", "edu", "input.txt");
            for(int i = 0; i<500;i++){
                    String text = Files.readAllLines(Paths.get(String.valueOf(absPath))).get(i);
                    text = text.replace(","," -> ");
                    String[] numbers = text.split(" -> ");
                    ArrayList<Integer> numbers2 = new ArrayList<>();
                    for(int k = 0;k < numbers.length;k++){
                        numbers2.add(Integer.parseInt(numbers[k]));
                    }
                    measurements.add(numbers2);
                }
            } catch (IOException e) {
            e.printStackTrace();
        }
        return measurements;
    }


    }

