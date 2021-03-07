 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder s = new StringBuilder(); 
        for (int j = 1; j <= tableSize; j++ ) {
            for(int i = 1; i <= tableSize; i++) {
                if (i < tableSize && i*j < 10) { 
                    s.append("  " + i*j + " |"); 
                } else if (i < tableSize && i*j >= 10 && i*j < 100) {
                    s.append(" " + i*j + " |"); 
                } else if (i < tableSize && i*j >= 100) {
                    s.append(i*j + " |"); 
                } else if (i == tableSize && i*j < 10) {
                    s.append("  " + i*j + " |\n"); 
                } else if (i == tableSize && i*j >= 10 && i*j < 100) {
                    s.append(" " + i*j + " |\n");
                } else if (i == tableSize && i*j >= 100) {
                    s.append(i*j + " |\n");
                }
            }
        }
        
        return String.valueOf(s);
    }
    
}
