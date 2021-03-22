class Demo{
    static int salary;
    static String name= "Pranav";
}
class Variable{

    static String city = "Pune";

    Variable() {
        int age = 20;
        System.out.println("age = " + age);

    }

    public static void main(String args[]) {
        Demo.salary = 1000;
        System.out.println(Demo.name + " has salary :" + Demo.salary + " and belongs to " + city);
        Variable v = new Variable();
    }
}