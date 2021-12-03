package ec.epn.edu;

import java.util.ArrayList;

public class Part1 {
    private final int[] zeros = new int[12];
    private final int[] ones = new int[12];

    public void runPart1(ArrayList<String> mStr) {
        StringBuilder gammaRate = new StringBuilder();
        StringBuilder epsilonRate = new StringBuilder();
        BinToDouble binToDouble = new BinToDouble();
        for (String s : mStr) {
            for (int j = 0; j < 12; j++) {
                String nChar = String.valueOf(s.charAt(j));
                int nInt = Integer.parseInt(nChar);
                if (nInt == 0) {
                    zeros[j] = zeros[j] + 1;
                } else {
                    ones[j] = ones[j] + 1;
                }
            }
        }
        for (int x = 0; x < 12; x++) {
            if (zeros[x] > ones[x]) {
                gammaRate.append('0');
            } else {
                gammaRate.append('1');
            }
        }
        System.out.println("");
        for (int x = 0; x < 12; x++) {
            if (zeros[x] > ones[x]) {
                epsilonRate.append('1');
            } else {
                epsilonRate.append('0');
            }
        }
        double gammaDouble = binToDouble.getDouble(String.valueOf(gammaRate));
        double epsilonDouble = binToDouble.getDouble(String.valueOf(epsilonRate));
        System.out.println("Gamma Rate: " + gammaDouble);
        System.out.println("Epsilon Rate: " + epsilonDouble);
        System.out.println("Answer 1: " + (gammaDouble*epsilonDouble));
    }
}
