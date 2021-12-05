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

    public ArrayList<ArrayList<ArrayList<Integer>>> getTheArray() {
        ArrayList<ArrayList<ArrayList<Integer>>> measurements = new ArrayList<>();
        try {
            Path inputPath = Paths.get("");
            Path absPath = Paths.get(inputPath.toAbsolutePath().toString(), "src", "ec", "epn", "edu", "input.txt");
            int[] int1 = new int[200];
            for(int j = 0; j<100; j++) {
                int1[j] = 1 + (6 * j);
            }
            int[] int2 = new int[200];
            for(int m = 0; m<100; m++) {
                int2[m] = 6 + (6 * m);
            }
            ArrayList<ArrayList<Integer>> sub1 = new ArrayList<>();
            for(int i = 1; i<601;i++){
                int finalI = i;
                int l =0;
                if( IntStream.of(int1).anyMatch(n -> n == finalI)){
                }else {
                    String text = Files.readAllLines(Paths.get(String.valueOf(absPath))).get(i);
                    String[] numbers = text.split(" +");
                    ArrayList<Integer> numbers2 = new ArrayList<>();
                    for(int k = 0;k < numbers.length;k++)
                    {
                        if(numbers[k] == ""){

                        }else {
                            numbers2.add(Integer.parseInt(numbers[k]));
                        }
                    }
                    sub1.add(numbers2);
                    if(IntStream.of(int2).anyMatch(n -> n == finalI)) {
                        measurements.add(sub1);
                        sub1 = new ArrayList<>();
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("Existe una exception de IO");
        }
        return measurements;

    }
}
