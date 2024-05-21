package Basic_Programs;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this

import java.util.Scanner;

public class countDigitsOfNumber {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // 4321
        int count = 0;

        while (n > 0){

            n = n / 10;
            count++;

        }
        System.out.println(count);
    }
}
