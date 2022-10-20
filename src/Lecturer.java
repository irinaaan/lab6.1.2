public class Lecturer implements Person {
    private String surname;
    private String name;
    private int age;
    private String department;
    private int payment;

    public Lecturer(String surname, String name, int age, String department, int payment) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.department = department;
        this.payment = payment;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getDepartment() {
        return department;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getPayment() {
        return payment;
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
        System.out.println("Lecturer's name and surname: " + getName() + " " + getSurname() + ". Age: " + getAge() + ". Department: " + getDepartment() + ". Payment: " + getPayment());
    }
}