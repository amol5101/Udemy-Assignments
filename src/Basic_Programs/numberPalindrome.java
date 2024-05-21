package Basic_Programs;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this

import java.util.Scanner;

public class numberPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rev = 0, copy = n;

        while (n > 0){
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }
        if (rev == copy)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }
}
