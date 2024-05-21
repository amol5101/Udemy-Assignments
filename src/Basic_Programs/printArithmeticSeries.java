package Basic_Programs;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this

// Arithmetic progression series
// take a ( first term ), d ( difference ), n ( number of terms ) and print the AP Series

import java.util.Scanner;

public class printArithmeticSeries {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a, d and n : ");
        int a = sc.nextInt();   // First term
        int d = sc.nextInt();   // difference
        int n = sc.nextInt();   // number of terms

        int term = a;

        for (int i = 0; i < n; i++){
            System.out.print(term+" ");
            term = term + d;
        }

    }
}
