public class DoubleLL {

    private int size=0;
    Node<String> head;
    Node<String> tail;
public DoubleLL(){};

    public void addFirst(String e){
        Node<String> newNode = new Node<>(e);
        if(head == null){
            head=newNode;
            tail = newNode;
            head.previous=null;
        }
        else{

            newNode.next =head;
            head.previous=newNode;
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
            tail.previous=tail;
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

    public void deleteByPos(int index){
        if(index>=size){
            System.out.println("Invalid position");
        }
        else if(index== 0){
            head = head.next;
        }
        else{
            Node<String> current = head;
            for(int i =0; i<index-1;i++){
                current = current.next;
            }
            current.next = current.next.next;
          }
          size--;
    }

    public void addByPos(int index,String e){
        if(index==0){
            this.addFirst(e);
        }
        else{

              Node<String> newNode = new Node<String>(e);
              Node<String> current=head;
              Node<String> temp;
              for (int i=0;i<index-1;i++){
                    current = current.next;
              }
              temp =current.next; 
              current.next =newNode;
              newNode.next = temp;
            }
            size++;

    }
}
