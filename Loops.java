class Loops
{
    public static void main(String[] args) {
        System.out.println("using for loop");
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }

        System.out.println("using for each loop");
        String[] fruits = {"apple","banana","mango","watermelon","orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("using while loop");
        int end=10;
        while(end>0)
        {
            System.out.println(end);
            end--;
        }


        System.out.println("using do while loop");
        int start = 0;
        do
        {
            System.out.println(start);
            start++;
        }while(start<=10);

    }
}