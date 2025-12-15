import javax.swing.plaf.SpinnerUI;

public class Course {
    private String courseName;
    private String instructor;
    private Student[] students;

    public Course(String courseName,String instructor,int size) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[size];
    }

    public void addStudent(Student student,int  index ){
        students[index] = student;
    }
    public double courseAverageGPA(){
        double avg = 0.0;
        for (int i = 0;i < students.length;i++){
            avg += students[i].getGpa();
        }
        return avg/students.length;
    }

    public Student highestCreditStudent() {
        int max = 0;
        Student student = students[0];
        for(int i  = 0;i < students.length;i++) {
            if (students[i].getCredits() > max) {
                max = students[i].getCredits();
                student = students[i];
            }
        }
        return student;
    }

    public String toString(){
        return "Course{name='"  + courseName +
                "' Instructor='" + instructor +
                "' Students=" + students +
                "}";
    }
}
