package lists;

public class Node {
    public long Data;
    public Node next;
    public Node previous;

    public Node(long data){
        this.Data = data;
        this.next = null;
        this.previous = null;
    }

    public long getData(){
        return this.Data;
    }

}
