package ec.epn.edu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Universe {
    public int theBiggest = 0;
    public ArrayList<ArrayList<Integer>> getTheUniverse(ArrayList<ArrayList<Integer>> mInt) {
        ArrayList<ArrayList<Integer>> measurements = new ArrayList<>();
        for(int i = 0; i<mInt.size();i++){
            for(int j = 0; j<mInt.get(i).size();j++) {
                if(mInt.get(i).get(j) > theBiggest){
                    theBiggest = mInt.get(i).get(j);
                }
            }
        }
        for(int i = 0; i<theBiggest+1;i++){
            ArrayList<Integer> numbers2 = new ArrayList<>();
            for(int k = 0;k < theBiggest+1;k++){
                numbers2.add(0);
            }
            measurements.add(numbers2);
        }
        return measurements;
    }
}
