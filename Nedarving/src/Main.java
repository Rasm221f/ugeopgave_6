import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person>persons = new ArrayList<>();
         Person s1 = new Student("Esmeralda", "din far");
         Person s2 = new Student("Bob", "47");
         Person s3 = new Student("Karsten", "1");
         Person t1 = new Teacher("Thea");


        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(t1);
        System.out.println(persons);
        for (Person p: persons){
            p.addCourse("Java 1.0");

        }
    }
}
