import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private int studentID;
    private String studentName;
    private String className;
    private String studentEmail;
    private String studentUniversity;

    public Student(){
    }

    public Student(int studentID,String studentName,String className, String studentEmail, String studentUniversity){
        super();

        this.studentID = studentID;
        this.studentName = studentName;
        this.className = className;
        this.studentEmail = studentEmail;
        this.studentUniversity = studentUniversity;

    }

//    public Student(String studentName, String studentClass, String studentEmail, String studentUniversity) {
//
//    }


    public int getStudentID(){
        return studentID;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getClassName(String s){
        return className;
    }
    public void setClassName(String className){
        this.className = className;
    }

    public String getStudentEmail(String s){
        return studentEmail;
    }
    public void setStudentEmail(String studentEmail){
        this.studentEmail = studentEmail;
    }

    public String getStudentUniversity(String s){
        return studentUniversity;
    }
    public void setStudentUniversity(String studentUniversity){
        this.studentUniversity = studentUniversity;
    }

    public void inputIF(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Student ID: ");
        studentID = sc.nextInt();
        System.out.println("Student Name: ");
        studentName = sc.nextLine();
        System.out.println("Student ClassName: ");
        className = sc.nextLine();
        System.out.println("Student Email: ");
        studentEmail = sc.nextLine();
        System.out.println("Student University: ");
        studentUniversity = sc.nextLine();
    }
    public void outputIF(){
        System.out.println("ID: \n"+studentID);
        System.out.println("Name: \n"+studentName);
        System.out.println("CLass: \n"+className);
        System.out.println("Email: \n"+studentEmail);
        System.out.println("University: \n"+studentUniversity);
    }

    public String getClassName() {
        return className;
    }

    public String getStudentEmail(){
        return studentEmail;
    }

    public String getStudentUniversity(){
        return studentUniversity;
    }
}
