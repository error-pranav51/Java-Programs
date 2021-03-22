class Bank{
    int getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class HDFC extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}

class ICICI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}

class MethodOverridding {
    public static void main(String[] args) {
        SBI obj1 = new SBI();
        HDFC obj2 = new HDFC();
        ICICI obj3 = new ICICI();

        System.out.println("rate of interest in SBI :- "+obj1.getRateOfInterest());
        System.out.println("rate of interest in HDFC :- "+obj2.getRateOfInterest());
        System.out.println("rate of interest in ICICI :- "+obj3.getRateOfInterest());

    }
}
