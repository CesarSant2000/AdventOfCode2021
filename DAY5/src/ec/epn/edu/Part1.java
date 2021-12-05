package ec.epn.edu;

import java.util.ArrayList;

public class Part1 {
    int theCount = 0;
    public ArrayList<ArrayList<Integer>> runPart1(ArrayList<ArrayList<Integer>> mInt) {
        Universe universe = new Universe();
        ArrayList<ArrayList<Integer>> universeSpace = universe.getTheUniverse(mInt);
        System.out.println(mInt);
        for(int i = 0; i<500; i++){
            int yMax = Math.max(mInt.get(i).get(1),mInt.get(i).get(3));
            int xMax = Math.max(mInt.get(i).get(0),mInt.get(i).get(2));
            int yMin = Math.min(mInt.get(i).get(1),mInt.get(i).get(3));
            int xMin = Math.min(mInt.get(i).get(0),mInt.get(i).get(2));
            //System.out.println(xMin + " " + yMin + " " + xMax + " " + yMax);
            if(xMax == xMin){
                for(int yy = yMin; yy<yMax+1;yy++){
                    universeSpace.get(yy).set(xMax,(universeSpace.get(yy).get(xMax))+1);
                }
            }else if(yMin == yMax){
                for(int xx = xMin; xx<xMax+1;xx++){
                    universeSpace.get(yMax).set(xx,(universeSpace.get(yMax).get(xx))+1);
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
        return universeSpace;
    }
}
