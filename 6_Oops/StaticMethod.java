
public class StaticMethod {
    public static void main(String[] args) {
        Student s1 = new Student();  //object
        s1.schoolName = "Apna Collage";

        Student s2 = new Student();
        System.out.println(s2.schoolName);     

        Student s3 = new Student();
        s3.schoolName = "DCA Collage";
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}