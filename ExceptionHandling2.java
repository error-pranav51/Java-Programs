class ExceptionHandling2{
    public static void main(String[] args) {
        try {
            System.out.println("before first try block");
            try {
                System.out.println("going to divide by zero");
                int n = 39/0;
            } catch (ArithmeticException ae) {
                //TODO: handle exception
                System.out.println("handling error :- "+ae);
            }
            System.out.println("After first try block");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("main catch block");
        }
        System.out.println("Normal block");
    }
}