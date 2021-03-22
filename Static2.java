class Static2 {
    static int x = 10;
    
    static void change(){
        x = 20;
    }

    public static void main(String[] args) {
        System.out.println("value of x before calling static method :- "+x);
        change();
        System.out.println("value of x after calling static method :- "+x);
    }
}
