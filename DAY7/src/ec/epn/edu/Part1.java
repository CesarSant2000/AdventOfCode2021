package ec.epn.edu;

import java.util.ArrayList;

public class Part1 {

    private int fuel = 2147483647;
    RunPart runPart = new RunPart();

    public void runPart1(ArrayList<Integer> mInt) {
        runPart.runs(mInt);
        for (int b = 1; b < runPart.maxValue; b++) {
            int temp = 0;
            fuelForEach(temp, runPart.inputAL, b);
        }
        System.out.println(fuel);
    }

    public void fuelForEach(int temp, ArrayList<Integer> part1A, int bestPosition) {
        for (Integer integer : part1A) {
            temp = temp + Math.abs(integer - bestPosition);
        }
        fuel = Math.min(fuel, temp);
    }
}
