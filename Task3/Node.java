public class Node<T> {
    private Node<User> next;
    private Node<User> prev;
    private T data;

    public Node<User> getNext() {
        return next;
    }

    public Node<User> getPrev() {
        return prev;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node<User> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrev(Node<User> prev) {
        this.prev = prev;
    }

}