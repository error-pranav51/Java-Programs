class Address{
    String city;
    int pincode;

    Address(String newCity, int newPincode){
        this.city = newCity;
        this.pincode = newPincode;
    }
}

class Student{
    int id;
    String name;
    Address address;

    Student(int newId, String newName, Address newAddress){
        this.id = newId;
        this.name = newName;
        this.address = newAddress;
    }

    void display(){
        System.out.println("Student ID :- "+id+" Student Name :- "+name);
        System.out.println("City :- "+address.city+" has pincode :- "+address.pincode);
    }
}

class Aggregation{

    public static void main(String[] args) {
        Address a1 = new Address("Pimpri", 411017);
        Address a2 = new Address("Chinchwad", 411018);

        Student s1 = new Student(11, "tony", a1);
        Student s2 = new Student(12, "stark", a2);

        s1.display();
        s2.display();
    }
}