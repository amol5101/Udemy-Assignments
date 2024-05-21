package Arrays.Multidimensional_Arrary;         // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this

/*

Student Challenge:
Add 2 matrices

 */

public class matrixAddition {
    public static void main(String args[]){

        int[][] a = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int[][] b = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};
        int[][] c =new int[3][3];       // here in this array we will store the a+b

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){

                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Addition of A & B is : ");
        for (int x[]: c){
            for (int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }



    }
}
