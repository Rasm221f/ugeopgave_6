import java.util.ArrayList;

public class Student extends Person{
    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, String courses){
        super(name);
        this.passedCourses = new ArrayList<>();
        passedCourses.add("Java 1.0");

    }
    @Override
    boolean addCourse(String course){
        if(currentCourses.contains(course)){
            return false;
        } else{
            currentCourses.add(course);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "passedCourses=" + passedCourses +
                ", name='" + name + '\'' +
                '}';
    }
}
