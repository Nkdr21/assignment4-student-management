import java.util.UUID;

public class Student {
    private String name;
    private UUID id;
    private String major;
    private double gpa;
    private int credits;

    public Student(String name, UUID id,String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    public String getName() {
        return name;
    }
    public UUID getId() {
        return id;
    }
    public String getMajor() {
        return major;
    }
    public double getGpa() {
        return gpa;
    }
    public int getCredits() {
        return credits;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(UUID id){
        this.id = id;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void updateGPA(double newGPA){
        this.gpa = newGPA;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }

    public void addCredits(int credits){
        this.credits += credits;
    }

    public boolean isHonors(){
        if(gpa >= 3.5){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Student{name='" + name +
                "' id=" + id +
                " major=" + major +
                " GPA=" + gpa +
                " credits=" + credits +
                "}";
    }
}
