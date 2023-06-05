import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String choose;
        boolean exit = false;
        StudentManagement studentManagement = new StudentManagement();
        int studentId = 0;

        // show menu
        mainMenu();
        while (true) {
            choose = sc.nextLine();
            if ("1".equals(choose)) {
                studentManagement.addStudent();
            } else if ("2".equals(choose)) {
                studentId = studentManagement.inputId();
                studentManagement.editStudent(studentId);
            } else if ("3".equals(choose)) {
                studentId = studentManagement.inputId();
                studentManagement.deleteStudent(studentId);
            } else if ("4".equals(choose)) {
                studentManagement.searchByName();
            } else if ("5".equals(choose)) {
                studentManagement.searchByID();
            } else if ("6".equals(choose)) {
                studentManagement.show();
            } else if ("0".equals(choose)) {
                System.out.println("GOOD BYE!!! SEE YOU SOON!!!");
                exit = true;
            } else {
                System.out.println("invalid! please choose action in below menu:");
            }
            if (exit) {
                break;
            }
            // show menu
            mainMenu();
        }
    }

    public static void mainMenu() {
        System.out.println("=================   STUDENT MANAGEMENT   ====================");
        System.out.println("1. ADD NEW STUDENT.");
        System.out.println("2. EDIT BY ID OF STUDENT.");
        System.out.println("3. DELETE BY ID OF STUDENT.");
        System.out.println("4. SEARCH BY NAME OF STUDENT.");
        System.out.println("5. SEARCH BY ID OF STUDENT.");
        System.out.println("6. DISPLAY ALL STUDENT.");
        System.out.println("0. EXIT.");
        System.out.println("=============================================================");
        System.out.print("YOUR CHOICE: ");
    }
}
