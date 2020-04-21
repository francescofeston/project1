import java.util.*;

class SkippingIterator<T> implements Iterator<T> {
    private List<T> list;
    private int currentPosition;
    private static int skipBy;
    private int skip;

    public SkippingIterator(List<T> l) {

        this(l, 2);
    }
    public SkippingIterator(List<T> l, int skip) {

        this(l, skipBy, 0);
    }
    public SkippingIterator(List<T> l, int skip, int startPosition) {
        list = l;
        skipBy = skip;
        currentPosition = startPosition;
    }
    public boolean hasNext() {
        return currentPosition < list.size();
    }
    public T next() {
        T result = list.get(currentPosition);
        currentPosition += skip;
        return result;
    }
}