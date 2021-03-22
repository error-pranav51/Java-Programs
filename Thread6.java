class Thread6 extends Thread{
    public void run(){
        System.out.println("Name of current thread :- "+Thread.currentThread().getName());
        System.out.println("priority of current thread :- "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Thread6 t1 = new Thread6();
        Thread6 t2 = new Thread6();

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}