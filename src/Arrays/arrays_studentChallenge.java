
package Arrays;         // this is just for created folder, this idiot IDE is considering
                        // it as package, so thats why I need to include this
/*
Student Challenge :
 */
import java.util.Scanner;

public class arrays_studentChallenge {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

//        int[] array = new int[5];
//        System.out.println("Enter the 5 elements of array : ");
//        for (int i = 0; i < array.length; i++){
//            array[i] = sc.nextInt();
//        }


        // 1. Find sum of all elements

//        int sum = 0;
//        for(int i = 0; i < array.length; i++){
//            sum = sum + array[i];
//        }
//        System.out.println("Sum of an array is : "+ sum);


        // 2. Searching an element

//        System.out.println("Enter the element you want to search : ");
//        int n = sc.nextInt();
//        for(int i = 0; i < array.length; i++){
//            if(n == array[i]) {
//                System.out.println("index of element in array is : " + i);
//                break;
//            }
//            else
//                System.out.println("Element not found!!!");
//        }


        // Finding maximum element from an array.

//        int[] array = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
//        int max = array[0];
//
//        for(int x : array){
//            if(x > max)
//                max = x;
//        }
//        System.out.println("Maximum element in an array is : "+ max);


        // Find the second largest element in an array

//        int[] array = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
//        int max = array[0], max2=0;
//
//        for(int x : array){
//            if(x > max) {
//                max2 = max;
//                max = x;
//            }
//            else if(x > max2){
//                max2 = x;
//            }
//        }
//        System.out.println("Second largest element in an array is : "+ max2);


        // Rotate an array in left direction

//        int[] array = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
//        int temp = array[0];
//        for(int i = 0; i < array.length; i++){
//            if(i < array.length-1)
//                array[i] = array[i+1];
//        }
//        array[(array.length - 1)] = temp;
//        System.out.println("Rotated array is : ");
//        for(int x : array)
//            System.out.print(x+ " ");


        // Rotate an array in right direction

//        int[] array = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
//        int temp = array[array.length-1];
//
//        for(int i = array.length-2; i >=0; i--){
//            array[i+1] = array[i];
//        }
//        array[0] = temp;
//        System.out.println("Rotated array is : ");
//        for(int x : array)
//            System.out.print(x+ " ");


        // Inserting an element at a given index in an array ( some positions are empty in array )

//        int[] array = new int[10];      // [ 5 9 6 10 12 7 _ _ _ _ ]
//        array[0] = 5;
//        array[1] = 9;
//        array[2] = 6;
//        array[3] = 10;
//        array[4] = 12;
//        array[5] = 7;
//
//        System.out.println("Enter the element you want to insert : ");
//        int x = sc.nextInt();       // 15
//        System.out.println("Enter the index at which you want to insert the element : ");
//        int n = sc.nextInt();       // 2
//
//        System.out.println("Before inserting element, array is : ");
//        for(int i : array)
//            System.out.print(i+ " ");
//
//        for(int i = array.length-2; i >= 0; i--){
//            if (i >= n) {
//                array[i + 1] = array[i];
//            }
//        }
//        array[n] = x;
//
//        System.out.println("\n After inserting element, array is : ");
//        for(int i : array)
//            System.out.print(i+ " ");


        // Delete the element present at the given index( in this we need to fill empty space by shifting elements to the left.

//        int[] array = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
//
//        System.out.println("Enter the index of element you want to delete : ");
//        int index = sc.nextInt();   // 2
//
//        System.out.println("Array before deleting the element : ");
//        for(int x : array)
//            System.out.print(x+ " ");
//
//        for (int i = index; i < array.length-1; i++){
//            array[i] = array[i+1];
//        }
//
//        System.out.println("\nArray after deleting the element : ");
//        for(int i = 0; i < array.length-1; i++)
//            System.out.print(array[i]+ " ");


        // Copying an array into another array( cloning an array )

//        int[] array = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
//        int[] array_copy = new int[array.length];
//
//        for (int i = 0; i < array.length; i++){
//
//            array_copy[i] = array[i];
//
//        }
//
//        System.out.println("Original Array is : " );
//        for(int x: array)
//            System.out.print(x+" ");
//
//        System.out.println("\nCopy of the original array is : " );
//        for(int x: array_copy)
//            System.out.print(x+" ");


        // Reverse copying an array into another array

//        int[] array = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
//        int[] rev_array_copy = new int[array.length];
//        int index = 0;
//
////        for (int i = array.length-1; i >= 0; i--){
////
////            rev_array_copy[index] = array[i];
////            index++;
////
////        }
//
//        for (int i = array.length-1, j = 0; i >= 0; i--, j++){      // we can also use this
//
//            rev_array_copy[j] = array[i];
//
//        }
//
//        System.out.println("Original Array is : " );
//        for(int x: array)
//            System.out.print(x+" ");
//
//        System.out.println("\nReverse Copy of the original array is : " );
//        for(int x: rev_array_copy)
//            System.out.print(x+" ");


        // Increasing size of an array

        int[] a = {3, 9, 7, 8, 12};
        int[] b = new int[a.length * 2];

        System.out.println("Length of array A : "+a.length);

        for(int i = 0; i < a.length; i++){
            a[i] = b[i];
        }

        a = b;      // making reference 'a' to refer the increased size array object
                    // now the original array will be unrefered then it will be garbage collected (i.e. it will be removed by garbage collection)

        b = null;   // we are making reference b = null, because both a & b were refering the same array object

        System.out.println("Length of array A : "+a.length);



    }
}





