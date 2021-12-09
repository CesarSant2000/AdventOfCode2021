package ec.epn.edu;

import java.util.ArrayList;

public class Part1 {

    public void runPart1(ArrayList<ArrayList<ArrayList<String>>> mInt) {
        double theCount = 0;
        for (ArrayList<ArrayList<String>> arrayLists : mInt) {
            for (int b = 0; b < arrayLists.get(1).size(); b++) {
                if (arrayLists.get(1).get(b).length() == 2) {
                    theCount++;
                } else if (arrayLists.get(1).get(b).length() == 4) {
                    theCount++;
                } else if (arrayLists.get(1).get(b).length() == 3) {
                    theCount++;
                } else if (arrayLists.get(1).get(b).length() == 7) {
                    theCount++;
                }
            }
        }

        System.out.println(theCount);
    }
}
