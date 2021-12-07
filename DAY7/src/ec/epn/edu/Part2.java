package ec.epn.edu;

import java.util.ArrayList;

public class Part2 {

    private int fuel = 2147483647;
    RunPart runPart = new RunPart();

    public void runPart2(ArrayList<Integer> mInt) {
        runPart.runs(mInt);
        for (int b = 1; b < runPart.maxValue; b++) {
            int temp = 0;
            fuelForEach(temp, runPart.inputAL, b);
        }
        System.out.println(fuel);
    }

    public void fuelForEach(int temp, ArrayList<Integer> part1A, int bestPosition) {
        for (Integer integer : part1A) {
            for (int d = 0; d < Math.abs(integer - bestPosition); d++) {
                temp = temp + d + 1;
            }
        }
        fuel = Math.min(fuel, temp);
    }
}
