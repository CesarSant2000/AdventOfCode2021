package ec.epn.edu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class InputToArray2 {

    public ArrayList<ArrayList<String>> getTheArray() {
        ArrayList<ArrayList<String>> inputs = new ArrayList<>();
        try {
            Path inputPath = Paths.get("");
            Path absPath = Paths.get(inputPath.toAbsolutePath().toString(), "src", "ec", "epn", "edu", "input.txt");
            for(int a = 898; a<910; a++) {
                String text = Files.readAllLines(Paths.get(String.valueOf(absPath))).get(a);
                String[] numbers = text.split(" ");
                ArrayList<String> inputsS = new ArrayList<>();
                String[] secString = numbers[numbers.length-1].split("=");
                Collections.addAll(inputsS, secString);
                inputs.add(inputsS);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputs;
    }


}

