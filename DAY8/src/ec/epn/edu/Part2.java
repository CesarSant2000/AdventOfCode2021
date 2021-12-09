package ec.epn.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class Part2 {

    public void runPart2(ArrayList<ArrayList<ArrayList<String>>> mInt) {
        System.out.println(mInt);
        double total = 0;
        //int count = 0;
        for(int a = 0; a<mInt.size();a++){
            String[] letterToNumber = new String[10];
            String cc = "";
            String ff = "";
            String aaaa = "";
            String bb = "";
            String ee = "";
            String ddgg = "";
            String bbdd = "";
            String ccff = "";
            String dddd = "";
            String[] ccff2 = null;
            String[] ddgg2 = null;
            String[] bbdd2 = null;
            String gggg = "";

            for(int b = 0; b<mInt.get(a).get(0).size();b++) {
                if (mInt.get(a).get(0).get(b).length() == 2) {
                    letterToNumber[1] = mInt.get(a).get(0).get(b);
                    ccff = letterToNumber[1];
                    ccff2 = ccff.split("");
                }
            }
            for(int b = 0; b<mInt.get(a).get(0).size();b++) {
                if (mInt.get(a).get(0).get(b).length() == 4) {
                    letterToNumber[4] = mInt.get(a).get(0).get(b);
                    bbdd = letterToNumber[4];
                    bbdd = bbdd.replace(ccff2[0],"");
                    bbdd = bbdd.replace(ccff2[1],"");
                    bbdd2 = bbdd.split("");
                }
            }
            for(int b = 0; b<mInt.get(a).get(0).size();b++) {
                if (mInt.get(a).get(0).get(b).length() == 3) {
                    letterToNumber[7] = mInt.get(a).get(0).get(b);
                }
                if (mInt.get(a).get(0).get(b).length() == 7) {
                    letterToNumber[8] = mInt.get(a).get(0).get(b);
                }
            }
            for(int b = 0; b<mInt.get(a).get(0).size();b++) {
                if (mInt.get(a).get(0).get(b).length() == 5) {
                    String[] p7A = letterToNumber[7].split("");
                    if (mInt.get(a).get(0).get(b).contains(p7A[0])) {
                        if(mInt.get(a).get(0).get(b).contains(p7A[1])) {
                            if(mInt.get(a).get(0).get(b).contains(p7A[2])) {
                                letterToNumber[3] = mInt.get(a).get(0).get(b);
                                bb = letterToNumber[3];
                                bb = bb.replace(p7A[0],"");
                                bb = bb.replace(p7A[1],"");
                                bb = bb.replace(p7A[2],"");
                                String temp = bb;
                                if(bb.contains(bbdd2[0])){
                                    bb = bbdd2[1];
                                    dddd = bbdd2[0];
                                }else{
                                    bb = bbdd2[0];
                                    dddd = bbdd2[1];
                                }
                                gggg = temp.replace(dddd,"");
                            }
                        }
                    }
                }
            }

            for(int b = 0; b<mInt.get(a).get(0).size();b++) {
                if (mInt.get(a).get(0).get(b).length() == 5) {
                    String p7 = letterToNumber[7];
                    String p1 = letterToNumber[1];
                    aaaa = theDiff(p7,p1);
                    if (mInt.get(a).get(0).get(b).contains(aaaa)) {
                        if(mInt.get(a).get(0).get(b).contains(dddd)) {
                            if(mInt.get(a).get(0).get(b).contains(gggg)) {
                                if(mInt.get(a).get(0).get(b).contains(bb)) {
                                    if(mInt.get(a).get(0).get(b).contains(""+p1.charAt(0))) {
                                        cc = String.valueOf(p1.charAt(1));
                                        ff = String.valueOf(p1.charAt(0));
                                        letterToNumber[5] = mInt.get(a).get(0).get(b);
                                    }else{
                                        cc = String.valueOf(p1.charAt(0));
                                        ff = String.valueOf(p1.charAt(1));
                                        letterToNumber[5] = mInt.get(a).get(0).get(b);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            for(int b = 0; b<mInt.get(a).get(0).size();b++) {
                if (mInt.get(a).get(0).get(b).length() == 5) {
                    if (mInt.get(a).get(0).get(b).contains(aaaa)) {
                        if (mInt.get(a).get(0).get(b).contains(cc)) {
                            if(mInt.get(a).get(0).get(b).contains(dddd)) {
                                if(mInt.get(a).get(0).get(b).contains(gggg)) {
                                    if (!mInt.get(a).get(0).get(b).contains(ff)) {
                                        letterToNumber[2] = mInt.get(a).get(0).get(b);
                                        ee = letterToNumber[2];
                                        ee = ee.replace(aaaa, "");
                                        ee = ee.replace(cc, "");
                                        ee = ee.replace(dddd, "");
                                        ee = ee.replace(gggg, "");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for(int b = 0; b<mInt.get(a).get(0).size();b++) {
                String theSixth = letterToNumber[8];
                theSixth = theSixth.replace(cc,"");
                letterToNumber[6] = theSixth;
            }
            for(int b = 0; b<mInt.get(a).get(0).size();b++) {
                String theNine = letterToNumber[8];
                theNine = theNine.replace(ee,"");
                letterToNumber[9] = theNine;
            }
            for(int b = 0; b<mInt.get(a).get(0).size();b++) {
                String theZero = letterToNumber[8];
                theZero = theZero.replace(dddd,"");
                letterToNumber[0] = theZero;
            }
            System.out.println(letterToNumber[0] + " "+letterToNumber[1] + " "+letterToNumber[2] + " " + letterToNumber[3] + " " + letterToNumber[4]+ " " + letterToNumber[5]+ " "+letterToNumber[6] + " "+letterToNumber[7]+ " "+letterToNumber[8]+ " "+letterToNumber[9]);
            System.out.println(mInt.get(a).get(1));
            String roundS = "";
            int roundI = 0;
            for(int b = 0; b<mInt.get(a).get(1).size();b++) {
                if(mInt.get(a).get(1).get(b).equals(letterToNumber[0])){
                    roundS = roundS + "0";
                }else if(mInt.get(a).get(1).get(b).equals(letterToNumber[1])){
                    roundS = roundS + "1";
                }else if(mInt.get(a).get(1).get(b).equals(letterToNumber[2])){
                    roundS = roundS + "2";
                }else if(mInt.get(a).get(1).get(b).equals(letterToNumber[3])){
                    roundS = roundS + "3";
                }else if(mInt.get(a).get(1).get(b).equals(letterToNumber[4])){
                    roundS = roundS + "4";
                }else if(mInt.get(a).get(1).get(b).equals(letterToNumber[5])){
                    roundS = roundS + "5";
                }else if(mInt.get(a).get(1).get(b).equals(letterToNumber[6])){
                    roundS = roundS + "6";
                }else if(mInt.get(a).get(1).get(b).equals(letterToNumber[7])){
                    roundS = roundS + "7";
                }else if(mInt.get(a).get(1).get(b).equals(letterToNumber[8])){
                    roundS = roundS + "8";
                }else if(mInt.get(a).get(1).get(b).equals(letterToNumber[9])){
                    roundS = roundS + "9";
                }

            }
            roundI = Integer.parseInt(roundS);
            total += roundI;
            System.out.println(roundI);
            System.out.println(total);
        }
    }
    public String theDiff (String str1, String str2){
        ArrayList<String> input1 = new ArrayList<>();
        ArrayList<String> input2 = new ArrayList<>();
        String[] fPart = str1.split("");
        String[] sPart = str2.split("");
        Collections.addAll(input1, fPart);
        Collections.addAll(input2, sPart);
        Set<Object> diff = new HashSet<>(input1);
        diff.retainAll(input2);
        input1.removeAll(diff);
        input2.removeAll(diff);
        String rStr = "";
        for (String s : input1) {
            rStr = rStr + s;
        }
        return rStr;
    }
}
