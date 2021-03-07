 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder s = new StringBuilder(); 
        for (int i = 0; i < numberOfStars; i++) {
            s.append("*");
        }
        return String.valueOf(s); 
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder s = new StringBuilder(); 
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 1; j <= i + 1; j++) {
            s.append("*");
        }
            s.append("\n"); 
        }
        return String.valueOf(s); 
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
