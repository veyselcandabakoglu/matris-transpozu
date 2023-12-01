import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matris = {
                            {2 , 3 , 4 },
                            {5 , 6 , 4 }
                        };
                       
        System.out.println("Orijinal Matris:");                
        printMatris(matris);  
        
        System.out.println("-------------------------");
        System.out.println("Orijinal Matrisin Transpozu: ");
        printMatris(matrisTranspozu(matris));
                        
    }

    public static int[][] matrisTranspozu(int[][] arr) {
        int rowNumber = arr.length;
        int colNumber = arr[0].length;

        int transpozMatris[][] = new int[colNumber][rowNumber];

        for(int i = 0; i < rowNumber; i++) {
            for(int j = 0; j < colNumber; j++) {
                transpozMatris[j][i] = arr[i][j];
            }
        }

        return transpozMatris;
    }

    public static void printMatris(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
    
}