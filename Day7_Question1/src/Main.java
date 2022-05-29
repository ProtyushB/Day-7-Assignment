public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Protyush Banerjee",22,"1234567891","abcd",20000,"Backend","Devolopement");

        emp.printSalary();

        Manager mng = new Manager("Sayan Nath",21,"152364879","efgh",25000,"Frontend","Project Management");

        mng.printSalary();
    }
}
