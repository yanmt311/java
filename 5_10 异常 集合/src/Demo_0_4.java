/**
 * 受查异常
 */
class Person implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Demo_0_4 {
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Person person = new Person();
//        Person person1 = (Person) person.clone();
//    }

    public static void main(String[] args) {
        Person person = new Person();
        try {
            Person person1 = (Person) person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
