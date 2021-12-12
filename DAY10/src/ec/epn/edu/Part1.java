package ec.epn.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Part1 {
    ArrayList<String> f1 = null;
    ArrayList<Integer> f2 = new ArrayList<>();
    int theTotal = 0;
    ArrayList<String> opens = new ArrayList<>(Arrays.asList("(", "[", "{", "<"));

    public ArrayList<Integer> runPart1(ArrayList<ArrayList<String>> mString) {
        for (int a = 0; a < mString.size(); a++) {
            f1 = new ArrayList<>();
            executeLine(mString, a);
        }
        System.out.println(theTotal);
        return f2;
    }

    public void executeLine(ArrayList<ArrayList<String>> mString, int a) {
        for (int b = 0; b < mString.get(a).size(); b++) {
            adding(mString.get(a).get(b), a, b);
            if (Objects.equals(mString.get(a).get(b), ")")) {
                String lifo = f1.get(f1.size() - 1);
                f1.remove(f1.size() - 1);
                if (!lifo.equals("(")) {
                    theTotal += 3;
                    f2.add(a);
                    return;
                }
            }
            if (Objects.equals(mString.get(a).get(b), "]")) {
                String lifo = f1.get(f1.size() - 1);
                f1.remove(f1.size() - 1);
                if (!lifo.equals("[")) {
                    theTotal += 57;
                    f2.add(a);
                    return;
                }
            }
            if (Objects.equals(mString.get(a).get(b), "}")) {
                String lifo = f1.get(f1.size() - 1);
                f1.remove(f1.size() - 1);
                if (!lifo.equals("{")) {
                    theTotal += 1197;
                    f2.add(a);
                    return;
                }
            }
            if (Objects.equals(mString.get(a).get(b), ">")) {
                String lifo = f1.get(f1.size() - 1);
                f1.remove(f1.size() - 1);
                if (!lifo.equals("<")) {
                    theTotal += 25137;
                    f2.add(a);
                    return;
                }
            }
        }
    }

    private void adding(String val, int a, int b) {
        for (String open : opens) {
            if (val.equals(open)) {
                f1.add(open);
            }
        }
    }
}
