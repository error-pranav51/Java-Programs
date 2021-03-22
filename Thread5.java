class Thread5 extends Thread{
    public void run(){
        System.out.println("running .....");
    }
    public static void main(String[] args) {
        Thread5 t1 = new Thread5();
        Thread5 t2 = new Thread5();

        System.out.println("name of thread 1 :- "+t1.getName());
        System.out.println("name of thread 2 :- "+t2.getName());
        System.out.println("id of thread 1 :- "+t1.getId());
        System.out.println("id of thread 2 :- "+t2.getId());

        t1.start();
        t2.start();

        t1.setName("Demo thread");
        System.out.println("New name of thread 1 :- "+t1.getName());

        System.out.println("name of main thread :- "+Thread.currentThread().getName());
    }
}