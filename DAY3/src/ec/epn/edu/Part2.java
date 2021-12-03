package ec.epn.edu;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class Part2 {
    private int bitCountZeros = 0;
    private int bitCountOnes = 0;
    private double result = 0;

    public void runPart2(ArrayList<String> inputStrAr) {
        System.out.println();
        ArrayList<String> strAr1 = new ArrayList<>(inputStrAr);
        ArrayList<String> strAr2 = new ArrayList<>(inputStrAr);
        Iterator<String> iteratorOxygen = strAr1.iterator();
        Iterator<String> iteratorScrubber = strAr2.iterator();
        getOxygen(strAr1, iteratorOxygen);
        countsToZero();
        getCO2(strAr2, iteratorScrubber);
        System.out.println("Answer 2: " + result);
    }

    public void getOxygen(ArrayList<String> strAr1, Iterator<String> iteratorOxygen) {
        for (int i = 0; i < 12; i++) {
            for (String s : strAr1) {
                int nInt = Integer.parseInt(String.valueOf(s.charAt(i)));
                if (nInt == 0) {
                    bitCountZeros += 1;
                } else {
                    bitCountOnes += 1;
                }
            }
            if (bitCountZeros > bitCountOnes) {
                iteratorHasNext(i, iteratorOxygen, strAr1, "1", false);
                iteratorOxygen = strAr1.iterator();

            } else if (bitCountOnes > bitCountZeros) {
                iteratorHasNext(i, iteratorOxygen, strAr1, "0", false);
                iteratorOxygen = strAr1.iterator();
            } else {
                iteratorHasNext(i, iteratorOxygen, strAr1, "0", false);
                iteratorOxygen = strAr1.iterator();
            }
            countsToZero();
        }
    }

    public void getCO2(ArrayList<String> strAr2, Iterator<String> iteratorScrubber) {
        for (int i = 0; i < 12; i++) {
            for (String s : strAr2) {
                int nInt = Integer.parseInt(String.valueOf(s.charAt(i)));
                if (nInt == 0) {
                    bitCountZeros += 1;
                } else {
                    bitCountOnes += 1;
                }
            }
            if (bitCountZeros > bitCountOnes) {
                iteratorHasNext(i, iteratorScrubber, strAr2, "0", true);
                iteratorScrubber = strAr2.iterator();
            } else if (bitCountOnes > bitCountZeros) {
                iteratorHasNext(i, iteratorScrubber, strAr2, "1", true);
                iteratorScrubber = strAr2.iterator();
            } else {
                iteratorHasNext(i, iteratorScrubber, strAr2, "1", true);
                iteratorScrubber = strAr2.iterator();
            }
            countsToZero();
        }
    }

    public void countsToZero() {
        this.bitCountZeros = 0;
        this.bitCountOnes = 0;
    }

    public void iteratorHasNext(int pos, @NotNull Iterator<String> iterator, ArrayList<String> strAr, String value, boolean bool) {
        BinToDouble binToDouble = new BinToDouble();
        while (iterator.hasNext()) {
            if (String.valueOf(iterator.next().charAt(pos)).contains(value)) {
                iterator.remove();
            }
            if (strAr.size() == 1) {
                if (bool) {
                    System.out.println("CO2 Scrubber: " + binToDouble.getDouble(strAr.get(0)));
                    result = result * binToDouble.getDouble(strAr.get(0));
                } else {
                    System.out.println("Oxygen Scrubber: " + binToDouble.getDouble(strAr.get(0)));
                    result = binToDouble.getDouble(strAr.get(0));
                }
                break;
            }
        }
    }
}
