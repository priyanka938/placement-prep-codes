//Write a java program to rotate a n*n matrix in anti-clock wise direction.

// Write a java program to rotate the matrix by k times
// in a clockwise direction using the function
import java.util.Scanner;

public class Matrix{

    // It's the matrix's dimensions
    public static final int M = 3, N = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = {
            {
                32, 33, 34
            }, {
                45, 46, 47
            }, {
                58, 59, 51
            }
        };
        int k = 2;

        System.out.println("-----This is the given matrix before rotation-----\n");
        displayMatrixData(arr);

        // It will rotate matrix by k 
        rotateClockWise(arr, k);

        System.out.println("\n\n------This is the given matrix after rotation " + k + " times------\n");

        // It will display rotated matrix 
        displayMatrixData(arr);
    }

    // It's the driver function
    // to make clockwise rotation 
    public static void rotateClockWise(int[][] arr, int k) {
        int[] temp = new int[M];
        k = k % M;

        for (int i = 0; i<N; i++) {
            for (int t = 0; t<M - k; t++)
                temp[t] = arr[i][t];

            for (int j = M - k; j<M; j++)
                arr[i][j - M + k] = arr[i][j];

            for (int j = k; j<M; j++)
                arr[i][j] = temp[j - k];
        }
    }

    // This will display the matrix 
    public static void displayMatrixData(int[][] arru) {
        for (int i = 0; i<N; i++) {
            System.out.print("\t");
            for (int j = 0; j<M; j++)
                System.out.print(arru[i][j] + "\t");
            System.out.print("\n");
        }
    }
}