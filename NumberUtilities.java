


public class NumberUtilities {

    public static String getRange(int stop) {
        StringBuilder s = new StringBuilder(); 
        int i = 0; 
        while (i < stop) {
            s.append(String.valueOf(i)); 
            i++;
        }
        
        String myString = String.valueOf(s); 
        return myString;
    }

    public static String getRange(int start, int stop) {
        StringBuilder s = new StringBuilder(); 
        int i = start; 
        while (i < stop) {
            s.append(String.valueOf(i)); 
            i++;
        }
        
        String myString = String.valueOf(s); 
        return myString;
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder s = new StringBuilder(); 
        int i = start; 
        while (i < stop) {
            s.append(String.valueOf(i)); 
            i += step;
        }
        
        String myString = String.valueOf(s); 
        return myString;
    }

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder s = new StringBuilder(); 
        int i = start; 
        while (i < stop) {
            if (i % 2 == 0) {
                s.append(String.valueOf(i)); 
            }
            i++;
        }
        
        String myString = String.valueOf(s); 
        return myString;
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder s = new StringBuilder(); 
        int i = start; 
        while (i < stop) {
            if (i % 2 != 0) {
                s.append(String.valueOf(i)); 
            }
            i++;
        }
        
        String myString = String.valueOf(s); 
        return myString;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        StringBuilder s = new StringBuilder(); 
        int i = start; 
        int exp = 0; 
        while (i < stop) {
            exp = (int) Math.pow(i, exponent); 
            s.append(String.valueOf(exp)); 
            i++;
        }
        
        String myString = String.valueOf(s); 
        return myString;
    }
}
