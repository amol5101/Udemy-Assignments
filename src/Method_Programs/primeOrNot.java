package Method_Programs;    // this is just for created folder, this idiot IDE is considering
                            // it as package, so thats why I need to include this here

import java.util.Scanner;

public class primeOrNot {

    boolean isPrime(int a){
//        int flag = 0;

        for(int i = 2; i < a; i++){
            if(a % i == 0){
//                flag++;
//                return flag;
                return false;
            }
        }
//        return flag;
        return true;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        primeOrNot obj = new primeOrNot();

//        if(obj.prime(n) == 0)
        if(obj.isPrime(n))
            System.out.println(n + " is prime number.");
        else
            System.out.println(n + " is not a prime number.");



    }

}
