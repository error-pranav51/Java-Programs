class ExceptionHandling4{
    static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Not valid");
        }
        else{
            System.out.println("welcome to vote");
        }
    }
    public static void main(String[] args) {
        validate(29);
        validate(16);
        System.out.println("rest of code");
    }
}