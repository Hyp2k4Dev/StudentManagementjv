import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

public class StudentManagement{
    Scanner sc = new Scanner(System.in);
    private List<Student>studentList;
    private SaveInfo saveInfo;

    public StudentManagement(){
        saveInfo = new SaveInfo();
        studentList = saveInfo.read();
    }
    public void addStudent(){
//        System.out.println("Please input number in your ID");
//        System.out.println("Input Student ID: ");
//        int id = sc.nextInt();
        int id = 0;
        try {
            id = inputId();
        }catch (InputMismatchException ex){
            System.out.println("Invalid input. Please input again");
            inputId();
        }
        System.out.println("Input Student Name: ");
        String studentName = sc.nextLine();
        System.out.println("Input Student Class: ");
        String studentClass = sc.nextLine();
        System.out.println("Input Student Email: ");
        String studentEmail = sc.nextLine();
        System.out.println("Input Student University: ");
        String studentUniversity = sc.next();

        Student student = new Student(id,studentName,studentClass,studentEmail,studentUniversity);
        studentList.add(student);
        System.out.println("Saving ... success!!!");
        saveInfo.write(studentList);
    }
    public void editStudent(int id){
        boolean isExisted = false;
        int size = studentList.size();
        for (int i = 0; i < size;i++){
            if (studentList.get(i).getStudentID() == id ){
                isExisted = true;
                System.out.println("STUDENT NAME: ");
                studentList.get(i).setStudentName(sc.nextLine());
                System.out.println("STUDENT CLASS NAME: ");
                studentList.get(i).getClassName(sc.nextLine());
                System.out.println("STUDENT EMAIL: ");
                studentList.get(i).getStudentEmail(sc.nextLine());
                System.out.println("STUDENT UNIVERSITY: ");
                studentList.get(i).getStudentUniversity(sc.nextLine());
                System.out.println("Editing ... Success!!!");
                break;
            }
        }
        if (!isExisted){
            System.out.println("ID not existed. \n"+id);
        }else {
            saveInfo.write(studentList);
        }
    }
    public void deleteStudent(int id){
        Student student = null;
        int size = studentList.size();
        for (int i = 0; i < size;i++){
            if (studentList.get(i).getStudentID() == id){
                student = studentList.get(i);
                System.out.println("DELETED!!!");
                break;
            }
        }
        if (student != null){
            studentList.remove(student);
            saveInfo.write(studentList);
        }else {
            System.out.println("ID does not existed \n"+ id);
        }
    }
    public void searchByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        for (Student student : studentList){
            if (student.getStudentName().equals(name)){
                System.out.println("ID: "+student.getStudentID());
                System.out.println("Name: "+student.getStudentName());
                System.out.println("Class name: "+student.getClassName());
                System.out.println("Email: "+student.getStudentEmail());
                System.out.println("University: "+student.getStudentUniversity());
                break;
            }
        }
    }

    public void searchByID(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID: ");
        int id = sc.nextInt();

        for (Student student : studentList){
            if (student.getStudentID()== id){
                System.out.println("ID: "+student.getStudentID());
                System.out.println("Name: "+student.getStudentName());
                System.out.println("Class name: "+student.getClassName());
                System.out.println("Email: "+student.getStudentEmail());
                System.out.println("University: "+student.getStudentUniversity());
                break;
            }
        }
    }

    public int inputId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Id:");
                int inputID = Integer.parseInt(sc.nextLine());
                return inputID;
    }


    public void show() {
        for (Student student : studentList) {
            System.out.println("ID: " + student.getStudentID());
            System.out.println("\nNAME: " + student.getStudentName());
            System.out.println("\nCLASS: " + student.getClassName());
            System.out.println("\nEMAIL: " + student.getStudentEmail());
            System.out.println("\nUNIVERSITY: " + student.getStudentUniversity());
        }
    }
}
