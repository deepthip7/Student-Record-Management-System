import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDatabase db = new StudentDatabase();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Show All Students");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Club: ");
                    String club = sc.nextLine();
                    if(db.addStudent(new Student(roll, name, marks, club))) {
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Student with this roll already exists!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Roll to edit: ");
                    int editRoll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Marks: ");
                    int newMarks = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Club: ");
                    String newClub = sc.nextLine();
                    if(db.updateStudent(editRoll, newName, newMarks, newClub)) {
                        System.out.println("Student updated successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll to delete: ");
                    int delRoll = sc.nextInt();
                    if(db.deleteStudent(delRoll)) {
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll to search: ");
                    int searchRoll = sc.nextInt();
                    Student s = db.getStudentByRoll(searchRoll);
                    if(s != null) {
                        System.out.println("Roll: " + s.getRoll() + ", Name: " + s.getName() + ", Marks: " + s.getMarks() + ", Club: " + s.getClub());
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5:
                    System.out.println("\nAll Students:");
                    for(Student st : db.getAllStudents()) {
                        System.out.println("Roll: " + st.getRoll() + ", Name: " + st.getName() + ", Marks: " + st.getMarks() + ", Club: " + st.getClub());
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
