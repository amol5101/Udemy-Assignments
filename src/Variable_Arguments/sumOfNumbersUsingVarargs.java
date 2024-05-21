package Variable_Arguments;     // this is just for created folder, this idiot IDE is considering
// it as package, so that's why I need to include this here, so ignore this

// find sum of numbers using varargs(Variable arguments).

public class sumOfNumbersUsingVarargs {

    static int sumOfNumbers(int ...x){
        int sum = 0;

        for (int a: x){
            sum = sum + a;
        }
        return sum;
    }

    public static void main(String args[]){

        System.out.println("Sum of numbers is : " + sumOfNumbers(2,4,6,8,10,12,14,16,18,20));
        System.out.println("Sum of numbers is : " + sumOfNumbers(1,2,3,4,5,6,7,8,9));

    }

}
