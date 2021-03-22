class BlockInstance {

    BlockInstance(){
        System.out.println("Inside constructor");
    }

    {
        System.out.println("Inside Instance initializer block");
    }    
    public static void main(String[] args) {
        System.out.println("inside main method  -- before constructor");
        BlockInstance obj = new BlockInstance();
        System.out.println("inside main method  -- after constructor");
    }
}
