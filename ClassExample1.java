class OuterClass{
    private int data = 30;
    class InnerClass{
        void display(){
            System.out.println("Data is :- "+data);
        }
    }
}


class ClassExample1{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}