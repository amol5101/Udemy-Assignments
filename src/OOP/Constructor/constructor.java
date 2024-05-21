package OOP.Constructor;

class cylinder{
    private float height;
    private float radius;

    cylinder(){     //  default / non-parameterized constructor
        height = 0;
        radius = 0;
    }

    cylinder(float h, float r){     // parameterized constructor
//        height = h;
//        radius = r;
        if(h > 0){
        setHeight(h);
        setRadius(r);
        }
        else{
            height = 0;
            radius = 0;
        }
    }

    float getHeight(){
        return height;
    }
    float getRadius(){
        return radius;
    }

    void setHeight(float h) {
        height = h;
    }

    void setRadius(float r) {
        radius = r;
    }

    double volumeCylinder(){
        return Math.PI*radius*radius*height;
    }

}

public class constructor {

    public static void main(String[] args){

        // creating an objects of class cylinder
        cylinder cyl1 = new cylinder();     // as we have not given any parameter, this will call default constructor

        cylinder cyl2 = new cylinder(10,30);    // this will call parameterized constructor
        cylinder cyl3 = new cylinder(-10,-30);    // this will call parameterized constructor

        System.out.println("Volume of Cylinder 1 is : " + cyl1.volumeCylinder());
        System.out.println("Volume of Cylinder 2 is : " + cyl2.volumeCylinder());
        System.out.println("Volume of Cylinder 3 is : " + cyl3.volumeCylinder());


    }
}



