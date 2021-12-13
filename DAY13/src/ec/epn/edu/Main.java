package ec.epn.edu;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        InputToArray1 inputToArray1 = new InputToArray1();
        InputToArray2 inputToArray2 = new InputToArray2();
        Part1 part1 = new Part1();
        Part2 part2 = new Part2();
        ArrayList<ArrayList<Integer>> mInt = inputToArray1.getTheArray();
        ArrayList<ArrayList<String>> mStr = inputToArray2.getTheArray();
        //part1.runPart1(mInt,mStr);
        part2.runPart2(mInt, mStr);
    }
}
