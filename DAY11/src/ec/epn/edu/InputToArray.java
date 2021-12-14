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

    public ArrayList<ArrayList<String>> getTheArray() {
        ArrayList<ArrayList<String>> inputs = new ArrayList<>();
        try {
            Path inputPath = Paths.get("");
            Path absPath = Paths.get(inputPath.toAbsolutePath().toString(), "src", "ec", "epn", "edu", "input.txt");
            for(int a = 0; a<110; a++) {
                String text = Files.readAllLines(Paths.get(String.valueOf(absPath))).get(a);
                String[] numbers = text.split("");
                ArrayList<String> inputsS = new ArrayList<>();
                Collections.addAll(inputsS, numbers);
                inputs.add(inputsS);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputs;
    }


}

