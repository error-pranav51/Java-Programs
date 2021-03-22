class Sample1 extends Thread{
    public void run(){
        System.out.println("task 1....");
    }
}

class Sample2 extends Thread{
    public void run(){
        System.out.println("task 2....");
    }
}
class Thread8{
    public static void main(String[] args) {
        
    Sample1 s1 = new Sample1();
    Sample2 s2 = new Sample2();

    s1.start();
    s2.start();
}
}