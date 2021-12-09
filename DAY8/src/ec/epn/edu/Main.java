package ec.epn.edu;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        InputToArray inputToArray = new InputToArray();
        Part1 part1 = new Part1();
        Part2 part2 = new Part2();
        ArrayList<ArrayList<ArrayList<String>>> mInt = inputToArray.getTheArray();
        //System.out.println(mInt);
        //part1.runPart1(mInt);
        part2.runPart2(mInt);
    }
}
