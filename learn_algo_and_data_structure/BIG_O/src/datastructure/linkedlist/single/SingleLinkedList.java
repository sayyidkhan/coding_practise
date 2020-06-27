package datastructure.linkedlist.single;

public class SingleLinkedList {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.append(1);
        myLinkedList.append(2);

        System.out.println("normal");
        myLinkedList.printLinkedList();

        System.out.println();

        System.out.println("reversed");
        myLinkedList.reverseTimeAndSpaceOptimised();
        myLinkedList.printLinkedList();

        //expected result
//        normal
//        10
//        1
//        2
//
//        reversed
//        2
//        1
//        10

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

    public void reverse(){
        if(this.length <= 1){
            System.out.println("nothing to reverse");
        }
        else{
            MyLinkedList reverseList = new MyLinkedList(this.head.getValue()); // O(1)

            Node currentNode = this.head;
            while(currentNode.getNext() != null){ // O(n)
                currentNode = currentNode.getNext(); // O(1)
                reverseList.preprend(currentNode.getValue()); // O(1)
            }

            this.head = reverseList.head; // O(1)
            this.tail = reverseList.tail; // O(1)
            this.length = reverseList.length; // O(1)
            //O(n) operation
        }
    }

    public void reverseTimeAndSpaceOptimised(){
        if(this.length <= 1){
            System.out.println("nothing to reverse");
        }
        else{
             Node prev = null;
             Node current = this.head;
             Node next = null;
             while (current != null){
                 //1. get the nextNode from the currentNode
                 //we have to grab it first because in the next step
                 // we are going to lose the pointer

                 next = current.getNext();
                 //2. set the currentNode to the previousNode
                 //we are basically now connecting the node in reverse

                 current.setNext(prev);
                 //3. move the current in the previousNode
                 //now the currentNode have served its purpose,
                 // and we move it into the previous,
                 // to be assigned as a previous node in the next iteration

                 prev = current;
                 //4. move the next into the current so
                 // that the loop can keep on iterating
                 //we need to continue iterating, by assigning next
                 // to current the loop can continue to iterate

                 current = next;
             }
             //5. assign the head to the tail
             this.tail = this.head;
             //6. assign the end of the datastructure.linkedlist to the head
             this.head = prev;
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

