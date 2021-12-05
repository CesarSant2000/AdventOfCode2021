package ec.epn.edu;


import java.util.ArrayList;
import java.util.Iterator;

public class Part2 {
    int theCount = 0;
    Part1 part1 = new Part1();
    public void runPart2(ArrayList<ArrayList<Integer>> mInt) {
        Universe universe = new Universe();
        ArrayList<ArrayList<Integer>> universeSpace = universe.getTheUniverse(mInt);
        universeSpace = part1.runPart1(mInt);
        System.out.println(mInt);
        for(int i = 0; i<500; i++){
            int x1 = mInt.get(i).get(0);
            int y1 = mInt.get(i).get(1);
            int x2 = mInt.get(i).get(2);
            int y2 = mInt.get(i).get(3);
            int yMax = Math.max(mInt.get(i).get(1),mInt.get(i).get(3));
            int xMax = Math.max(mInt.get(i).get(0),mInt.get(i).get(2));
            int yMin = Math.min(mInt.get(i).get(1),mInt.get(i).get(3));
            int xMin = Math.min(mInt.get(i).get(0),mInt.get(i).get(2));
            int pendiente = 0;
            if(x2-x1 != 0){
                pendiente = (y2-y1)/(x2-x1);
            }
            if(pendiente != 0) {
                for (int m = 0; m < (xMax - xMin) + 1; m++) {
                    if(pendiente >0) {
                        universeSpace.get(yMin+m).set(xMax-m, (universeSpace.get(yMin+m).get(xMax-m)) + 1);
                    }else{
                        universeSpace.get(yMin+m).set(xMin+m, (universeSpace.get(yMin + m).get(xMin+m)) + 1);
                    }
                }
            }

        }
        for(int o = 0; o<universe.theBiggest; o++) {
            for (int p = 0; p <universe.theBiggest; p++) {
                if (universeSpace.get(o).get(p) >= 2) {
                    theCount += 1;
                }
            }
        }
        System.out.println(theCount);
    }
}
