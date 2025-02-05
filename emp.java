class EmployeeLab {
    int id;
    String name;
    int salary;

    public EmployeeLab(int newId, String newName, int newSalary) {
        id = newId;
        name = newName;
        salary = newSalary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println(); // Add an empty line for better readability
    }
}

class emp {
    public static void main(String[] args) {
        EmployeeLab e1 = new EmployeeLab(100, "Akash", 200000);
        EmployeeLab e2 = new EmployeeLab(101, "Akshay", 400000);
        EmployeeLab e3 = new EmployeeLab(103, "Abhinav", 700000);

        e1.display();
        e2.display();
        e3.display();
    }
}
