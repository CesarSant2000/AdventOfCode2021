package ec.epn.edu;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        InputToArray inputToArray = new InputToArray();
        Part1 part1 = new Part1();
        Part2 part2 = new Part2();
        FirstLine fline = new FirstLine();
        ArrayList<Integer> firstLine =  fline.getFirstLine();
        ArrayList<ArrayList<ArrayList<Integer>>> importStr = inputToArray.getTheArray();
        //System.out.println(firstLine);
        //System.out.println(importStr);
        //part1.runPart1(importStr, firstLine);
        part2.runPart2(importStr, firstLine);
    }
}
