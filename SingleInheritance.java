class SuperClass
{
    void display()
    {
        System.out.println("Inside super class");
    }
}
class SingleInheritance extends SuperClass
{
    void display2()
    {
        System.out.println("inside subclass function");
    }
    public static void main(String[] args) {
        SingleInheritance s = new SingleInheritance();
        System.out.println("calling super class function using subclass object");
        s.display();
        System.out.println("calling subclass function using subclass object");
        s.display2();
        System.out.println("------------------------------------------------");
        SuperClass sc = new SuperClass();
        System.out.println("calling super class function using super class object");
        sc.display();
        System.out.println("calling sub class function using super class object");
        // sc.display2();
        System.out.println("it will give an error");
    }
}