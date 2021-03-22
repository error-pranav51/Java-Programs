class Bank{
    String name;
    Bank(String newName){
        this.name = newName;
    }
    String getName(){
        return name;
    }
}
class Employee{
    String emp_name;
    Employee(String newEmpName){
        this.emp_name = newEmpName;
    }
    String getEmpName(){
        return emp_name;
    }
}
class Association{
    public static void main(String[] args) {
        Bank b = new Bank("icici");
        Employee e = new Employee("Pranav");
        
        System.out.println(e.getEmpName()+" is from "+b.getName()+" bank.");
    }
}
