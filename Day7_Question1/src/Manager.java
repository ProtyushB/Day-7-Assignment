public class Manager extends Member{
    String specialisation;
    String department;

    public Manager(String name, int age, String phone_number, String address, double salary, String specialisation, String department) {
        super(name, age, phone_number, address, salary);
        this.specialisation=specialisation;
        this.department=department;
    }
}
