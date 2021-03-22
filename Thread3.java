class Thread3 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(500);
            }catch (Exception e) {
               
                //TODO: handle exception

            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        Thread3 t2 = new Thread3();

        t1.start();
        t2.start();
    }
}