package lists;

import java.util.Objects;

public class SimpleLinkedList {
    //reference to the first element
    private Node head;
    private long size;

   //constructor
    public SimpleLinkedList(long ... args){
        if(args!= null){
            for(int i = 0; i < args.length; i++){
                this.insert(args[i]);
            }
        }
        else {
            this.head = null;
        }
    }
    //check for emptyness of list
    public boolean isEmpty(){
        return (this.head == null);
    }
    //insert element(node)
    public void insert(long data){
        Node node = new Node(data);
        if(!Objects.isNull(head))
            node.next = head;
        head = node;
        size++;

    }
    //delete element
    public Node delete() throws NullPointerException{
        if(Objects.isNull(this.head))
            throw new NullPointerException();
        else
        {
            Node tmp = head;
            head = head.next;
            size--;
            return tmp;
        }
    }
    // display entire List
    public void display(){
        Node current = head;
        while(current != null){
            System.out.println(current.getData());
            current = current.next;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleLinkedList list = (SimpleLinkedList) o;
        return size == list.size && Objects.equals(head, list.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, size);
    }
}

