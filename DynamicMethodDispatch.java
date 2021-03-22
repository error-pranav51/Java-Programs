class A{
    int x = 10;
    void display(){
        System.out.println("Inside display method of class A");
    }
}
class B extends A{
    int x = 20;
    void display(){
        System.out.println("Inside display method of class B");
    }
}
class DynamicMethodDispatch{
    public static void main(String[] args) {
        System.out.println("calling normally -----------------------------");
        A a1 = new A();
        B b1 = new B();

        a1.display();
        b1.display();


        System.out.println("dynamic method dispatch or upcasting-------------------------");

        A a2 = new B();

        a2.display();  // only methods are overridden in java
        System.out.println(a2.x); // variable are not overridden in java

    }
}