package Variable_Arguments;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this here, so ignore this

// Calculate the discount using variable arguments
 /*
we need to write the method that will take the price list of the items purchased by the customer and
will return the total discount amount based on the total price of the items
0 - 500     : 10 % dicount
500 - 1000  : 15 % dicount
1000 +      : 20 % dicount
  */

public class calculateDiscountUsingVarargs {

    static double discount(int ...a){
        double total_amount = 0, discounted_amount = 0;

        for (double x : a){
            total_amount = total_amount + x;
        }

        if(total_amount > 0 && total_amount < 500)
            discounted_amount = total_amount * 0.1;

        else if (total_amount >= 500 && total_amount < 1000)
            discounted_amount = total_amount * 0.15;

        else if (total_amount >= 1000)
            discounted_amount = total_amount * 0.20;

        System.out.println("Total discount you get is : ");
        return discounted_amount;
    }

    public static void main(String args[]){

        System.out.println(discount(20,30,500,50));
        System.out.println(discount(300,400,500));
        System.out.println(discount(200));

    }

}
