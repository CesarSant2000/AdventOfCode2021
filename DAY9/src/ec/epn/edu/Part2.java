package ec.epn.edu;

import java.util.*;

public class Part2 {
    public Part1 part1 = new Part1();
    int theCount = 0;
    ArrayList<ArrayList<Integer>> theVisited = new ArrayList<>();
    ArrayList<ArrayList<ArrayList<Integer>>> areas = new ArrayList<>();
    ArrayList<Integer> areasSize = new ArrayList<>();

    public void runPart2(ArrayList<ArrayList<Integer>> mInt) {
        ArrayList<ArrayList<Integer>> lowPoints = part1.runPart1(mInt);
        System.out.println(lowPoints);
        for (ArrayList<Integer> coord : lowPoints) {
            ArrayList<ArrayList<Integer>> basin = getTheCount(mInt, coord.get(0), coord.get(1), new ArrayList<>());
            for(int xs = 0; xs< basin.size();xs++){
                int sssss = basin.get(xs).get(0);
                int ddddd = basin.get(xs).get(1);
                if(mInt.get(sssss).get(ddddd) == 9){
                    basin.remove(xs);
                }
            }
            //System.out.println(basin.size());
            areas.add(basin);
            areasSize.add(basin.size());
        }
        //System.out.println(lowPoints.size());
        //System.out.println(areas.size());
        //sortTheBigest();
        int first = Collections.max(areasSize);
        for(int ns = 0; ns<areasSize.size();ns++){
            if(areasSize.get(ns) == first){
                areasSize.remove(ns);
                ns--;
            }
        }
        int second = Collections.max(areasSize);
        for(int ns = 0; ns<areasSize.size();ns++){
            if(areasSize.get(ns) == second){
                areasSize.remove(ns);
                ns--;
            }
        }
        int third = Collections.max(areasSize);
        for(int ns = 0; ns<areasSize.size();ns++){
            if(areasSize.get(ns) == third){
                areasSize.remove(ns);
                ns--;
            }
        }
        System.out.println(first*second*third);
    }

    public void sortTheBigest() {
        int sortedF = 0;
        int sortedS = 0;
        int sortedT = 0;
        for (ArrayList<ArrayList<Integer>> area : areas) {
            if (area.size()  > sortedT) {
                sortedT = area.size();
            }
            if (area.size() > sortedS) {
                int temp = sortedS;
                sortedS = area.size();
                sortedT = temp;
            }
            if (area.size() > sortedF) {
                int temp = sortedF;
                int temp2 = sortedS;
                int temp3 = sortedT;
                sortedF = area.size();
                sortedT = temp2;
                sortedS = temp;
            }
        }

        System.out.println(sortedF);
        System.out.println(sortedS);
        System.out.println(sortedT);
        System.out.println(sortedF * sortedS * sortedT);
    }


    private ArrayList<ArrayList<Integer>> getTheCount(ArrayList<ArrayList<Integer>> mInt, int a, int b, ArrayList<ArrayList<Integer>> ads) {
        if(mInt.get(a).get(b) != 9) {
            ArrayList<Integer> coordenates = new ArrayList<>();
            coordenates.add(a);
            coordenates.add(b);
            ads.add(coordenates);
            theVisited.add(coordenates);
            if (b > 0 && mInt.get(a).get(b - 1) < 9) {
                if (visitedADS(ads, a, b - 1)) {
                        getTheCount(mInt, a, b - 1, ads);

                }
            }
            if (b < 99 && mInt.get(a).get(b + 1) < 9) {
                if (visitedADS(ads, a, b + 1)) {

                        getTheCount(mInt, a, b + 1, ads);

                }
            }

            if (a > 0 && mInt.get(a - 1).get(b) < 9) {
                if (visitedADS(ads, a - 1, b)) {

                        getTheCount(mInt, a - 1, b, ads);

                }
            }
            if (a < 99 && mInt.get(a + 1).get(b) < 9) {
                if (visitedADS(ads, a + 1, b)) {

                        getTheCount(mInt, a + 1, b, ads);

                }
            }
        }

        return ads;
    }

    private boolean visitedTotal(int a, int b) {
        for (ArrayList<Integer> vt : theVisited) {
            if (vt.get(0) == a && vt.get(1) == b) {
                return true;
            }
        }
        return false;
    }

    private boolean visitedADS(ArrayList<ArrayList<Integer>> ads, int a, int b) {
        for (ArrayList<Integer> ad : ads) {
            if (ad.get(0) == a && ad.get(1) == b) {
                return false;
            }
        }
        return true;
    }
}
