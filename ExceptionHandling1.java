class ExceptionHandling1{
    public static void main(String[] args) {
        try {
            int i = 100/0;
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("exception generated is :- "+e);

        }
        System.out.println("rest of code ");
    }
}