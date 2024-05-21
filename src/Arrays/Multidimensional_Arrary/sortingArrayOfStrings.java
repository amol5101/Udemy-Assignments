package Arrays.Multidimensional_Arrary;         // this is just for created folder, this idiot IDE is considering
                                                // it as package, so thats why I need to include this

/*

Student Challenge :
Sort array of strings

(Note : strings are objects so the array of strings means array of objects.)

 */

public class sortingArrayOfStrings {
    public static void main(String args[]){

        String str[] = new String[5];

        String arr[] = {"java", "python", "pascal", "c", "ada", "basic", "cpp"};    // this is the array of string objects

        java.util.Arrays.sort(arr);     // java.util. is the package in which there is the class named as Arrays
                                        // in this Arrays class there is a method sort which can sort anything

        for ( String x : str){          // printing the string objects using for each loop
            System.out.print(x+" ");
        }

    }
}
