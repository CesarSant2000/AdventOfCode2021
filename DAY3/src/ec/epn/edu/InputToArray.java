package ec.epn.edu;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InputToArray {
    public ArrayList<String> getTheArray() {
        List<String> measurements = null;
        try {
            Path inputPath = Paths.get("");
            System.out.println(inputPath.toAbsolutePath());
            Path absPath = Paths.get(inputPath.toAbsolutePath().toString(), "src", "ec", "epn", "edu", "input.txt");
            measurements = Files.readAllLines(absPath, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Existe una exception de IO");
        }
        assert measurements != null;
        return new ArrayList<>(measurements);
    }
}
