class Constructor
{
    Constructor(){
        System.out.println("Inside Default constructor");
    }
    Constructor(int a, int b)
    {
        int c = a+b;
        System.out.println("Inside parameterized construtor value of c :-"+c );
    }
    public static void main(String[] args) {
        System.out.println("before calling constructor");
        Constructor c1 = new Constructor();
        System.out.println("after calling first constructor");
        Constructor c2 = new Constructor(4,5);
        System.out.println("after calling second constructor");
    }
}