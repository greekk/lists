package lists;

import java.util.Objects;

public class DoubleLinkedList {
    private Node begin;
    private Node end;
    private long size;

    public DoubleLinkedList() {
        this.begin = null;
        this.end = null;
    }

    public long getSize(){
        return this.size;
    }

    public void decreaseSize() throws OutOfNullException {
        if(this.size!=0)
            this.size--;
        else
            throw new OutOfNullException("Out of null!!!");
    }

    //Check the List for emptyness
    public boolean isEmpty(){ return Objects.isNull(this.begin ); }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null || this.getClass() != o.getClass())
            return false;
        DoubleLinkedList list = (DoubleLinkedList)o;
        return size == list.size && Objects.equals(begin, list.begin) && Objects.equals(end, list.end);
    }

    @Override
    public int hashCode(){
        return Objects.hash(begin, end, size);
    }

    public void forward(){
        Node current = this.begin;
        while(current!=null){
            System.out.println(current.Data);
            current = current.next;
        }
    }

    public void backward() {
        Node current = this.end;
        while (current != null) {
            System.out.println(current.Data);
            current = current.previous;
        }
    }
    //first insert in the List
    private void insertFirst(long data){
        Node node = new Node(data);
        this.begin = node;
        this.end = node;
    }
    //insert node in to begin of the List
    public void insertBegin(long data){
        Node node = new Node(data);
        if(this.isEmpty()) {
            this.insertFirst(data);

        }
        else{
            this.begin.previous = node;
            node.next = this.begin;
            this.begin = node;
        }
        size++;
    }
    //insert Node in to end of the List
    public void insertEnd(long data){
        Node node = new Node(data);
        if(this.isEmpty()) {
            this.insertFirst(data);
        }
        else{
            this.end.next = node;
            node.previous = this.end;
            this.end = node;
        }
        size++;
    }
    //insert after current position
    public void insertAfter( long after, long data){
        Node node = new Node(data);
        if(this.isEmpty()|| after == 0) {
            this.insertFirst(data);
        }
        else if(after >= size) { //if new Node inserted in the end of list
            this.insertEnd(data);
        }
        else{
            Node current = begin;
            for(int i = 0; i < after; i++)
                current = current.next;
            node.next = current.next;
            current.next.previous = node;
            node.previous = current;
            current.next = node;
        }
        size++;
    }

    /*Deleting*/
    public void deleteBegin(){
        try{
            if(!this.isEmpty()){
                this.begin = this.begin.next;
                size--;
            }
            else
                throw new WorkWithEmptyList("there is an empty list!!");
        } catch (WorkWithEmptyList e) {
            e.getMessage();
        }
    }

    public void deleteEnd(){
        try{
            if(!this.isEmpty()){
                this.end = this.end.previous;
                size--;
            }
            else
                throw new WorkWithEmptyList("there is an empty list!!");
        }catch (WorkWithEmptyList e) {
            e.getMessage();
        }
    }

    public Node getBegin(){
        return this.begin;
    }
    public Node getEnd(){
        return this.end;
    }

    public ListIterator getIterator(){
        return new ListIterator(this);
    }

    public void increaseSize() {
        this.size++;
    }
}
