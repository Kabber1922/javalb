package n2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() { return name; }
    public int getCourse() { return course; }

    public double sredball() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades.values()) sum += grade;
        return (double) sum / grades.size();
    }

    public void nanextkyrs() {
        course++;
    }
    
    public static void filterstruddentov(List<Student> students) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.sredball() < 3) {
                it.remove();  
            } else {
                s.nanextkyrs();  
            }
        }
    }
    
    public static void infostudent(List<Student> students, int course) {
        System.out.println("Студенты на " + course + " курсе:");
        boolean found = false;
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println("- " + s.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("  (нету)");
        }
    }

    @Override
    public String toString() {
        return name + " (" + group + ", " + course + " курс, средний балл: " + String.format("%.2f", sredball()) + ")";
    }
}