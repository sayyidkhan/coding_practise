package datastructure.stackAndQueue.stack.linkedlist;


public class StackImplLinkedList {

    public static void main(String[] args) {
        LinkedListStack ls = new LinkedListStack();
        ls.push(2);
        ls.push(3);
        ls.push(4);

        int peek = ls.peek();
        System.out.println("currently peeking:" + peek);
        ls.pop();
        ls.pop();

        ls.printLinkedList();
    }

}

class LinkedListStack {
    public LinkedListStackNode top;
    public LinkedListStackNode bottom;
    private int length;

    public LinkedListStack() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public Integer peek() {
        if(isEmpty()){
            System.out.println("stack is empty");
            return null;
        }
        else{
            return this.top.getValue();
        }
    }

    public void push(int value) {
        if(isEmpty()){
            this.top = new LinkedListStackNode(value);
            this.bottom = this.top;
        }
        else{
            LinkedListStackNode newNode = new LinkedListStackNode(value);
            newNode.setNext(this.top);
            this.top = newNode;
        }
        this.length++;
    }

    public void pop() {
        //assign to null when there is nothing else to remove
        if(this.length == 1){
            this.bottom = null;
        }

        if(isEmpty()){
            System.out.println("nothing to pop");
        }
        else{
            LinkedListStackNode nextNode = this.top.getNext();
            this.top = nextNode;
        }
        this.length--;
    }

    public void printLinkedList(){
        LinkedListStackNode currentNode = this.top;
        while (currentNode != null){
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

    public boolean isEmpty(){
        return this.length == 0;
    }


}

class LinkedListStackNode {
    private int value;
    private LinkedListStackNode next;

    public LinkedListStackNode(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedListStackNode getNext() {
        return next;
    }

    public void setNext(LinkedListStackNode next) {
        this.next = next;
    }
}
