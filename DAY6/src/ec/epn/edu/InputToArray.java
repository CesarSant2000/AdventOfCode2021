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

    public ArrayList<Integer> getTheArray() {
        ArrayList<Integer> numbers2 = null;
        try {
            Path inputPath = Paths.get("");
            Path absPath = Paths.get(inputPath.toAbsolutePath().toString(), "src", "ec", "epn", "edu", "input.txt");
            String text = Files.readAllLines(Paths.get(String.valueOf(absPath))).get(0);
            String[] numbers = text.split(",");
            numbers2 = new ArrayList<>();
            for (String number : numbers) {
                numbers2.add(Integer.parseInt(number));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers2;
    }


}

