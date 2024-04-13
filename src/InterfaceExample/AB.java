package InterfaceExample;

public class AB implements A,B{


    @Override
    public void printable() {
        System.out.println("multiple Interface");
    }


    @Override
    public void scanable() {

    }
    public static void main(String[] args) {
     AB ab = new AB();
     ab.printable();
     ab.scanable();
    }
}
