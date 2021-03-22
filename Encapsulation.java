class Demo{
    private int id;
    private String name;
    private long salary;
    
    public int getId(){
        return id;
    }
    public void setId(int newId){
        this.id = newId;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public long getSalary(){
        return salary;
    }
    public void setSalary(long newSalary){
        this.salary = newSalary;
    }
}

class Encapsulation{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.setId(10);
        obj.setName("pranav");
        obj.setSalary(10000);

        System.out.println("Id :- "+obj.getId());
        System.out.println("Name :- "+obj.getName());
        System.out.println("Salary :- "+obj.getSalary());
    }
}
