public class Student {
    private int roll;
    private String name;
    private int marks;
    private String club; // New field

    public Student(int roll, String name, int marks, String club) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.club = club;
    }

    // Getters and setters
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
