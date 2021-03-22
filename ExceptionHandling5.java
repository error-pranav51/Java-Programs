class ExceptionHandling5{
    void m(){
        int i = 50/0;
        System.out.println(i);
    }
    void n(){
        m();
    }
    void p(){
        try {
            n();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("handling exception");
        }
    }
    public static void main(String[] args) {
        ExceptionHandling5 obj = new ExceptionHandling5();
        obj.p();
        System.out.println("Rest of code");
    }
}