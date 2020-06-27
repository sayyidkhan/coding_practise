package datastructure.stackAndQueue.stack.array;


import java.util.ArrayList;

public class StackImplArrayForm {

    public static void main(String[] args) {
        StackImplArray sa = new StackImplArray();
        sa.push(2);
        sa.push(3);
        sa.push(4);

        sa.pop();
        System.out.println("peeking: " + sa.peek());
        sa.printList();
    }

}

class StackImplArray {
    private ArrayList<StackNode> stackNodes;

    public StackImplArray() {
        this.stackNodes = new ArrayList<>();
    }

    public int peek(){
        return stackNodes.get(0).getValue();
    }

    public void push(int value){
        stackNodes.add(0,new StackNode(value));
    }

    public void pop(){
        stackNodes.remove(0);
    }

    public void printList(){
        stackNodes.forEach((item) -> {
            System.out.println(item.getValue());
        });
    }

}

class StackNode {
    private int value;

    public StackNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}


