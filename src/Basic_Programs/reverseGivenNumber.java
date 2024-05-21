package Basic_Programs;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this

import java.util.Scanner;

public class reverseGivenNumber {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rev = 0;

        while (n > 0){
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }
        System.out.println(rev);
    }
}
