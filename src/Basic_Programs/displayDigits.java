package Basic_Programs;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this

import java.util.Scanner;

public class displayDigits {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // 1234

        while (n > 0){

            System.out.println(n % 10);     // 4 3 2 1
            n = n /10;

        }

    }

}
