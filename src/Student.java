public class Student {

    String name;
    Integer age;
    String lastName;
    String email;


    public Student(){
    }

    public Student(String name){
        this(21, "elmar465@gmail.com");
        this.name = name;
    }

    public Student(String name, String lastName){
        this();
        this.name = name;
        this.lastName = lastName;
    }

    public Student(Integer age, String email){
        this();
        System.out.println("Hello i am constructor 3 ");
        this.age =age;
        this.email =email;
    }

    public Student(String name, String lastName, Integer age, String email) {
        this("Elmar");
        this.name = name;
        this.lastName = lastName;
        this.age =age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
