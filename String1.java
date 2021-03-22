class String1{
    public static void main(String[] args) {
        String s = "Pranav";
        s.concat("Thakur");
        System.out.println("String s object :- "+s);
        s=s.concat("Thakur");
        System.out.println("String s object with new reference :- "+s);
    }
}