package ec.epn.edu;

import java.util.*;

public class Part2 {
    Part1 part1 = new Part1();
    ArrayList<ArrayList<String>> usePart2 = null;
    ArrayList<Integer> corrupted = null;
    ArrayList<String> f1 = null;
    ArrayList<String> f3 = null;
    ArrayList<Long> f6 = new ArrayList<>();
    ArrayList<String> opens = new ArrayList<>(Arrays.asList("(", "[", "{", "<"));

    public void runPart2(ArrayList<ArrayList<String>> mString) {
        corrupted = part1.runPart1(mString);
        usePart2 = mString;
        for (Integer integer : corrupted) {
            int theInt = integer;
            usePart2.remove(theInt);
            for (int a = 0; a < corrupted.size(); a++) {
                corrupted.set(a, corrupted.get(a) - 1);
            }
        }
        for (int a = 0; a < usePart2.size(); a++) {
            f1 = new ArrayList<>();
            executeLine2(usePart2, a);
            //System.out.println("f1: " + f1);
            executeLine3(f1);
            //System.out.println("f3: " + f3);
        }
        System.out.println(f6);
        Collections.sort(f6);
        System.out.println(f6.get(27));
    }

    private void executeLine3(ArrayList<String> f1) {
        f3 = new ArrayList<>();
        for (int b = f1.size() - 1; b >= 0; b--) {
            if (f1.get(b).equals("(")) {
                f3.add(")");
            }
            if (f1.get(b).equals("[")) {
                f3.add("]");
            }
            if (f1.get(b).equals("{")) {
                f3.add("}");
            }
            if (f1.get(b).equals("<")) {
                f3.add(">");
            }
        }
        long theRowSum = 0;
        for (int c =0; c<f3.size()-1;c++) {
            if (f3.get(c).equals(")")) {
                theRowSum = (theRowSum + 1) * 5;
            }
            if (f3.get(c).equals("]")) {
                theRowSum = (theRowSum + 2) * 5;
            }
            if (f3.get(c).equals("}")) {
                theRowSum = (theRowSum + 3) * 5;
            }
            if (f3.get(c).equals(">")) {
                theRowSum = (theRowSum + 4) * 5;
            }
        }
        if (f3.get(f3.size()-1).equals(")")) {
            theRowSum += 1;
        }
        if (f3.get(f3.size()-1).equals("]")) {
            theRowSum += 2;
        }
        if (f3.get(f3.size()-1).equals("}")) {
            theRowSum += 3;
        }
        if (f3.get(f3.size()-1).equals(">")) {
            theRowSum += 4;
        }
        f6.add(theRowSum);
    }

    private void adding(String val, int a, int b) {
        for (String open : opens) {
            if (val.equals(open)) {
                f1.add(open);
            }
        }
    }

    public void executeLine2(ArrayList<ArrayList<String>> usePart2, int a) {
        for (int b = 0; b < usePart2.get(a).size(); b++) {
            adding(usePart2.get(a).get(b), a, b);
            if (Objects.equals(usePart2.get(a).get(b), ")")) {
                String lifo = f1.get(f1.size() - 1);
                f1.remove(f1.size() - 1);
            }
            if (Objects.equals(usePart2.get(a).get(b), "]")) {
                String lifo = f1.get(f1.size() - 1);
                f1.remove(f1.size() - 1);
            }
            if (Objects.equals(usePart2.get(a).get(b), "}")) {
                String lifo = f1.get(f1.size() - 1);
                f1.remove(f1.size() - 1);
            }
            if (Objects.equals(usePart2.get(a).get(b), ">")) {
                String lifo = f1.get(f1.size() - 1);
                f1.remove(f1.size() - 1);

            }
        }
    }
}
