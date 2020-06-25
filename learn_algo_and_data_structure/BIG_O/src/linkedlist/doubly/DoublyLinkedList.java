package linkedlist.doubly;


public class DoublyLinkedList {

    public static void main(String[] args) {
        MyDoublyLinkedList myLinkedList = new MyDoublyLinkedList(10);
        myLinkedList.prepend(1);
        myLinkedList.prepend(2);
        myLinkedList.append(3);


        myLinkedList.insert(2,20);
        myLinkedList.removeIndex(4);
        myLinkedList.removeTail();
        myLinkedList.removeIndex(0);
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

    public void removeTail(){
        Node currentNode = this.head;
        while (currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        Node headNode = currentNode.getPrevious();
        Node nodeToDelete = currentNode;

        //1. nodeToDelete set Head to null
        nodeToDelete.setPrevious(null);

        //2. headNode set tail to null
        headNode.setNext(null);
        this.tail = headNode;
        this.length--;
    }

    public void removeHead(){
        if(this.head == null){
            System.out.println("head is null");
        }
        this.head = this.head.getNext();
        this.head.setPrevious(null);
        this.length--;
    }

    public void removeIndex(int index){
        if(index == this.length - 1){
            removeTail();
        }
        else if(index == 0){
            removeHead();
        }
        else{
            Node prevNode = traverseToIndex(index - 1);
            Node nodeToDelete = prevNode.getNext();
            Node nodeToReplace = nodeToDelete.getNext();

            //1. updating the head with the replacementNode
            prevNode.setNext(nodeToReplace);
            //2. updating the tail with the prevNode
            nodeToReplace.setPrevious(prevNode);
            this.length--;
        }
    }

    public void insert(int index,Object value){
        //zero based indexing insert
        if(index == 0){
            prepend(value);
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

            //2. update tailNode head to the newNode
            tailNode.setPrevious(newNode);

            //3. set the head next to the newNode
            headNode.setNext(newNode);

            //4. set the newNode head to the old headNode
            newNode.setPrevious(headNode);

            this.length++;
        }
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

