package Basic_Programs;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this

// Fibonacci Series
// take inputs a, b and number of terms

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a(first term), b(second term) and n(number of terms) : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        System.out.print(a+" "+b+" ");

        for (int i = 0; i <= n; i++){
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp+" ");
        }

    }
}
