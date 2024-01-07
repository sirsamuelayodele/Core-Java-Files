package FirstFolder;

class First
{
    public int add(int a, int b){
        return a+b;
    }
}

class Second
{
    public int add(int a, int b){
        return a+b;
    }
    
}

public class Polymorphism {
    public static void main(String[] args)
    {
        First obj = new First();
        int c= obj.add(2,7);

        System.out.println(c);

    }
}
