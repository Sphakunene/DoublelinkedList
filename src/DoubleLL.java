public class DoubleLL {

    public int size=0;
    Node<String> head;
    Node<String> tail;
public DoubleLL(){};
    public void addFirst(String e){
        Node<String> newNode = new Node<>(e);
        Node<String> temp;
        if(head == null){
            head=newNode;
            tail = newNode;
        }
        else{

            newNode.next =head;
            head = newNode;
        }
        size++;
    }
    public void addLast(String e){
        Node<String> newNode = new Node<>(e);

        if(head == null){
            head = newNode;
            tail =newNode;
        }
        else{
            tail.next =newNode;
            tail = newNode;
        }

        size++;
    }
    public void display(){
        Node<String> current = head;
        while(current != null){
            System.out.println(current.e);
            current=current.next;
        }
    }

    public int size(){
        return size;
    }
}
