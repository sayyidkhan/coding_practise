package datastructure.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTree {

    public static void main(String[] args) {

        BST bst = new BST();
        bst.insert(9);
        bst.insert(4);
        bst.insert(20);
        bst.insert(1);
        bst.insert(6);
        bst.insert(15);
        bst.insert(170);

        bst.remove(170);

        bst.printTree();
    }

}



//     9
//  4     20
//1  6  15

class BST {
    BSTNode bstNode;

    public BSTNode getBstNode() {
        return bstNode;
    }

    public BST() {
        this.bstNode = null;
    }

    public void insert(int value) {
        if(this.bstNode == null){
            this.bstNode = new BSTNode(value);
        }
        else{
            BSTNode currentNode = this.bstNode;
            BSTNode newNode = new BSTNode(value);
            while(true){
                String validate = currentNode.getValue() > newNode.getValue() ? "left" : "right";
                BSTNode bottomNode = validate == "left" ? currentNode.getLeft() : currentNode.getRight();

                //while not empty, update the node
                if(bottomNode != null){
                    currentNode = bottomNode;
                }
                //while empty
                else{
                    if (validate == "left") {
                        currentNode.setLeft(newNode);
                    }
                    else {
                        currentNode.setRight(newNode);
                    }
                    return;
                }

            }
        }
    }

    public boolean lookup(int value){
        return lookUpBstNode(value) != null;
    }

    private BSTNode lookUpBstNode(int value) {
        if(this.bstNode == null){
            System.out.println("the binary search tree is empty");
            return null;
        }
        else{
            BSTNode currentNode = this.bstNode;
            while (currentNode != null){
                //check the current node, if the value exist
                if(value == currentNode.getValue()){
                    //if manage to find, return true
                    return currentNode;
                }

                //value is less < go left
                if(value < currentNode.getValue()){
                    currentNode = currentNode.getLeft() == null ? null : currentNode.getLeft();
                }
                //value is more > go right
                else{
                    currentNode = currentNode.getRight() == null ? null : currentNode.getRight();
                }
            }
            return null;
        }
    }

    public boolean remove(int value){
        if (this.bstNode == null) {
            return false;
        }
        BSTNode currentNode = this.bstNode;
        BSTNode parentNode = null;
        while(currentNode != null){
            if(value < currentNode.getValue()){
                parentNode = currentNode;
                currentNode = currentNode.getLeft();
            } else if(value > currentNode.getValue()){
                parentNode = currentNode;
                currentNode = currentNode.getRight();
            } else if (currentNode.getValue() == value) {
                //We have a match, get to work!

                //Option 1: No right child:
                if (currentNode.getRight() == null) {
                    if (parentNode == null) {
                        this.bstNode = currentNode.getLeft();
                    } else {

                        //if parent > current value, make current left child a child of parent
                        if(currentNode.getValue() < parentNode.getValue()) {
                            parentNode.setLeft(currentNode.getLeft());

                            //if parent < current value, make left child a right child of parent
                        } else if(currentNode.getValue() > parentNode.getValue()) {
                            parentNode.setRight(currentNode.getLeft());
                        }
                    }

                    //Option 2: Right child which doesnt have a left child
                } else if (currentNode.getRight().getLeft() == null) {
                    currentNode.getRight().setLeft(currentNode.getLeft());
                    if(parentNode == null) {
                        this.bstNode = currentNode.getRight();
                    } else {

                        //if parent > current, make right child of the left the parent
                        if(currentNode.getValue() < parentNode.getValue()) {
                            parentNode.setLeft(currentNode.getRight());

                            //if parent < current, make right child a right child of the parent
                        } else if (currentNode.getValue() > parentNode.getValue()) {
                            parentNode.setRight(currentNode.getRight());
                        }
                    }

                    //Option 3: Right child that has a left child
                } else {

                    //find the Right child's left most child
                    BSTNode leftmost = currentNode.getRight().getLeft();
                    BSTNode leftmostParent = currentNode.getRight();
                    while(leftmost.getLeft() != null) {
                        leftmostParent = leftmost;
                        leftmost = leftmost.getLeft();
                    }

                    //Parent's left subtree is now leftmost's right subtree
                    leftmostParent.setLeft(leftmost.getRight());
                    leftmost.setLeft(currentNode.getLeft());
                    leftmost.setRight(currentNode.getRight());

                    if(parentNode == null) {
                        this.bstNode = leftmost;
                    } else {
                        if(currentNode.getValue() < parentNode.getValue()) {
                            parentNode.setLeft(leftmost);
                        } else if(currentNode.getValue() > parentNode.getValue()) {
                            parentNode.setRight(leftmost);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void printTree(){
        //this is how to call your printer
        BstPrinter.printNode(this.bstNode);
    }

    public BSTNode traverse(BSTNode bstNode) {
        BSTNode tree = new BSTNode(bstNode);
        BSTNode leftTree = bstNode.getLeft() == null ? null : traverse(bstNode);
        tree.setLeft(leftTree);
        BSTNode rightTree = bstNode.getRight() == null ? null : traverse(bstNode);
        tree.setRight(rightTree);
        return tree;
    }

}

class BSTNode {
    private BSTNode left;
    private BSTNode right;
    private int value;

    public BSTNode(BSTNode bstNode){
        this(bstNode.left,bstNode.right,bstNode.value);
    }

    public BSTNode(int value){
        this(null,null,value);
    }

    public BSTNode(BSTNode left, BSTNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

}

//the printer
class BstPrinter {

    public static <T extends Comparable<?>> void printNode(BSTNode root) {
        int maxLevel = BstPrinter.maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static <T extends Comparable<?>> void printNodeInternal(List<BSTNode> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || BstPrinter.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BstPrinter.printWhitespaces(firstSpaces);

        List<BSTNode> newNodes = new ArrayList<BSTNode>();
        for (BSTNode node : nodes) {
            if (node != null) {
                System.out.print(node.getValue());
                newNodes.add(node.getLeft());
                newNodes.add(node.getRight());
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            BstPrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                BstPrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    BstPrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).getLeft() != null)
                    System.out.print("/");
                else
                    BstPrinter.printWhitespaces(1);

                BstPrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).getRight() != null)
                    System.out.print("\\");
                else
                    BstPrinter.printWhitespaces(1);

                BstPrinter.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static <T extends Comparable<?>> int maxLevel(BSTNode node) {
        if (node == null)
            return 0;

        return Math.max(BstPrinter.maxLevel(node.getLeft()), BstPrinter.maxLevel(node.getRight())) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}

// credits for the printer
// https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram