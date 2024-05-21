package Method_Programs;    // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this here. so ignore this

public class maximumElementOfAnArray {

    int maximum(int x[]){

        int max = x[0];
        for (int i = 0; i < x.length; i++){
            if(max < x[i])
                max = x[i];
        }

        return  max;
    }

    public static void main(String args[]){

        int array[] = {8,3,15,9,7};

        maximumElementOfAnArray obj = new maximumElementOfAnArray();

        System.out.println(obj.maximum(array));     // passing array object

    }
}
