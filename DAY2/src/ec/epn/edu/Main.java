package ec.epn.edu;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> mStr = getIntArray();
        System.out.println(mStr);
        //part1(mStr);
        part2(mStr);
    }
    public static ArrayList<String> getIntArray(){
        List<String> measurements = null;
        try {
            Path inputPath = Paths.get("");
            System.out.println(inputPath.toAbsolutePath());
            Path absPath = Paths.get(inputPath.toAbsolutePath().toString(),"src","ec","epn","edu","input.txt");
            measurements = Files.readAllLines(absPath, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Existe una excepcion de IO");
        }
        ArrayList<String> mStr = new ArrayList<>(measurements);
        return mStr;
    }
    public static void part1(ArrayList<String> mStr){
        int horizontal = 0;
        int depth = 0;
        for(int i =0; i<mStr.size(); i++){
            String nnStr = mStr.get(i);
            if(mStr.get(i).contains("down")){
                String amount = nnStr.substring(nnStr.length()-1);
                int nDown = Integer.parseInt(amount);
                depth = depth + nDown;
            }
            if(mStr.get(i).contains("up")){
                String amount = nnStr.substring(nnStr.length()-1);
                int nUp = Integer.parseInt(amount);
                depth = depth - nUp;
            }
            if(mStr.get(i).contains("forward")){
                String amount = nnStr.substring(nnStr.length()-1);
                int nFor = Integer.parseInt(amount);
                horizontal = horizontal + nFor;
            }
            System.out.println(horizontal);
            System.out.println(depth);
        }
        System.out.println(horizontal*depth);
    }
    public static void part2(ArrayList<String> mStr){
        int horizontal = 0;
        int depth = 0;
        int aim = 0;
        for(int i =0; i<mStr.size(); i++){
            String nnStr = mStr.get(i);
            if(mStr.get(i).contains("down")){
                String amount = nnStr.substring(nnStr.length()-1);
                int nDown = Integer.parseInt(amount);
                aim = aim + nDown;
            }
            if(mStr.get(i).contains("up")){
                String amount = nnStr.substring(nnStr.length()-1);
                int nUp = Integer.parseInt(amount);
                aim = aim - nUp;
            }
            if(mStr.get(i).contains("forward")){
                String amount = nnStr.substring(nnStr.length()-1);
                int nFor = Integer.parseInt(amount);
                horizontal = horizontal + nFor;
                depth = depth + (aim * nFor);
            }
        }
        System.out.println(horizontal*depth);
    }
}
