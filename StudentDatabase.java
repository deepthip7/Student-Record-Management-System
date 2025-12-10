import java.util.ArrayList;

public class StudentDatabase {
    private ArrayList<Student> students;

    public StudentDatabase() {
        students = new ArrayList<>();
    }

    public boolean addStudent(Student s) {
        if (getStudentByRoll(s.getRoll()) != null) {
            return false; // Student with same roll exists
        }
        students.add(s);
        return true;
    }

    public Student getStudentByRoll(int roll) {
        for (Student s : students) {
            if (s.getRoll() == roll) return s;
        }
        return null;
    }

    public boolean updateStudent(int roll, String name, int marks, String club) {
        Student s = getStudentByRoll(roll);
        if (s != null) {
            s.setName(name);
            s.setMarks(marks);
            s.setClub(club);
            return true;
        }
        return false;
    }

    public boolean deleteStudent(int roll) {
        Student s = getStudentByRoll(roll);
        if (s != null) {
            students.remove(s);
            return true;
        }
        return false;
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }
}
