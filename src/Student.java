public class Student implements Person {
    private String surname;
    private String name;
    private int age;
    private int group;
    private int studentID;

    public Student(String surname, String name, int age, int group, int studentID) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.group = group;
        this.studentID = studentID;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getSurname() {
        return surname;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAge(int age) {
        this.age= age;
    }

    int getAge() {
        return age;
    }
    public void printInfo() {
        System.out.println("Student's name and surname: " + getName() + " " + getSurname() + ". Age: " + getAge() + ". Group: " + getGroup() + ". StudentID: " + getStudentID());
    }
}