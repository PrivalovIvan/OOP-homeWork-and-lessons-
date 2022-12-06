
import java.util.Iterator;

public class LinkedList<T> implements Iterator<Node<User>> {
    private Node<User> current;

    public LinkedList(Node<User> first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node<User> next() {
        Node<User> tempo = current;
        current = current.getNext();
        return tempo;
    }

}