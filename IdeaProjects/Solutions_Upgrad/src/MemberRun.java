/*Data members
        1 - Name
        2 - Age
        3 - Phone number
        4 - Address
        5 - Salary
        It also has a method named 'printSalary' which prints the salary of the members.
        Two classes 'Employee' and 'Manager' inherits the 'Member' class.
        The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
        Now, assign name, age, phone number, address and salary to an employee and a manager
        by making an object of both of these classes and print the same.
*/
class Member{
    String name;
    int age;
    int phoneNumber;
    String address;
    double salary;

    public Member(String name, int age, int phone, String address, double wage){
        this.name = name;
        this.age = age;
        this.phoneNumber = phone;
        this.address = address;
        this.salary = wage;

    }

    public void printSalary(){
        System.out.println("Salary amounts to: " + this.salary);
    }
}

class Employee extends Member {
    String type;
    public Employee(String name, int age, int phone, String address, double wage){
        super(name, age, phone, address, wage);
        this.type = "specialization";

    }
    public void printData(){
        /*System.out.println("Employee's name: " + this.name + "\nEmployee's age: " + this.age "\nEmployee's number: " +
                this.phoneNumber" + \nEmployee's address: " + this.address);

         */
        System.out.println("Employee's name: " + this.name);
        System.out.println("Employee's age: " + this.age);
    }


}

class Manager extends Member{
    String type;
    public Manager(String name, int age, int phone, String address, double wage){
        super(name, age, phone, address, wage);
        this.type = "department";

    }

}


public class MemberRun {
    public static void main(String[] args){
        Member E1 =(Employee) new Employee("Wayne", 34, 34687905, "Madison square 41", 2000);
        E1.printSalary();
        //E1.printData(); why error if I did casting?
        Employee E2 = new Employee("Gord,", 35, 34565437, "Baker street 221", 1980);
        E2.printData();

    }
}
