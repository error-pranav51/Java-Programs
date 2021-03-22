public class MethodOverloading {
    int sum(int a, int b){
        return (a + b);
    }
    int sum(int x, int y, int z){
        return (x + y + z);
    }
    float sum(float p, float q){
        return (p + q);
    }
    

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.sum(5, 4));
        System.out.println(obj.sum(10.25f, 5.50f));
        System.out.println(obj.sum(10,20,40));
    }
}
