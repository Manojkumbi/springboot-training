

@FunctionalInterface
interface MyInterface {
    public void m1();
}

public class myapp1 {

    public static void main(String[] args) 
    {
     MyInterface p=   () -> System.out.println("m2 method");
     p.m1();
    }

}
