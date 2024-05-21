package Basic_Programs;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this

import java.math.*;
import java.util.Scanner;

public class ArmstrongNumberOrNot {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 153
        int temp = 0, c = n;


        while (n > 0){
//            int temp = Math.pow((n%10), count);     // Dont use math.pow here because it takes double which make this program little bit complicated
            temp = temp + (n%10)*(n%10)*(n%10);
            n = n / 10;

        }

        if(temp == c)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

    }
}
