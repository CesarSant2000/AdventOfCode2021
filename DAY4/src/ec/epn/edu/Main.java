package ec.epn.edu;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        InputToArray inputToArray = new InputToArray();
        Part1 part1 = new Part1();
        Part2 part2 = new Part2();
        ArrayList<String> importStr = inputToArray.getTheArray();
        part1.runPart1(importStr);
        part2.runPart2(importStr);
    }
}
