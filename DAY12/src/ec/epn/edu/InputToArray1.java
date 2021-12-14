package ec.epn.edu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InputToArray1 {

    public ArrayList<ArrayList<String>> getTheArray() {
        ArrayList<ArrayList<String>> inputs = new ArrayList<>();
        try {
            Path inputPath = Paths.get("");
            Path absPath = Paths.get(inputPath.toAbsolutePath().toString(), "src", "ec", "epn", "edu", "input.txt");
            for(int a = 0; a<23; a++) {
                String text = Files.readAllLines(Paths.get(String.valueOf(absPath))).get(a);
                String[] numbers = text.split("-");
                ArrayList<String> inputsS = new ArrayList<>(Arrays.asList(numbers));
                inputs.add(inputsS);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputs;
    }


}

