public class Member {
    String name;
    int age;
    String phone_number;
    String address;
    double salary;

    public void printSalary(){
        System.out.println(this.salary);
    }

    public Member(String name, int age, String phone_number, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }
}

