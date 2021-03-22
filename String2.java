class String2{
    public static void main(String[] args) {
        String s1 = "Pranav";
        String s2 = new String("C++ is programming language");

        System.out.println("to uppercase :- "+s1.toUpperCase());

        System.out.println("to lowercase :- "+s1.toLowerCase());

        System.out.println("check s1 starts with Pr :- "+s1.startsWith("Pr"));

        System.out.println("check s1 ends with av :- "+s1.endsWith("av"));

        System.out.println("return character at index 3 :- "+s1.charAt(3));

        System.out.println("length of s1 :- "+s1.length());

        System.out.println("s2 before replace :- "+s2);

        System.out.println("s2 after replacing c++ with java :- "+s2.replace("C++","Java"));

        

    }
}