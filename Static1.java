

class Static1 {

    int a = 0;
    static int b = 0;

    Static1(){
        a++;
        b++;
        System.out.println("value of non- static a :- "+a);
        System.out.println("value of static variable b :- "+b);
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {

        Static1 s1 = new Static1();
        Static1 s2 = new Static1();
        Static1 s3 = new Static1();

    }    
}
