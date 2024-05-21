package Method_Programs.Method_Overloading;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this here

public class reverse_IntegerOrArray {

    int reverse(int n){     // 123
        int rev = 0;
        while(n > 0){
            rev = (rev*10) + (n % 10);
            n = n /10;
        }
        return rev;
    }

    void reverse(int x[]){      //      2 4 6 8 10
        int rev[] = new int[x.length];
//        int index = 0;
        for (int i = x.length-1, j = 0; i >= 0; i--, j++){
            rev[j] = x[i];
        }

        System.out.println("reversed array is : ");
        for(int j : rev){
            System.out.print(j+" ");
        }
    }

    public static void main(String args[]){

        reverse_IntegerOrArray obj = new reverse_IntegerOrArray();

        System.out.println(obj.reverse(123));

        int array[] = {2,4,6,8,10};
        obj.reverse(array);

    }

}
