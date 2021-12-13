package ec.epn.edu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class InputToArray1 {

    public ArrayList<ArrayList<Integer>> getTheArray() {
        ArrayList<ArrayList<Integer>> inputs = new ArrayList<>();
        try {
            Path inputPath = Paths.get("");
            Path absPath = Paths.get(inputPath.toAbsolutePath().toString(), "src", "ec", "epn", "edu", "input.txt");
            for(int a = 0; a<897; a++) {
                String text = Files.readAllLines(Paths.get(String.valueOf(absPath))).get(a);
                String[] numbers = text.split(",");
                ArrayList<Integer> inputsS = new ArrayList<>();
                for (String number : numbers) {
                    inputsS.add(Integer.parseInt(number));
                }
                inputs.add(inputsS);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputs;
    }


}

