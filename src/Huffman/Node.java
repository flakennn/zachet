package Huffman;

public class Node {
    private Character ch;
    private int frequency;
    private Node left = null;
    private Node right = null;

    public Node(Character ch, int frequency){
        this.ch = ch;
        this.frequency = frequency;
    }

    public int getFrequency() {return frequency;}
    public Character getCh() {return ch;}
    public Node getLeft() {return left;}
    public Node getRight() {return right;}

    public boolean isLeaf(){return this.left == null && this.right == null;}

    public void setLeft(Node left) {this.left = left;}
    public void setRight(Node right) {this.right = right;}
}