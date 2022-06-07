package linkedlist;

public class MyNode<N> implements INode<N> {
    private INode next;
    private N key;

    public MyNode(N key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public N getKey() {
        return key;
    }

    @Override
    public void setKey(N key) {
        this.key = key;
    }

    public INode<N> getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;

    }

    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
    }
}
