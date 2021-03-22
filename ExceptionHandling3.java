class ExceptionHandling3{
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int i = 60/0;
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Exception occured :- "+e);
        } finally{
            System.out.println("finally block always executes");
        }
        System.out.println("normal flow of code");
    }
}