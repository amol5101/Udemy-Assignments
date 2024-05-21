package Method_Programs.Method_Overloading;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this here

public class calculateAreas {

    float area(float l, float b){           // for area of rectangle

        return l*b;
    }

    float area(float r){                    // for area of circle

        return (float) (Math.PI*r*r);
    }

    public static void main(String args[]){

        calculateAreas obj = new calculateAreas();

        System.out.println("Area of rectangle is : " +obj.area(5f,9f));
                                        //  this will call the method area which accepts two float values

        System.out.println("Area of Circle is : "+ obj.area(55f));
                            //  this will call the method area which accepts single float value

    }

}
