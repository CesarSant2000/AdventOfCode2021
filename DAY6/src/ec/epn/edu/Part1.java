package ec.epn.edu;

import java.util.ArrayList;

public class Part1 {
    int newCount = 0;
    public void runPart1(ArrayList<Integer> mInt) {
        ArrayList<Integer> part1A = new ArrayList<>(mInt);
        System.out.println(part1A);
        for (int j = 0; j < 81; j++) {
            if(newCount!=0){
                for(int l = 0; l<newCount;l++){
                    part1A.add(8);
                }
                newCount = 0;
            }
            for (int i = 0; i < part1A.size(); i++) {
                part1A.set(i, part1A.get(i) - 1);
                if(part1A.get(i) == -1){
                    part1A.set(i, 6);
                    newCount++;
                }
            }
        }
        System.out.println(part1A.size());
    }
}
