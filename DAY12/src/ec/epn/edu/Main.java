package ec.epn.edu;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        InputToArray1 inputToArray1 = new InputToArray1();
        Part1 part1 = new Part1();
        Part2 part2 = new Part2();
        ArrayList<ArrayList<String>> mInt = inputToArray1.getTheArray();
        part1.runPart1(mInt);
        //part2.runPart2(mInt, mStr);
    }
}
