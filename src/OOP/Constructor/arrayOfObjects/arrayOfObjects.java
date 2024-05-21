package OOP.Constructor.arrayOfObjects;

class subject{

    // properties
    private String subID;
    private String subName;
    private float maxMarks;
    private float obtainedMarks;

    // constructors
//    subject(String sID, String sName, float maxMarks){
//        subID = sID;
//        subName = sName;
//    }
    subject(String subID, String subName, float maxMarks){
        this.subID = subID;
        this.subName = subName;
        this.maxMarks = maxMarks;
    }

    // getter methods
    String getSubID(){
        return subID;
    }
    String getSubName(){
        return subName;
    }
    float getMaxMarks(){
        return maxMarks;
    }
    float getObtainedMarks(){
        return obtainedMarks;
    }

    // setter methods
    void setMaxMarks(float mMarks){
        maxMarks = mMarks;
    }
    void setObtainedMarks(float obMarks){
        obtainedMarks = obMarks;
    }

    boolean isQualified(float m){
        return m >= obtainedMarks;
    }
    public String toString(){
        return "\nSubject ID : " + subID + "\nSubject Name : " + subName + "\nMarks Obtained : " + obtainedMarks;
    }
}

class student{

    // properties
    private int rollNo;
    private String stuName;
    private String dept;
    private String[] subjects;

    // constructors
    student(int rollNo, String stuName, String dept, String ...subs){
        this.rollNo = rollNo;
        this.stuName = stuName;
        this.dept = dept;
        setSubjects(subs);
    }

    // property methods
    // getter methods
    int getRollNo(){return rollNo;}
    String getStuName(){return stuName;}
    String getDept(){return dept;}
    void getSubjects(){
        for(String str : subjects){
            System.out.println(str);
        }
    }

    // setter methods
    void setSubjects(String ...s){
        for(int i = 0; i < s.length; i++){
            subjects[i] = s[i];
        }
    }
}

public class arrayOfObjects {
    public static void main(String args[]){

        // creating array of objects
        // subject
        subject[] subs = new subject[3];
        subs[0] = new subject("S101", "Data Structure", 100);
        subs[1] = new subject("S102", "Algorithm", 100);
        subs[2] = new subject("S103", "OOP", 100);

        for (subject x : subs) {
            System.out.println(x);
        }

        // student
        student student1 = new student(21, "Amol Ashok Chavan", "Computer", "Data science", "Algorithm");
        student1.getSubjects();
    }
}




