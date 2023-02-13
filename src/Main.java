public class Main {
    public static void main(String[] args) {
        DoubleLL l = new DoubleLL();
        l.addLast("spha");
        l.addLast("kunene");
        l.addLast("geeks");
        l.addLast("learning");

        l.display();
        System.out.println("the size of the list is : "+l.size());
    }
}