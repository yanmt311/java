import java.util.ArrayList;
import java.util.List;
/**
 * 有若干学生（学生对象放在一个List中，每个学生有一个姓名（String），班级（String）
 * 、和考试成绩属性（double）。）
 * 某次考试结束后，每个学生都获得一个考试成绩，遍历list集合，并把所有对象的属性打印出来
 */
class Student{
    private String name;
    private String classes;
    private double score;

    public Student(String name, String classes, double score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}
public class Demo_1 {
    public static void main(String[] args) {
        Student student = new Student("张三","1班",11.2);
        Student student1 = new Student("李四","2班",99.9);

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        System.out.println(list);

    }
}
