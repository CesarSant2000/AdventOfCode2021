package ec.epn.edu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstLine {
    public ArrayList<Integer> getFirstLine() throws IOException {
        Path inputPath = Paths.get("");
        Path absPath = Paths.get(inputPath.toAbsolutePath().toString(), "src", "ec", "epn", "edu", "input.txt");
        BufferedReader brTest = new BufferedReader(new FileReader(absPath.toString()));
        String text = brTest .readLine();
        String[] numbers = text.split(",");
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for(int k = 0;k < numbers.length;k++)
        {
            if(numbers[k] == ""){

            }else {
                numbers2.add(Integer.parseInt(numbers[k]));
            }
        }
        return numbers2;
    }
}
