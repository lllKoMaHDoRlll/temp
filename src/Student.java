import java.util.Arrays;

public class Student {
    String name, address, faculty;
    int grade;
    int[] marks;

    double getAverage () {
        double sum = Arrays.stream(marks).sum();
        return sum / marks.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", faculty='" + faculty + '\'' +
                ", grade=" + grade +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public Student(String name, String address, String faculty, int grade, int[] marks) {
        this.name = name;
        this.address = address;
        this.faculty = faculty;
        this.grade = grade;
        this.marks = marks;
    }
}
