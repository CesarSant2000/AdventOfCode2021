package advent.code;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesar J. Santacruz
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> mInt = getIntArray();
        part1(mInt);
        part2(mInt);
    }
    public static ArrayList<Integer> getIntArray(){
        List<String> measurements = null;
        ArrayList<Integer> mInt = new ArrayList<>();
        try {
            measurements = Files.readAllLines(Paths.get(System.getProperty("user.home"),"OneDrive","Documentos","NetBeansProjects","DAY1","src","advent","code","input.txt"),StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Existe una excepcion de IO");
        }
        for(String measurement : measurements){
            mInt.add(Integer.valueOf(measurement));
        }
        return mInt;
    }
    public static void part1 (ArrayList<Integer> mInt){
        int count = 0;
        for(int i = 1;i<mInt.size();i++){
            if(mInt.get(i) > mInt.get(i-1)){
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static void part2 (ArrayList<Integer> mInt){
        int count = 0;
        for(int i = 1;i<mInt.size()-2;i++){
            int sumPThree = mInt.get(i-1) + mInt.get(i) + mInt.get(i+1);
            int sumAThree = mInt.get(i) + mInt.get(i+1) + mInt.get(i+2);
            if(sumAThree > sumPThree){
                count++;
            }
        }
        System.out.println(count);
    }
}
