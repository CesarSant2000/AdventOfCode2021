package ec.epn.edu;

public class BinToDouble {
    public double getDouble(String stringValue){
        double theDouble = 0;
        int j = 0;
        for (int i = 11; i >= 0; i--) {
            if (Integer.parseInt(String.valueOf(stringValue.charAt(i))) == 1) {
                theDouble += Math.pow(2, j);
            }
            j++;
        }
        return theDouble;
    }
}
