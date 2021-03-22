class Static3 {
    static{
        System.out.println("static block calling before main method");
    }    
    public static void main(String[] args) {
        System.out.println("main method");
    }
}
