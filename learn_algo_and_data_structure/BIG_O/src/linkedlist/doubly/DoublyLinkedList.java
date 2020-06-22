package linkedlist.doubly;


public class DoublyLinkedList {

    public static void main(String[] args) {
        MyDoublyLinkedList myLinkedList = new MyDoublyLinkedList(10);
        myLinkedList.prepend(1);
        myLinkedList.prepend(2);

        myLinkedList.printLinkedList();
    }

}

class MyDoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public MyDoublyLinkedList(Object value) {
        this.head = new Node(value);
        this.tail = this.head;
        this.length++;
    }

    public void append(Object value){
        Node node = new Node(value);
        node.setPrevious(this.tail);
        //1.set the new node the previous node pointer
        this.tail.setNext(node);
        //2.set the new node to the old node
        this.tail = node;
        this.length++;
    }

    public void prepend(Object value){
        Node newNode = new Node(value);
        newNode.setNext(this.head);
        this.head = newNode;
        this.length++;
    }

    public void printLinkedList(){
        Node currentNode = this.head;
        int counter = 0;
        while (currentNode != null){
            System.out.print("index: " + counter + ", ");
            System.out.print("value: " + currentNode.getValue().toString() + " ");
            System.out.println();
            currentNode = currentNode.getNext();
            counter++;
        }
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
    private Node previous;

    public Node(Object value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public Object getValue() {
        return value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
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

