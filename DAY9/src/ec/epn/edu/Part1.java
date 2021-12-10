package ec.epn.edu;

import java.util.ArrayList;

public class Part1 {

    public ArrayList<ArrayList<Integer>> runPart1(ArrayList<ArrayList<Integer>> mInt) {
        double theCount = 0;
        ArrayList<ArrayList<Integer>> lowPoints = new ArrayList<>();
        ArrayList<Integer> coordinates = null;
        for(int a = 0; a<mInt.size();a++){
            if(a == 0){
                for(int b = 0; b<mInt.get(a).size();b++){
                    if(b == 0){
                        if(mInt.get(a).get(b) < mInt.get(a).get(b+1)){
                            if(mInt.get(a).get(b) < mInt.get(a+1).get(b)){
                                theCount += 1+mInt.get(a).get(b);
                                coordinates = new ArrayList<>();
                                coordinates.add(a);
                                coordinates.add(b);
                                coordinates.add(mInt.get(a).get(b));
                                lowPoints.add(coordinates);
                            }
                        }
                    }else if(b == mInt.get(a).size()-1){
                        if(mInt.get(a).get(b) < mInt.get(a).get(b-1)){
                            if(mInt.get(a).get(b) < mInt.get(a+1).get(b)){
                                theCount += 1+mInt.get(a).get(b);
                                coordinates = new ArrayList<>();
                                coordinates.add(a);
                                coordinates.add(b);
                                coordinates.add(mInt.get(a).get(b));
                                lowPoints.add(coordinates);
                            }
                        }
                    }else{
                        if(mInt.get(a).get(b) < mInt.get(a).get(b+1)) {
                            if (mInt.get(a).get(b) < mInt.get(a).get(b - 1)) {
                                if (mInt.get(a).get(b) < mInt.get(a + 1).get(b)) {
                                    theCount += 1 + mInt.get(a).get(b);
                                    coordinates = new ArrayList<>();
                                    coordinates.add(a);
                                    coordinates.add(b);
                                    coordinates.add(mInt.get(a).get(b));
                                    lowPoints.add(coordinates);
                                }
                            }
                        }
                    }
                }
            }else if (a == 99){
                for(int b = 0; b<mInt.get(a).size();b++){
                    if(b == 0){
                        if(mInt.get(a).get(b) < mInt.get(a).get(b+1)){
                            if(mInt.get(a).get(b) < mInt.get(a-1).get(b)){
                                theCount += 1+mInt.get(a).get(b);
                                coordinates = new ArrayList<>();
                                coordinates.add(a);
                                coordinates.add(b);
                                coordinates.add(mInt.get(a).get(b));
                                lowPoints.add(coordinates);
                            }
                        }
                    }else if(b == mInt.get(a).size()-1){
                        theCount = getTheCountTopBottom(mInt, theCount, a, b);
                    }else{
                        if(mInt.get(a).get(b) < mInt.get(a).get(b + 1)) {
                            theCount = getTheCountTopBottom(mInt, theCount, a, b);
                            coordinates = new ArrayList<>();
                            coordinates.add(a);
                            coordinates.add(b);
                            coordinates.add(mInt.get(a).get(b));
                            lowPoints.add(coordinates);
                        }
                    }
                }
            }else {
                for(int b = 0; b<mInt.get(a).size();b++){
                    if(b == 0){
                        if(mInt.get(a).get(b) < mInt.get(a).get(b+1)){
                            if(mInt.get(a).get(b) < mInt.get(a-1).get(b)){
                                if(mInt.get(a).get(b) < mInt.get(a+1).get(b)){
                                    theCount += 1+mInt.get(a).get(b);
                                    coordinates = new ArrayList<>();
                                    coordinates.add(a);
                                    coordinates.add(b);
                                    coordinates.add(mInt.get(a).get(b));
                                    lowPoints.add(coordinates);
                                }
                            }
                        }
                    }else if(b == mInt.get(a).size()-1){
                        theCount = getTheCount(mInt, theCount, a, b);
                        coordinates = new ArrayList<>();
                        coordinates.add(a);
                        coordinates.add(b);
                        coordinates.add(mInt.get(a).get(b));
                        lowPoints.add(coordinates);
                    }else{
                        if(mInt.get(a).get(b) < mInt.get(a).get(b + 1)) {
                            theCount = getTheCount(mInt, theCount, a, b);
                            coordinates = new ArrayList<>();
                            coordinates.add(a);
                            coordinates.add(b);
                            coordinates.add(mInt.get(a).get(b));
                            lowPoints.add(coordinates);
                        }
                    }
                }
            }
        }
        System.out.println(theCount);
        return lowPoints;
    }

    private double getTheCountTopBottom(ArrayList<ArrayList<Integer>> mInt, double theCount, int a, int b) {
        if (mInt.get(a).get(b) < mInt.get(a).get(b - 1)) {
            if (mInt.get(a).get(b) < mInt.get(a - 1).get(b)) {
                theCount += 1 + mInt.get(a).get(b);
            }
        }
        return theCount;
    }

    private double getTheCount(ArrayList<ArrayList<Integer>> mInt, double theCount, int a, int b) {
        if(mInt.get(a).get(b) < mInt.get(a).get(b-1)){
            if(mInt.get(a).get(b) < mInt.get(a-1).get(b)){
                if(mInt.get(a).get(b) < mInt.get(a+1).get(b)){
                    theCount += 1+mInt.get(a).get(b);
                }
            }
        }
        return theCount;
    }
}
