package ec.epn.edu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Part1 {

    ArrayList<ArrayList<Integer>> thePaper = null;
    public void runPart1(ArrayList<ArrayList<Integer>> mInt, ArrayList<ArrayList<String>> mString) {
        System.out.println(mInt);
        System.out.println(mString);
        thePaper = mInt;
        ArrayList<String> theFold1 = mString.get(0);
        String dir = theFold1.get(0);
        int lin = Integer.parseInt(theFold1.get(1));
        for (int a = 0; a < thePaper.size(); a++) {
            if(thePaper.get(a).get(0) > lin){
                executeFold(a,lin);
                a--;
            }
        }
        System.out.println(thePaper.size());
    }

    public void executeFold(int a, int lin){
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
        if(!isOverlap){
            thePaper.set(a,newCord);
        }else{
            thePaper.remove(a);
        }
    }
}
