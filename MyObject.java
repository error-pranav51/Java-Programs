class Demo{
    int display(int a, int b)
    {
        int c = a + b;
        return c;
    }
}
class MyObject {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        System.out.println(obj1.display(5, 5));
        Demo obj2 = obj1;
        System.out.println(obj2.display(2, 12));
    }
}
