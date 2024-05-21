package Arrays.Multidimensional_Arrary;         // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this

/*

Student Challenge:
Matrix multiplication

 */

public class matrixMultiplication {
    public static void main(String args[]){

        int[][] a = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int[][] b = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};      // identical matrix
        int[][] c =new int[3][3];       // here in this array we will store the a*b

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                for (int k = 0; k < a.length; k++){

                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                }
                System.out.print( c[i][j] + " " );
            }
            System.out.println();
        }

    }
}
