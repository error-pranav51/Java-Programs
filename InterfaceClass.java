import java.io.PrintStream;

interface Printable{
    void print();
}

interface Showable{
    void show();
}

class IntefaceClass implements Showable,Printable{

    void print(){
        OUT.println("inside print");
    }

    void show(){
        OUT.println("inside show");
    }

    public static void main(String[] args) {
        IntefaceClass obj = new IntefaceClass();

        obj.print();
        obj.show();
    }
}