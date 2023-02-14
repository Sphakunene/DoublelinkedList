public class Main {
    public static void main(String[] args) {
        DoubleLL l = new DoubleLL();
        l.addFirst("spha");
        l.addFirst("kunene");
        l.addFirst("geeks");
        l.addFirst("learning");

        l.display();
        System.out.println("the size of the list is : "+l.size());
        l.addByPos(4, "riverside");
        l.display();
        System.out.println("the size of the list is : "+l.size());
    }
}