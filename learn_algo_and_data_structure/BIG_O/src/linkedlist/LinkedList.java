package linkedlist;

public class LinkedList {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.append(1);
        myLinkedList.append(2);

        myLinkedList.preprend(3);
        myLinkedList.insert(2,22);
        
        myLinkedList.removeIndex(1);
        myLinkedList.removeTail();
        myLinkedList.removeTail();

        myLinkedList.printLinkedList();
        System.out.println(myLinkedList.toString());
    }

}

class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(Object value){
        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;
    }

    public void append(Object value){
        Node newNode = new Node(value);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.length++;
    }

    public void removeTail(){
        removeIndex(this.length - 1);
    }

    public void preprend(Object value){
        Node newNode = new Node(value);
        newNode.setNext(this.head);
        this.head = newNode;
        this.length++;
    }

    public void removeHead(){
        if(this.head == null){
            System.out.println("head is null");
        }
        this.head = this.head.getNext();
        this.length--;
    }


    public void printLinkedList(){
        Node currentNode = this.head;
        while (currentNode != null){
            System.out.println(currentNode.getValue().toString());
            currentNode = currentNode.getNext();
        }
    }

    public void insert(int index,Object value){
        //zero based indexing insert
        if(index == 0){
            preprend(value);
            return;
        }
        else if(index >= this.length - 1){
            append(value);
            return;
        }
        else{
            //if index is > 0 and < this.length
            Node headNode = traverseToIndex(index - 1);
            Node tailNode = headNode.getNext();

            //1. set the tail to the newNode
            Node newNode = new Node(value);
            newNode.setNext(tailNode);

            //2. set the head next to the newNode
            headNode.setNext(newNode);

            this.length++;
        }
    }

    public void removeIndex(int index){
        Node prevNode = traverseToIndex(index - 1);
        Node node = prevNode.getNext();
        Node remainingNodes = node.getNext();

        prevNode.setNext(remainingNodes);
        this.length--;
    }

    public Node traverseToIndex(int index){
        if(index == 0){
            return this.head;
        }
        if (index == this.length - 1) {
            return this.tail;
        }
        //traversing using 0 based indexing
        int counter = 1;
        Node node = this.head.getNext(); //gets the first head
        while (counter != index){
            node = node.getNext(); //gets the subsequent heads
            counter++;
        }
        return node;
    }

    @Override
    public String toString() {
        return String.format("MyLinkedList {%n" +
                "head: %s,%n" +
                "tail: %s,%n" +
                "length: %s%n" +
                "}",
                this.head,
                this.tail,
                this.length);
    }
}

class Node {
    private Object value;
    private Node next;

    public Node(Object value) {
        this.value = value;
        this.next = null;
    }

    public Object getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {

        return String.format("{value: %s, next: %s}",value.toString(),next != null ? next.toString() : "null");
    }
}

