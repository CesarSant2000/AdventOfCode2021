package ec.epn.edu;

import java.util.*;

public class Part2 {
    ArrayList<ArrayList<Integer>> thePaper = null;

    public void runPart2(ArrayList<ArrayList<Integer>> mInt, ArrayList<ArrayList<String>> mString) {
        System.out.println(mInt);
        System.out.println(mString);
        thePaper = mInt;
        for(int z = 0; z<mString.size();z++) {
            ArrayList<String> theFold = mString.get(z);
            String dir = theFold.get(0);
            int lin = Integer.parseInt(theFold.get(1));
            if(dir.equals("x")){
                for (int a = 0; a < thePaper.size(); a++) {
                    if (thePaper.get(a).get(0) > lin) {
                        executeFold(a, lin, "x");
                        a--;
                    }
                }
            }else if (dir.equals("y")){
                for (int a = 0; a < thePaper.size(); a++) {
                    if (thePaper.get(a).get(1) > lin) {
                        executeFold(a, lin,"y");
                        a--;
                    }
                }
            }
        }
        ArrayList<ArrayList<String>> theGrid = new ArrayList<>();
        ArrayList<String> theLinGrid = null;
        for(int t = 0; t<8;t++) {
            theLinGrid = new ArrayList<>();
            for (int u = 0; u < 50; u++) {
                theLinGrid.add(".");
            }
            theGrid.add(theLinGrid);
        }
        for(int m= 0;m<thePaper.size();m++){
            theGrid.get(thePaper.get(m).get(1)).set(thePaper.get(m).get(0),"#");
        }
        for(int n = 0; n<theGrid.size();n++){
            System.out.println(theGrid.get(n));
            //System.out.println(thePaper.get(n));
        }
    }

    public void executeFold(int a, int lin, String dir) {
        if(dir.equals("x")){
            int actualX = thePaper.get(a).get(0);
            int actualY = thePaper.get(a).get(1);
            int newX = lin - (actualX - lin);
            ArrayList<Integer> newCord = new ArrayList<>();
            newCord.add(newX);
            newCord.add(actualY);
            boolean isOverlap = false;
            for (ArrayList<Integer> integers : thePaper) {
                if (integers.get(1) == actualY) {
                    if (integers.get(0) == newX) {
                        isOverlap = true;
                    }
                }
            }
            if (!isOverlap) {
                thePaper.set(a, newCord);
            } else {
                thePaper.remove(a);
            }
        }else{
            int actualX = thePaper.get(a).get(0);
            int actualY = thePaper.get(a).get(1);
            int newY = lin - (actualY - lin);
            ArrayList<Integer> newCord = new ArrayList<>();
            newCord.add(actualX);
            newCord.add(newY);
            boolean isOverlap = false;
            for (ArrayList<Integer> integers : thePaper) {
                if (integers.get(0) == actualX) {
                    if (integers.get(1) == newY) {
                        isOverlap = true;
                    }
                }
            }
            if (!isOverlap) {
                thePaper.set(a, newCord);
            } else {
                thePaper.remove(a);
            }
        }
    }
}
