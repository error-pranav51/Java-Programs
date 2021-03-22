class LocalInner{
    private int data = 30;
    void display(){
        System.out.println("inside display method");
        class Local{
            void msg(){
                System.out.println("Inside local inner class");
                System.out.println("Data is :- "+data);
            }
        }
        Local l1 = new Local();
        System.out.println("calling msg method of local class");
        l1.msg();
    }
}

class ClassExample2{
    public static void main(String[] args) {
        LocalInner obj = new LocalInner();
        System.out.println("Inside main method calling display method of outer class");
        obj.display();
    }
}