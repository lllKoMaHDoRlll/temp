import java.util.ArrayList;

public class StudentsGroup {
    ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentsGroup() {
        this.students = new ArrayList<Student>();
    }

    void add(Student student) {
        students.add(student);
    }

    void del(String name) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase(name)) {
                index = i;
            }
        }
        if (index != -1) {
            students.remove(index);
        }
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "students=" + students.toString() +
                '}';
    }
}
