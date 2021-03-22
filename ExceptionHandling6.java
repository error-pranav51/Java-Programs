class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}

class ExceptionHandling6{
    static void validate(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Not valid");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String[] args) {
        try {
            validate(16);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("exception occured :- "+e);
        }
        System.out.println("rest of code");
    }
}