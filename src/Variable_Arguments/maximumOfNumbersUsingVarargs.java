package Variable_Arguments;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this

// Find the maximum of the numbers using variable arguments

public class maximumOfNumbersUsingVarargs {

    int max(int ...x){

        int maximum = x[0];
        for (int i = 0; i < x.length; i++){
            if (maximum < x[i])
                maximum = x[i];
        }

        return maximum;
    }

    public static void main(String args[]){

        maximumOfNumbersUsingVarargs obj = new maximumOfNumbersUsingVarargs();

        System.out.println(obj.max(156,4648,456,646,4,5,312,546));

        System.out.println(obj.max(68,54,75,12,47,89,52,78));

    }
}
