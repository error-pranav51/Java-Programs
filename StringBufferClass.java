class StringBufferClass{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("string buffer :- "+sb);

        System.out.println("after appending java at end :- "+sb.append("java"));

        System.out.println("after inserting java at index 5 :- "+sb.insert(5,"java"));

        System.out.println("after deleting chars at 1 to 3 :- "+sb.delete(1,3));

        System.out.println("after reversing string :- "+sb.reverse());

        System.out.println("capacity of buffer :- "+sb.capacity());
    }
}