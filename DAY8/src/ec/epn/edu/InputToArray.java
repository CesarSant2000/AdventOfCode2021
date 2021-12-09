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

    public ArrayList<ArrayList<ArrayList<String>>> getTheArray() {
        ArrayList<ArrayList<ArrayList<String>>> inputs = null;
        ArrayList<ArrayList<String>> inputsS = null;
        ArrayList<String> inputsSS = null;
        ArrayList<String> inputsSSS = null;
        try {
            Path inputPath = Paths.get("");
            Path absPath = Paths.get(inputPath.toAbsolutePath().toString(), "src", "ec", "epn", "edu", "input.txt");
            inputs = new ArrayList<>();
            for(int a = 0; a<200; a++) {
                String text = Files.readAllLines(Paths.get(String.valueOf(absPath))).get(a);
                String[] numbers = text.split(" \\| ");
                String[] fPart = numbers[0].split(" ");
                String[] sPart = numbers[1].split(" ");
                for(int b =0;b<fPart.length;b++){
                    String[] temp = fPart[b].split("");
                    Arrays.sort(temp);
                    fPart[b] = String.join("", temp);
                }
                for(int b =0;b<sPart.length;b++){
                    String[] temp = sPart[b].split("");
                    Arrays.sort(temp);
                    sPart[b] = String.join("", temp);
                }
                inputsSS = new ArrayList<>();
                inputsSSS = new ArrayList<>();
                Collections.addAll(inputsSS, fPart);
                Collections.addAll(inputsSSS, sPart);

                inputsS = new ArrayList<>();
                inputsS.add(inputsSS);
                inputsS.add(inputsSSS);
                inputs.add(inputsS);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputs;
    }


}

