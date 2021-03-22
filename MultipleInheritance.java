import javax.swing.plaf.synth.SynthSeparatorUI;

class One{
    void display1(){
        System.out.println("inside one");
    }
}
class Two extends One{
    void display2(){
        System.out.println("Inside two");
    }
}
class Three extends Two{
    void display3(){
        System.out.println("Inside three");
    }
}
class MultipleInheritance{
    public static void main(String[] args) {
        Three obj = new Three();
        System.out.println("inside main method of MultipleInheritance class");
        obj.display1();
        obj.display2();
        obj.display3();
    }
}