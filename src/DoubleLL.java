public class DoubleLL {

    private int size = 0;
    Node<String> head;
    Node<String> tail;

    public DoubleLL() {
    };

    public void addFirst(String e) {
        Node<String> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.previous = null;
        } else {

            newNode.next = head;
            head.previous = newNode;
            head = newNode;

        }
        size++;
    }

    public void addLast(String e) {
        Node<String> newNode = new Node<>(e);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;

        }

        size++;
    }

    public void display() {
        Node<String> current = head;
        while (current != null) {
            System.out.println(current.e);
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public void deleteByPos(int index) {
        if (index >= size) {
            System.out.println("Invalid position");
        } else if (index == 0) {
            head = head.next;
        } else {
            Node<String> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public void addByPos(int index, String e) {
        if (index == 0) {
            this.addFirst(e);
        } else {

            Node<String> newNode = new Node<String>(e);
            Node<String> current = head;
            Node<String> temp;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            temp = current.next;
            current.next = newNode;
            newNode.previous = current;
            newNode.next = temp;
        }
        size++;

    }

    public void deleteFirst() {

        Node<String> temp = head.next;
        head = temp;
        head.next = temp.next;

        size--;
    }

    public void deleteLast() {

        Node<String> temp = tail.previous;
        tail = temp;
        tail.previous = temp.previous;
        tail.next = null;
        size--;
    }

    public String search(String item) {
        int totIteration = 0;
        int forIteration = 0;
        int backIteration = 0;

        Node<String> forward = head;
        Node<String> backward = tail;
        if (forward.e == item || backward.e == item) {
            totIteration = 0;
            System.out.println("the total iteration is " + totIteration);
            return item;
        } else {

            Node<String> nodeptr = head;
            // iteration counter
            int headIndex = 0;

            while (nodeptr != null) {

                if (nodeptr.e.compareTo(item) == 0)
                    break;

                nodeptr = nodeptr.next;
                headIndex++;
            }

            System.out.println("from head it took " + headIndex + " iterations");

            nodeptr = tail;
            // iteration counter
            int tailIndex = 0;

            while (nodeptr != null) {

                if (nodeptr.e.compareTo(item) == 0)
                    break;

                nodeptr = nodeptr.previous;
                tailIndex++;
            }

            System.out.println("from head it took " + tailIndex + " iterations");

        }

    }
}
