package linkedlist;

public interface INode<N> {
    N getKey();
    void setKey(N key);

    INode getNext();
    void setNext(INode next);
}
