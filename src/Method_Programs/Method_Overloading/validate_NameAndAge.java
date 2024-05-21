package Method_Programs.Method_Overloading;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this here, so ignore this

import java.util.Scanner;

public class validate_NameAndAge {

    void validate(String name){
        if(name.matches("[A-Za-z\\s]*"))
            System.out.println("Name is valid!");
        else
            System.out.println("Name is not valid!");
    }

    void validate(int age){

        if(String.valueOf(age).matches("[0-9]*"))
            System.out.println("Age is valid!");
        else
            System.out.println("Age is not valid!");
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name : ");
        String name = sc.nextLine();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        validate_NameAndAge obj = new validate_NameAndAge();

        obj.validate(name);
        obj.validate(age);

    }

}
