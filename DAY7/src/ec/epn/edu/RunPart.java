package ec.epn.edu;

import java.util.ArrayList;

public class RunPart {
    public ArrayList<Integer> inputAL = null;
    Integer maxValue = 0;

    public void runs(ArrayList<Integer> mInt) {
        inputAL = new ArrayList<>(mInt);
        for (Integer integer : inputAL) {
            maxValue = Math.max(maxValue, integer);
        }
    }
}
