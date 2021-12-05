package ec.epn.edu;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class Part2 {

    public void runPart2(ArrayList<ArrayList<ArrayList<Integer>>> mStr, ArrayList<Integer> mInt) {
        ArrayList<ArrayList<ArrayList<Integer>>> measurements = new ArrayList<>();
        ArrayList<ArrayList<ArrayList<Integer>>> base = new ArrayList<>();
        ArrayList<ArrayList<Integer>> baseSub1 = null;
        ArrayList<Integer> baseSub2 = null;
        for (ArrayList<ArrayList<Integer>> arrayLists : mStr) {
            baseSub1 = new ArrayList<>();
            for (ArrayList<Integer> arrayList : arrayLists) {
                baseSub2 = new ArrayList<>();
                for (int a = 0; a < arrayList.size(); a++) {
                    baseSub2.add(0);
                }
                baseSub1.add(baseSub2);
            }
            base.add(baseSub1);
        }
        int didWin = 0;
        int indexFirstLine = 0;
        int theSum = 0;
        int theActualValue = -1;
        for(int mmm = 0; mmm<100;mmm++){
            theActualValue = mInt.get(indexFirstLine);
            for (int b = 0; b<mStr.size();b++) {
                for (int c = 0; c<mStr.get(b).size();c++) {
                    int countOnes = 0;
                    for (int d = 0; d < mStr.get(b).get(c).size(); d++) {
                        if(mStr.get(b).get(c).get(d) == theActualValue){
                            base.get(b).get(c).set(d,1);
                        }
                    }
                    for(int e =0; e<5;e++){
                        if(base.get(b).get(c).get(e) == 1 ){
                            countOnes ++;
                            if(countOnes == 5){
                                System.out.println(mStr.get(b));
                                System.out.println(base.get(b));
                                System.out.println("This table win: " + b + " with: " + theActualValue);
                                for( int f = 0; f<5;f++){
                                    for( int g = 0; g<5;g++){
                                        if(base.get(b).get(f).get(g) == 0){
                                            theSum += mStr.get(b).get(f).get(g);
                                        }
                                    }
                                }
                                System.out.println(theSum*theActualValue);
                                for( int ff = 0; ff<5;ff++){
                                    for( int gg = 0; gg<5;gg++){
                                        base.get(b).get(ff).set(gg,-1);
                                        mStr.get(b).get(ff).set(gg,-1);
                                    }
                                }
                                theSum = 0;
                                didWin += 1;
                            }
                        }
                    }
                    int p = 0;
                    for(int q = 0;q<5;q++) {
                        if (base.get(b).get(p).get(q) == 1) {
                            if(base.get(b).get(p+1).get(q) == 1){
                                if(base.get(b).get(p+2).get(q) == 1){
                                    if(base.get(b).get(p+3).get(q) == 1){
                                        if(base.get(b).get(p+4).get(q) == 1) {
                                            System.out.println(mStr.get(b));
                                            System.out.println(base.get(b));
                                            System.out.println("This table win: " + b + " with: " + theActualValue);
                                            for( int f = 0; f<5;f++){
                                                for( int g = 0; g<5;g++){
                                                    if(base.get(b).get(f).get(g) == 0){
                                                        theSum += mStr.get(b).get(f).get(g);
                                                    }
                                                }
                                            }
                                            System.out.println(theSum*theActualValue);
                                            for( int fff = 0; fff<5;fff++){
                                                for( int ggg = 0; ggg<5;ggg++){
                                                    base.get(b).get(fff).set(ggg,-1);
                                                    mStr.get(b).get(fff).set(ggg,-1);
                                                }
                                            }
                                            theSum = 0;
                                            didWin += 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            indexFirstLine++;
        }
    }
}
