class Thread7 extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("In Daemon Thread");
        }
        else{
            System.out.println("In User Thread");
        }
    }
    public static void main(String[] args) {
        Thread7 t1 = new Thread7();
        Thread7 t2 = new Thread7();
        Thread7 t3 = new Thread7();

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}