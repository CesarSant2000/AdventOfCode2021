package ec.epn.edu;


import java.util.ArrayList;
import java.util.Collections;

public class Part2 {
    int newCount = 0;
    public ArrayList<Integer> daysGrowth(ArrayList<Integer> part2B, int x, int y) {
        System.out.println(part2B);
        for (int j = x; j < y; j++) {

            for (int i = 0; i < part2B.size(); i++) {
                part2B.set(i, part2B.get(i) - 1);
                if (part2B.get(i) == -1) {
                    part2B.set(i, 6);
                    newCount++;
                }
            }
            if (newCount != 0) {
                for (int l = 0; l < newCount; l++) {
                    part2B.add(8);
                }
                newCount = 0;
            }
        }
        return part2B;
    }

    public void runPart2(ArrayList<Integer> mInt){
        ArrayList<Integer> part2A = new ArrayList<>(mInt);
        long oc1 = Collections.frequency(part2A,1);
        long oc2 = Collections.frequency(part2A,2);
        long oc3 = Collections.frequency(part2A,3);
        long oc4 = Collections.frequency(part2A,4);
        long oc5 = Collections.frequency(part2A,5);
        ArrayList<Integer> o1 = new ArrayList<>();
        o1.add(1);
        ArrayList<Integer> o2 = new ArrayList<>();
        o2.add(2);
        ArrayList<Integer> o3 = new ArrayList<>();
        o3.add(3);
        ArrayList<Integer> o4 = new ArrayList<>();
        o4.add(4);
        ArrayList<Integer> o5 = new ArrayList<>();
        o5.add(5);
        newCount = 0;
        ArrayList<Integer> f1 = daysGrowth(o1,0,199);
        newCount = 0;
        ArrayList<Integer> f2 = daysGrowth(o2,0,199);
        newCount = 0;
        ArrayList<Integer> f3 = daysGrowth(o3,0,199);
        newCount = 0;
        ArrayList<Integer> f4 = daysGrowth(o4,0,199);
        newCount = 0;
        ArrayList<Integer> f5 = daysGrowth(o5,0,199);
        newCount = 0;
        long oc01 = (Collections.frequency(f1,0)*oc1) + (Collections.frequency(f2,0)*oc2) + (Collections.frequency(f3,0)*oc3) + (Collections.frequency(f4,0)*oc4) + (Collections.frequency(f5,0)*oc5);
        long oc11 = (Collections.frequency(f1,1)*oc1) + (Collections.frequency(f2,1)*oc2) + (Collections.frequency(f3,1)*oc3) + (Collections.frequency(f4,1)*oc4) + (Collections.frequency(f5,1)*oc5);
        long oc21 = (Collections.frequency(f1,2)*oc1) + (Collections.frequency(f2,2)*oc2) + (Collections.frequency(f3,2)*oc3) + (Collections.frequency(f4,2)*oc4) + (Collections.frequency(f5,2)*oc5);
        long oc31 = (Collections.frequency(f1,3)*oc1) + (Collections.frequency(f2,3)*oc2) + (Collections.frequency(f3,3)*oc3) + (Collections.frequency(f4,3)*oc4) + (Collections.frequency(f5,3)*oc5);
        long oc41 = (Collections.frequency(f1,4)*oc1) + (Collections.frequency(f2,4)*oc2) + (Collections.frequency(f3,4)*oc3) + (Collections.frequency(f4,4)*oc4) + (Collections.frequency(f5,4)*oc5);
        long oc51 = (Collections.frequency(f1,5)*oc1) + (Collections.frequency(f2,5)*oc2) + (Collections.frequency(f3,5)*oc3) + (Collections.frequency(f4,5)*oc4) + (Collections.frequency(f5,5)*oc5);
        long oc61 = (Collections.frequency(f1,6)*oc1) + (Collections.frequency(f2,6)*oc2) + (Collections.frequency(f3,6)*oc3) + (Collections.frequency(f4,6)*oc4) + (Collections.frequency(f5,6)*oc5);
        long oc71 = (Collections.frequency(f1,7)*oc1) + (Collections.frequency(f2,7)*oc2) + (Collections.frequency(f3,7)*oc3) + (Collections.frequency(f4,7)*oc4) + (Collections.frequency(f5,7)*oc5);
        long oc81 = (Collections.frequency(f1,8)*oc1) + (Collections.frequency(f2,8)*oc2) + (Collections.frequency(f3,8)*oc3) + (Collections.frequency(f4,8)*oc4) + (Collections.frequency(f5,8)*oc5);
        ArrayList<Integer> o0 = new ArrayList<>();
        o0.add(0);
        o1 = new ArrayList<>();
        o1.add(1);
        o2 = new ArrayList<>();
        o2.add(2);
        o3 = new ArrayList<>();
        o3.add(3);
        o4 = new ArrayList<>();
        o4.add(4);
        o5 = new ArrayList<>();
        o5.add(5);
        ArrayList<Integer> o6 = new ArrayList<>();
        o6.add(6);
        ArrayList<Integer> o7 = new ArrayList<>();
        o7.add(7);
        ArrayList<Integer> o8 = new ArrayList<>();
        o8.add(8);
        ArrayList<Integer> f01 = daysGrowth(o0,200,257);
        long mult01 = f01.size()*oc01;
        newCount = 0;
        ArrayList<Integer> f11 = daysGrowth(o1,200,257);
        long mult11 = f11.size()*oc11;
        newCount = 0;
        ArrayList<Integer> f21 = daysGrowth(o2,200,257);
        long mult21 = f21.size()*oc21;
        newCount = 0;
        ArrayList<Integer> f31 = daysGrowth(o3,200,257);
        long mult31 = f31.size()*oc31;
        newCount = 0;
        ArrayList<Integer> f41 = daysGrowth(o4,200,257);
        long mult41 = f41.size()*oc41;
        newCount = 0;
        ArrayList<Integer> f51 = daysGrowth(o5,200,257);
        long mult51 = f51.size()*oc51;
        newCount = 0;
        ArrayList<Integer> f61 = daysGrowth(o6,200,257);
        long mult61 = f61.size()*oc61;
        newCount = 0;
        ArrayList<Integer> f71 = daysGrowth(o7,200,257);
        long mult71 = f71.size()*oc71;
        newCount = 0;
        ArrayList<Integer> f81 = daysGrowth(o8,200,257);
        long mult81 = f81.size()*oc81;
        newCount = 0;
        long multT2 = mult01 + mult11 + mult21 + mult31 + mult41 + mult51 + mult61 + mult71 + mult81;
        System.out.println(multT2);
    }
}
