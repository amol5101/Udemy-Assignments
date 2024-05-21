package Method_Programs;        // this is just for created folder, this idiot IDE is considering
                                // it as package, so thats why I need to include this here

import java.util.Scanner;
public class GCD_ofTwoNumbers {

    int GCD(int x, int y){

//        for (int i = 0; x != y; i++){       // i should use while loop here, because i don't know how much time I should iterate the loop

        while(x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }

        return x;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();       //  35
        int b = sc.nextInt();       //  56

        GCD_ofTwoNumbers obj = new GCD_ofTwoNumbers();

        System.out.println("GCD of "+ a + " & " + b + " is " + obj.GCD(a,b));

    }
}
