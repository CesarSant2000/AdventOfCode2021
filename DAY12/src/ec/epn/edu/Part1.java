package ec.epn.edu;

import java.lang.reflect.Array;
import java.util.*;

public class Part1 {

    ArrayList<ArrayList<String>> theRoutes = new ArrayList<>();
    ArrayList<ArrayList<String>> pointsList = null;

    public void runPart1(ArrayList<ArrayList<String>> mInt) {
        System.out.println(mInt);
        ArrayList<ArrayList<String>> routes = new ArrayList<>();
        pointsList = getPoints(mInt);
        nextPoint(new ArrayList<>(List.of("start")));
        System.out.println(theRoutes);
        System.out.println("start: " + pointsList.get(0));
        System.out.println("op: " + pointsList.get(1));
        System.out.println("PF: " + pointsList.get(2));
        System.out.println("zh: " + pointsList.get(3));
        System.out.println("bj: " + pointsList.get(4));
        System.out.println("iw: " + pointsList.get(5));
        System.out.println("LY: " + pointsList.get(6));
        System.out.println("da: " + pointsList.get(7));
        System.out.println("HR: " + pointsList.get(8));
        System.out.println("QR: " + pointsList.get(9));
        System.out.println("al: " + pointsList.get(10));
        System.out.println("end: " + pointsList.get(11));
    }

    private ArrayList<ArrayList<String>> getPoints(ArrayList<ArrayList<String>> mInt) {
        ArrayList<ArrayList<String>> pointsList = new ArrayList<>();
        ArrayList<String> cStart = new ArrayList<>();
        ArrayList<String> cop = new ArrayList<>();
        ArrayList<String> cPF = new ArrayList<>();
        ArrayList<String> czh = new ArrayList<>();
        ArrayList<String> cbj = new ArrayList<>();
        ArrayList<String> ciw = new ArrayList<>();
        ArrayList<String> cLY = new ArrayList<>();
        ArrayList<String> cda = new ArrayList<>();
        ArrayList<String> cHR = new ArrayList<>();
        ArrayList<String> cQR = new ArrayList<>();
        ArrayList<String> cal = new ArrayList<>();
        ArrayList<String> cEnd = new ArrayList<>();

        for (ArrayList<String> strings : mInt) {
            if (strings.get(0).equals("start")) {
                cStart.add(strings.get(1));
            }
            if (strings.get(1).equals("start")) {
                cStart.add(strings.get(0));
            }
            if (strings.get(0).equals("QR")) {
                cQR.add(strings.get(1));
            }
            if (strings.get(1).equals("QR")) {
                cQR.add(strings.get(0));
            }
            if (strings.get(0).equals("da")) {
                cda.add(strings.get(1));
            }
            if (strings.get(1).equals("da")) {
                cda.add(strings.get(0));
            }
            if (strings.get(0).equals("end")) {
                cEnd.add(strings.get(1));
            }
            if (strings.get(1).equals("end")) {
                cEnd.add(strings.get(0));
            }
            if (strings.get(0).equals("al")) {
                cal.add(strings.get(1));
            }
            if (strings.get(1).equals("al")) {
                cal.add(strings.get(0));
            }
            if (strings.get(0).equals("op")) {
                cop.add(strings.get(1));
            }
            if (strings.get(1).equals("op")) {
                cop.add(strings.get(0));
            }
            if (strings.get(0).equals("zh")) {
                czh.add(strings.get(1));
            }
            if (strings.get(1).equals("zh")) {
                czh.add(strings.get(0));
            }
            if (strings.get(0).equals("iw")) {
                ciw.add(strings.get(1));
            }
            if (strings.get(1).equals("iw")) {
                ciw.add(strings.get(0));
            }
            if (strings.get(0).equals("PF")) {
                cPF.add(strings.get(1));
            }
            if (strings.get(1).equals("PF")) {
                cPF.add(strings.get(0));
            }
            if (strings.get(0).equals("bj")) {
                cbj.add(strings.get(1));
            }
            if (strings.get(1).equals("bj")) {
                cbj.add(strings.get(0));
            }
            if (strings.get(0).equals("LY")) {
                cLY.add(strings.get(1));
            }
            if (strings.get(1).equals("LY")) {
                cLY.add(strings.get(0));
            }
            if (strings.get(0).equals("HR")) {
                cHR.add(strings.get(1));
            }
            if (strings.get(1).equals("HR")) {
                cHR.add(strings.get(0));
            }
        }
        pointsList.add(cStart);
        pointsList.add(cop);
        pointsList.add(cPF);
        pointsList.add(czh);
        pointsList.add(cbj);
        pointsList.add(ciw);
        pointsList.add(cLY);
        pointsList.add(cda);
        pointsList.add(cHR);
        pointsList.add(cQR);
        pointsList.add(cal);
        pointsList.add(cEnd);
        return pointsList;
    }

    public void nextPoint(ArrayList<String> currentPoint) {
        String current = currentPoint.get(currentPoint.size() - 1);
        ArrayList<String> currentOpt = getCurrentOpt(current);

        if (current.equals("end")) {
            theRoutes.add(currentPoint);
            //System.out.println("aded");
            return;
        } else {
            for (int a = 0; a < currentOpt.size(); a++) {
                String cuOp = currentOpt.get(a);
                //System.out.println(cuOp);
                String cuOpL = currentOpt.get(a).toLowerCase();
                //System.out.println(cuOpL);
                if ((cuOp.equals(cuOpL) && currentPoint.contains(cuOp)) || cuOp.equals("start")) {
                } else {
                    //System.out.println("anadido " + pointsList.get(currentOpt).get(a));
                    ArrayList<String> newPoint = currentPoint;
                    newPoint.add(currentOpt.get(a));
                    nextPoint(newPoint);
                }
            }
        }
        return;
    }

    public ArrayList<String> getCurrentOpt(String current) {
        return switch (current) {
            case "start" -> pointsList.get(0);
            case "op" -> pointsList.get(1);
            case "PF" -> pointsList.get(2);
            case "zh" -> pointsList.get(3);
            case "bj" -> pointsList.get(4);
            case "iw" -> pointsList.get(5);
            case "LY" -> pointsList.get(6);
            case "da" -> pointsList.get(7);
            case "HR" -> pointsList.get(8);
            case "QR" -> pointsList.get(9);
            case "al" -> pointsList.get(10);
            case "end" -> pointsList.get(11);
            default -> new ArrayList<>();
        };
    }
}
