package stackAndQueue.Queue;

public class QueueImplLinkedlist {

    public static void main(String[] args) {
        QueueImpl ql = new QueueImpl();
        ql.enqueue(2);
        ql.enqueue(3);
        ql.enqueue(4);

        ql.dequeue();

        ql.printLinkedList();
    }

}

class QueueImpl {
    private QueueNode first;
    private QueueNode last;
    private int length;

    public QueueImpl(){
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public Integer peek() {
        if(isEmpty()){
            System.out.println("no item in queue");
            return null;
        }
        else{
            return this.first.getValue();
        }
    }

    public void enqueue(int value) {
        if(this.length == 0){
            this.first = new QueueNode(value);
            this.last = this.first;
        }
        else{
            QueueNode newNode = new QueueNode(value);
            this.last.setNext(newNode);
            this.last = newNode;
        }
        this.length++;
    }

    public void dequeue() {
        if(this.length == 1){
            this.last = null;
        }

        if(isEmpty()){
            System.out.println("nothing to remove from queue");
        }
        else{
            QueueNode nodeToRemove = this.first;
            QueueNode newNodeHead = nodeToRemove.getNext();
            this.first = newNodeHead;
        }
        this.length--;
    }

    public void printLinkedList(){
        QueueNode currentNode = this.first;
        while (currentNode != null){
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

    public boolean isEmpty(){
        return this.length == 0;
    }

}

class QueueNode {
    private int value;
    private QueueNode next;

    public QueueNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}
