import java.util.Iterator;

public class CustomList<T> implements Iterable<Node<User>> {
    private Node<User> first;
    private Node<User> last;

    public CustomList() {
        first = last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(T data) {
        Node<User> tempo = new Node<User>();
        tempo.setData((User) data);
        tempo.setNext(null);

        if (first == null) {
            tempo.setPrev(null);
            first = last = tempo;
        } else {
            tempo.setPrev(last);
            last.setNext(tempo);
            last = tempo;
        }
    }

    @Override
    public Iterator<Node<User>> iterator() {
        return new LinkedList<User>(first);
    }
}