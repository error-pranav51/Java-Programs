class Thread2 implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String[] args) {
        Thread2 obj = new Thread2();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}