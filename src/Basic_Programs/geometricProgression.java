package Basic_Programs;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this

import java.util.Scanner;

public class geometricProgression {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   //  First term
        int r = sc.nextInt();   //  Ratio
        int n = sc.nextInt();   //  Number of terms

        int term = a;

        for (int i = 0; i < n; i++){
            System.out.println(term);
            term = term * r;
        }

    }
}
