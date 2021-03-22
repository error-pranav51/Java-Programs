class Thread4 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                //TODO: handle exception
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Thread4 t1 = new Thread4();
        Thread4 t2 = new Thread4();
        Thread4 t3 = new Thread4();
        Thread4 t4 = new Thread4();

        System.out.println("before starting thread 1");
        t1.start();
        try {
            System.out.println("before joining thread 1");
            t1.join();
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println("after joining thread 1");

        System.out.println("before calling thread 2");

        t2.start();

        System.out.println("before calling thread 3");

        t3.start();

        try {
            System.out.println("before joining thread 3");
            t3.join();
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println("after joining thread 3");

        System.out.println("calling thread 4");

        t4.start();
    }
}